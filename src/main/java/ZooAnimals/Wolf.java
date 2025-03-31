package ZooAnimals;

public class Wolf extends Animal {
   public Wolf(String name) {
       super(name,AnimalType.Predator);
   }
    @Override
    public String MakeSound() {
        return "Woof";
    }

    @Override
    public int FoodAmount() {
        return 4;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
