package org.example;
import java.io.*;

public class TaskTwo {
public static void ExecuteTask() {
    int fuelCapacity = 0;
    int cargoWeight = 0;
    int distanceAtoB = 0;
    int distanceBtoC = 0;

    String filePath = "data.txt";

    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
        fuelCapacity = Integer.parseInt(reader.readLine());
        cargoWeight = Integer.parseInt(reader.readLine());
        distanceAtoB = Integer.parseInt(reader.readLine());
        distanceBtoC = Integer.parseInt(reader.readLine());
    } catch (IOException | NumberFormatException ex) {
        ex.printStackTrace();
    }
    System.out.printf("Fuel capacity: %d, ", fuelCapacity);
    System.out.printf("Cargo weight: %d, ", cargoWeight);
    System.out.printf("Distance to B: %d,",  distanceAtoB);
    System.out.printf("Distance to C: %d,", distanceBtoC);

    int fuelConsumption = 0;

    if (cargoWeight < 500) {
        fuelConsumption = 1;
    } else if (cargoWeight < 1000) {
        fuelConsumption = 4;
    } else if (cargoWeight < 1500) {
        fuelConsumption = 7;
    } else if (cargoWeight < 2000) {
        fuelConsumption = 9;
    } else {
        throw new IllegalArgumentException("Plane cannot lift such weight");
    }

    System.out.printf("Fuel consumption: %d", fuelConsumption);
    int FueltToB = fuelConsumption * distanceAtoB;
    int FueltToC = fuelConsumption * distanceBtoC;
    int totalFuel = FueltToB + FueltToC;
    int toAddFuel = 0;

    if (FueltToB > fuelCapacity)
    {
        System.out.println("The plain can not reach point of refueling");
    }

    if (totalFuel > fuelCapacity)
    {
        toAddFuel = totalFuel - fuelCapacity;
    }
    System.out.printf("You have to refuel %d", toAddFuel);
}
}
