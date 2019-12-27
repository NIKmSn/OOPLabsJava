package Project4;

public class MovableRectangle implements IMovable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    private boolean isSameSpeed(MovablePoint point1, MovablePoint point2){
        return (point1.xSpeed==point2.xSpeed && point1.ySpeed == point2.ySpeed);
    }
    MovableRectangle(int x1, int y1, int x2, int y2) {

    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }
}
