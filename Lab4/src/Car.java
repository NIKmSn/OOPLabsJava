public class Car implements IPriceable {
    private double price;
    private int release;

    public void setPrice(double price) {
        this.price = price;
    }
    public void setRelease(int release){
        this.release = release;
    }
    public int getRelease(){
        return release;
    }

    public Car(double price){
        setPrice(price);
    }
    public Car(int release){
        setRelease(release);
    }

    public double getPrice() {
       if (getRelease() <= 1950) {
           return 500;
       }
       return 3000;
    }
}
