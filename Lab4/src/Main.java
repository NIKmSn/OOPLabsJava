public class Main {

    public static void main(String[] args) {
        Car car = new Car(1970);
        House house = new House(110);
        Oven oven = new Oven(2000);
        Fridge fridge = new Fridge(2000);

        print(car);
        print(house);
        print(oven);
        print(fridge);
    }

    static void print(IPriceable p) {
        System.out.println("Price: " + p.getPrice());
    }
}
