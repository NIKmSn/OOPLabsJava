package Project2;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public Rectangle(){
        super();
        setWidth(0);
        setLength(0);
    }

    public Rectangle(double width, double length){
        super();
        setWidth(width);
        setLength(length);
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        setWidth(width);
        setLength(length);
    }

    @Override
    public double getArea() {
        return getWidth()*getLength();
    }

    @Override
    public double getPerimeter() {
        return 2 * (getLength() + getWidth());
    }

    @Override
    public String toString() {
        return super.toString() + "\nWidth: "  + getWidth() + "\nLength: "  + getLength() + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
    }
}
