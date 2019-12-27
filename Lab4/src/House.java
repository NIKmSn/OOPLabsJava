public class House implements IPriceable {
    private double price;
    private double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public House(double area){
        setArea(price);
    }

    public double getPrice() {
        if (area <= 50){
            return 100000;
        }
        else return 500000;
    }
}
