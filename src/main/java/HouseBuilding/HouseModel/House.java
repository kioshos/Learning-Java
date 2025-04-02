package HouseBuilding.HouseModel;

import HouseBuilding.Interfaces.PartImp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class House {
    private PartImp[] parts;

    public House() {

        parts = new PartImp[11];
        parts[0] = new Basement();

        for(int i = 1; i < 6; i++) {
            parts[i] = new Window();
        }

        for(int i = 6; i < 10; i++) {
            parts[i] = new Wall();
        }

        parts[10] = new Door();
    }
    public void displayHouseParts() {
        System.out.println("The house consists of: ");
        for(PartImp part : parts) {
            System.out.println(part.getName() + (part.isBuilt() ? " (built)" : (" (not built)")));
        }
    }
    public PartImp[] getUnbuiltParts() {
        List<PartImp> list = new ArrayList<PartImp>();
        for(PartImp part : parts) {
            if(!part.isBuilt()) {
                list.add(part);
            }
        }
        list.sort(Comparator.comparing(PartImp::getPriority));
        return list.toArray(new PartImp[list.size()]);
    }
}
