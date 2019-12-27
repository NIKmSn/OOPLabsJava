package Project3;

public class Circle extends Shape {
    protected double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public Circle() {
        super();
        setRadius(0);
    }
    public Circle(double radius){
        super();
        setRadius(radius);
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        setRadius(radius);
    }

    @Override
    public double getArea() {
        return Math.PI  * Math.pow(getRadius(), 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    @Override
    public String toString() {
        return super.toString() + "\nRadius: "  + getRadius() + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
    }
}
