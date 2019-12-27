package Project1;

public class Rectangle extends Shape{
    private double width;
    private double length;

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

    public Rectangle(int x, int y) {
        super(x, y);
    }

    public double getArea() {
        return getWidth()*getLength();
    }

}
