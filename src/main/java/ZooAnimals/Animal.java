package ZooAnimals;

abstract class Animal {
   protected String name;
   protected AnimalType animalType;
   public Animal(String name, AnimalType animalType) {
       this.name = name;
       this.animalType = animalType;
   }
   public abstract String MakeSound();

    public abstract int FoodAmount();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", animalType=" + animalType +
                '}';
    }
}
