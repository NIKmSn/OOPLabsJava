package Project2;

public class TestBall {
    public static void main(String[] args){
        Ball newBall = new Ball(100,100);
        System.out.println(newBall);
        newBall.move(50,50);
        System.out.println(newBall);
    }
}
