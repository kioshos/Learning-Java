package HouseBuilding.HouseModel;

import HouseBuilding.Interfaces.PartImp;

public class Basement implements PartImp {
    boolean isBuilt;
    @Override
    public String getName() {
        return "Basement";
    }

    @Override
    public void build() {
        isBuilt = true;
    }

    @Override
    public boolean isBuilt() {
        return isBuilt;
    }

    @Override
    public int getPriority() {
        return 1;
    }
}
