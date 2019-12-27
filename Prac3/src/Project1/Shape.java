package Project1;

public abstract class Shape {
    private int x;
    private int y;

    Shape(int x, int y)
    {
        setX(x);
        setY(y);
    }

    void setX(int x){this.x = x;}
    public int getX(){return this.x;}

    void setY(int y){this.y = y;}
    public int getY(){return this.y;}

    public abstract double getArea();

}
