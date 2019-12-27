package Project1;

public class Circle extends Shape{
    protected double radius;

    public Circle()
    {
        super(0,0);
        radius = 0;
    }
    public Circle(int x, int y, double r) {
        super(x,y);
        radius = r;
    }

    public void SetRadius(double r) {
        radius = r;
    }

    public double GetRadius() {
        return radius;
    }

    public double GetDiameter() {
        return radius * 2;
    }
    public double GetLength()
    {
        return 2 * Math.PI * radius;
    }
    public double getArea() {
        return Math.PI  * Math.pow(radius, 2);
    }
}
