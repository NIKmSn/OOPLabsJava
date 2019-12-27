public abstract class Dish {
    private String name;
    private String description;
    private double price;

    //Сеттеры
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //Геттеры
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public Dish(){
        setName("");
        setDescription("");
        setPrice(0);
    }
    public Dish(String name, String description, double price){
        setName(name);
        setDescription(description);
        setPrice(price);
    }
    public abstract void GetInformation();

}
