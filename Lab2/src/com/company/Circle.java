package com.company;

public class Circle
{
    protected double radius;

    public Circle()
    {
        radius = 0;
    }
    public Circle(double r) {
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

    public double GetArea() {
        return Math.PI  * Math.pow(radius, 2);
    }
}
