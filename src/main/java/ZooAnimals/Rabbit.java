package ZooAnimals;

public class Rabbit extends Animal {
    public Rabbit(String name) {
        super(name, AnimalType.Herbivore);
    }
    @Override
    public String MakeSound() {
        return "Buzzing";
    }

    @Override
    public int FoodAmount() {
        return 3;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
