package HouseBuilding.BuildingTeam;

import HouseBuilding.HouseModel.House;
import HouseBuilding.Interfaces.PartImp;
import HouseBuilding.Interfaces.WorkerImp;

public class Worker implements WorkerImp {
   private String name;
   public Worker(String name) {
       this.name = name;
   }
    @Override
    public void work(House house) {
        PartImp[] unbuiltParts = house.getUnbuiltParts();

        if(unbuiltParts.length != 0) {
            PartImp partToBuild = unbuiltParts[0];
            partToBuild.build();
            System.out.println(name + " built: " + partToBuild.getName());
        }
    }
}
