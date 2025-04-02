package HouseBuilding.BuildingTeam;

import HouseBuilding.HouseModel.House;
import HouseBuilding.Interfaces.PartImp;
import HouseBuilding.Interfaces.WorkerImp;

import java.util.Arrays;

public class TeamLeader implements WorkerImp {
    @Override
    public void work(House house) {
        System.out.println("\nConstruction report");
        house.displayHouseParts();
        var unbuiltParts = house.getUnbuiltParts();
        if (unbuiltParts.length > 0) {
            System.out.println("The unbuilt parts: " + Arrays.toString(unbuiltParts));
        } else {
            System.out.println("The house is completely built!");
        }
        System.out.println("===========================\n");
    }

}
