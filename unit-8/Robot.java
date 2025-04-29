import java.awt.*;

public class Robot
{
    // instance variables - replace the example below with your own
    private Point point;
    private int direction;
    /**
     * Constructor for objects of class Robot
     */
    public Robot(Point point, int direction)
    {
        this.point = point;
        this.direction = direction - 1;
    }
    public void turnLeft(){
        direction--;
        
        //this.direction = ((int) Math.abs(direction)) % 4;
    }
    public void turnRight(){
        direction++;
        
        //this.direction = ((int) Math.abs(direction)) % 4;
    }
    public void move(){
        this.point.translate((int) Math.cos(0.5*Math.PI*this.direction),(int) Math.sin(0.5*Math.PI*this.direction));

    }
    public Point getLocation(){
        return this.point;
    }
    public String getDirection(){
        if (direction%4 == 3){
            return "N";
        } else  if (direction%4 == 0){
            return "E";
        } else if (direction%4 == 1){
            return "S";
        } else {
            return "W";
        }
    }
}