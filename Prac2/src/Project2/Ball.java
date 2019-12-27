package Project2;

public class Ball {
    private double x = 0.0;
    private double y = 0.0;

    public Ball(double x, double y){
        setX(x);
        setY(y);
    }
    public Ball(){ }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y){
        setX(x);
        setY(y);
    }

    public void move(double offsetX, double offsetY){
        x+=offsetX;
        y+=offsetY;
    }

    public String toString() {
        return "Ball is at (" + getX() + ";" + getY() + ").";
    }
}
