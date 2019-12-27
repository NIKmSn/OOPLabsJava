package Lab5;

import java.awt.*;

public class Rectangle extends Shape
{
    public Rectangle(Color color, int x, int y) {
        super(color, x, y);
    }

    @Override
    public void paint(Graphics g){
        g.setColor(getColor());
        g.fillRect(getX(), getY(), 10 + (int) (Math.random() * 70.0D), 10 + (int) (Math.random() * 70.0D));
    }
}
