public class Pot extends Dish {
    private String potType;

    public void setPotType(String potType) {
        this.potType = potType;
    }

    public String getPotType() {
        return potType;
    }

    public Pot(){
        super();
        setPotType("");
    }

    public Pot(String name, String description, double price, String potType){
        super(name, description, price);
        setPotType(potType);
    }

    public void ToBoil(){
        System.out.println("Boiling in " + getName() + " pot.");
    }

    public void GetInformation(){
        System.out.println("Name: " + getName());
        System.out.println("Description: " + getDescription());
        System.out.println("Price: " + getPrice());
        System.out.println("Pot type: " + getPotType());
    }


}
