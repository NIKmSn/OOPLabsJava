package Project1;

import Project1.Dog;

public class TestDog {

    public static void main(String[] args) {
        Dog mike = new Dog("Mike", 2);
        Dog spike = new Dog("Spike", 5);
        Dog rolly = new Dog("Rolly");
        rolly.setAge(1);

        System.out.println(mike);
        mike.toHumanAge();
        spike.toHumanAge();
        rolly.toHumanAge();
    }
}
