public class Knife extends Dish {
    private String knifeType;

    public void setKnifeType(String knifeType) {
        this.knifeType = knifeType;
    }

    public String getKnifeType() {
        return knifeType;
    }

    public Knife(){
        super();
        setKnifeType("");
    }

    public Knife(String name, String description, double price, String knifeType){
        super(name, description, price);
        setKnifeType(knifeType);
    }

    public void Use(){
        System.out.println("Using " + getName() + " knife.");
    }

    public void GetInformation() {
        System.out.println("Name: " + getName());
        System.out.println("Description: " + getDescription());
        System.out.println("Price: " + getPrice());
        System.out.println("Knife type: " + getKnifeType());
    }
}
