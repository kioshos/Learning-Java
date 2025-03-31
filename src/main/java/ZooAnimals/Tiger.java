package ZooAnimals;

public class Tiger extends Animal {
    public Tiger(String name) {
        super(name, AnimalType.Predator);
    }
    @Override
    public String MakeSound() {
    return "Roaring";
    }

    @Override
    public int FoodAmount() {
        return 9;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
