public class Fork extends Dish {
    private String forkType;

    public void setForkType(String forkType) {
        this.forkType = forkType;
    }

    public String getForkType() {
        return forkType;
    }

    public Fork(){
        super();
        setForkType("");
    }

    public Fork(String name, String description, double price, String forkType){
        super(name, description, price);
        setForkType(forkType);
    }

    public void Use(){
        System.out.println("Using " + getName() + " fork.");
    }

    public void GetInformation() {
        System.out.println("Name: " + getName());
        System.out.println("Description: " + getDescription());
        System.out.println("Price: " + getPrice());
        System.out.println("Fork type: " + getForkType());
    }
}
