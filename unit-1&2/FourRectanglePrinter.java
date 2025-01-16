import java.awt.Rectangle;
import java.awt.Point;


public class FourRectanglePrinter
{
    // instance variables - replace the example below with your own
    private int degree = 10;
    private Rectangle rect;
    private Point pnt;
    private int times = 0;
    /**
     * Constructor for objects of class FourRectanglePrinter
     */
    public FourRectanglePrinter()
    {
        rect = new Rectangle(degree, degree, degree, degree);
        
        this.translate(0, 0);
        this.translate(10, 0);
        this.translate(-10, 10);
        this.translate(10, 0);
    }
    
    public Point translate(int x, int y){
        rect.translate(x, y);

        pnt = rect.getLocation();
        System.out.println("Rectangle " + times + ": (" + pnt.x + "," + pnt.y + ")");
        times += 1;
        return pnt;
    }

    
}
