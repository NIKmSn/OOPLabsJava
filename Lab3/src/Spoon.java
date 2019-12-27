public class Spoon extends Dish {
    private String spoonType;

    public void setSpoonType(String spoonType) {
        this.spoonType = spoonType;
    }

    public String getSpoonType() {
        return spoonType;
    }

    public Spoon(){
        super();
        setSpoonType("");
    }

    public Spoon(String name, String description, double price, String spoonType){
        super(name, description, price);
        setSpoonType(spoonType);
    }

    public void ToScoop(){
        System.out.println("Scooping with " + getName() + " spoon.");
    }

    public void GetInformation() {
        System.out.println("Name: " + getName());
        System.out.println("Description: " + getDescription());
        System.out.println("Price: " + getPrice());
        System.out.println("Pan type: " + getSpoonType());
    }
}
