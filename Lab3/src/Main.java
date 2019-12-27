public class Main {

    public static void main(String[] args) {
        Pot pot = new Pot("Pot1", "New pot", 50, "Boiling pot");
        FryingPan pan = new FryingPan("Pan1", "New frying pan", 50, "Frying");
        Spoon spoon = new Spoon("Spoon1", "New spoon", 25, "Table spoon");
        Fork fork = new Fork("Fork1", "New fork", 20, "Dinner fork");
        Knife knife = new Knife("Chef's knife", "New chef's knife", 70, "Chef's knife");

        pot.GetInformation();
        pot.ToBoil();
        System.out.println();

        pan.GetInformation();
        pan.ToFry();
        System.out.println();

        spoon.GetInformation();
        spoon.ToScoop();
        System.out.println();

        fork.GetInformation();
        fork.Use();
        System.out.println();

        knife.GetInformation();
        knife.Use();
        System.out.println();
    }
}
