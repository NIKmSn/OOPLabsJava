package Lab5;
import java.awt.*;

public abstract class Shape
{
    private Color color;
    private int x;
    private int y;

    Shape(Color color, int x, int y)
    {
        setColor(color);
        setX(x);
        setY(y);
    }

    void setColor(Color color){this.color = color;}
    public Color getColor(){return this.color;}

    void setX(int x){this.x = x;}
    public int getX(){return this.x;}

    void setY(int y){this.y = y;}
    public int getY(){return this.y;}

    public abstract void paint(Graphics g);
}
