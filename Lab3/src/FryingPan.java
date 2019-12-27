public class FryingPan extends Dish{

    private String panType;

    public void setPanType(String panType) {
        this.panType = panType;
    }

    public String getPanType() {
        return panType;
    }

    public FryingPan()
    {
        super();
        setPanType("");
    }

    public FryingPan(String name, String description, double price, String panType){
        super(name, description, price);
        setPanType(panType);
    }
    public void ToFry(){
        System.out.println("Frying in " + getName() + " pot.");
    }

    public void GetInformation(){
        System.out.println("Name: " + getName());
        System.out.println("Description: " + getDescription());
        System.out.println("Price: " + getPrice());
        System.out.println("Pan type: " + getPanType());
    }
}
