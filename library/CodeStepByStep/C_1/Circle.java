package CodeStepByStep.C_1;


public class Circle{
    private double radius;

    public Circle(double r){
        this.radius = r;
    }

    public double area(){
        return Math.PI * radius * radius;
    }

    public double circumference(){
        return 2 * Math.PI * radius;
    }
    
    public double getRadius(){
        return radius;
    }

    public String toString(){
        return String.format("Circle{radius=%s}", radius);
    }

}
