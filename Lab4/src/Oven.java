public class Oven implements IPriceable {
    private double price;

    public void setPrice(double price) {
        this.price = price;
    }

    public Oven(double price){
        setPrice(price);
    }


    public double getPrice() {
       return price;
    }
}
