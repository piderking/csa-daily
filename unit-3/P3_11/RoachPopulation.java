package P3_11;


/**
 * Write a description of class RoachPopulation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RoachPopulation
{
    // instance variables - replace the example below with your own
    private int population;

    /**
     * Constructor for objects of class RoachPopulation
     */
    public RoachPopulation(int inital_population)
    {
        // initialise instance variables
        population = inital_population;
    }

    /**
     * doubles the population
     *
     * 
     * 
     */
    public void breed()
    {
        // put your code here
        population *= 2;
    }
    
    /**
     * spray insecticide on the roach population
     * @param percent of population to kill
     */
    public void spray(double percent)
    {
        // put your code here
        population -= Math.floor(population * percent/100);
    }
    
    /**
     * get the population
     * @return the roach population
     */
    public int getPopulation()
    {
        // put your code here
        return population;
    }
    
    
    
    
}
