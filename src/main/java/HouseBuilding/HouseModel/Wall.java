package HouseBuilding.HouseModel;

import HouseBuilding.Interfaces.PartImp;

public class Wall implements PartImp {
    boolean isBuilt;
    @Override
    public String getName() {
        return "Wall";
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
        return 2;
    }
}
