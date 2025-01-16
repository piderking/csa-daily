package P3_11;

import P3_11.RoachPopulation;
/**
 * Write a description of class RoachSimulation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RoachSimulation
{
    // instance variables - replace the example below with your own
    private RoachPopulation roaches;

    /**
     * Constructor for objects of class RoachSimulation
     */
    public RoachSimulation()
    {
        // initialise instance variables
        roaches = new RoachPopulation(10);
        
        
        for (int i = 0; i < 3; i++){
        roaches.breed();
        
        roaches.spray(10);
        
        System.out.println("Roaches at " + roaches.getPopulation());
        }
    }

}
