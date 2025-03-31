package ZooAnimals;

public class Kangaroo extends Animal {

   public Kangaroo(String name) {
    super(name, AnimalType.Herbivore);
   }
    @Override
    public String MakeSound() {
        return "Coughing";
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
