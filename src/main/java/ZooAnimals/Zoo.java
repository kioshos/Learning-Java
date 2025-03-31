package ZooAnimals;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals;
    public Zoo() {
        this.animals = new ArrayList<Animal>();
    }
    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }
    public List<Animal> getAnimals() {
        return this.animals;
    }
    public void AnimalSound(Animal animal) {
        System.out.println(animal.MakeSound());
    }

    public int CountPredators(List<Animal> animals) {
        int count = 0;
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).animalType == AnimalType.Predator) {
                count++;
            }
        }
        return count;
    }
    public void CountFoodAmount(List<Animal> animals) {
       int countMeat = 0;
       int countVeggie = 0;
        for(int i = 0; i < animals.size(); i++) {
            if(animals.get(i).animalType == AnimalType.Predator) {
              countMeat += animals.get(i).FoodAmount();
            }
            else {
                countVeggie += animals.get(i).FoodAmount();
            }
        }
        System.out.println("For your zoo you have to get " + countMeat + " meat, " + "and " + countVeggie + " veggies per day");
    }
    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + animals +
                '}';
    }
}
