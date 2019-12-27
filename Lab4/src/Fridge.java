public class Fridge implements IPriceable {
    private double price;

    public void setPrice(double price) {
        this.price = price;
    }

    public Fridge(double price){
        setPrice(price);
    }

    public double getPrice() {
        return price;
    }
}
