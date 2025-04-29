
/**
 * Write a description of class Restroom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Restroom
{
    private int stalls;
    private boolean[] rr;
    private int occupants = 0;
    
    /**
     * Constructor for objects of class Restroom
     */
    public Restroom(int stalls)
    {
        // initialise instance variables
        this.stalls = stalls;
        rr = new boolean [stalls];
    }
    
    public int nextPlace(){
        // amount of place == occupants
        
        if (this.occupants == 0){
            return rr.length / 2 + rr.length % 2;
        } 
        int[] distances = new int[this.occupants];
        int[] starts = new int[this.occupants];
        System.out.println("Occupants: " + this.occupants);
        int distance = 0;
        int place = 0;
       
        
        for (int x = 0; x < rr.length; x++){
            if (rr[x]){
                // if occupied
                
                distances[place] = distance;
                distance = 0; 
                place++;
                starts[place] = x;
            } else {
                // unoccupied increment distance
                distance++;
            
            }
        }
         distances[place] = distance;
        
        System.out.print("Starts : ");
        for (int star : starts){
            System.out.print(star + ", ");

        }
        
        System.out.println();
        
        System.out.print("Distances : ");
        for (int distanc : distances){
            System.out.print(distanc + ", ");

        }
        
        
        int grtDist = 0;
        for (int y = 0; y < this.occupants; y++){
            if (distances[y] > distances[grtDist]){
                grtDist = y;
            }
        }
        int bias = 0;
        if (distances[grtDist] == 3){
            bias = -1;
        }
        System.out.println("Greatest Distance at Index: " + grtDist);
        
       
        return starts[grtDist] + (distances[grtDist] / 2 + distances[grtDist] % 2) + bias;
    }
    
    
    public void addOccupant(){
        //System.out.println(nextPlace());

        this.occupants++;

        rr[nextPlace()] = true;
       
        
    }
    public String getStalls(){
        String str = "";
        
        for (int i = 0; i < rr.length; i++){
            if (rr[i]){
                str += "X";
            }
            else {
                str += "_";
            }
        }
        
        
        
        return str;
    }
}
