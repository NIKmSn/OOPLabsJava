package Lab5;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

class Window extends JFrame {
    Shape[] shapes = new Shape[20];

    Window() {
        super("Window");
        this.setLayout(new FlowLayout());
        this.setSize(1000, 500);
        this.setVisible(true);
    }

    public void arrayFill() {
        for (int i = 0; i < 20; i++) {
            //Случайное целое число в диапазоне [1;2]
            int rnd = (int) (1.0D + Math.random() * 2.0D);
            Random rand = new Random();
            float red = rand.nextFloat();
            float green = rand.nextFloat();
            float blue = rand.nextFloat();
            int x = rand.nextInt(800);
            int y = rand.nextInt(400);
            Color newColor = new Color(red, green, blue);
            switch (rnd) {
                case 1:
                    shapes[i] = new Circle(newColor, x, y);
                    break;
                case 2:
                    shapes[i] = new Rectangle(newColor, x, y);
                    break;
            }
        }
    }

    public void paint(Graphics g) {
        arrayFill();
        for (Shape s : shapes) {
            s.paint(g);
        }
    }

    public static void main(String[] args){
        new Window();
    }
}