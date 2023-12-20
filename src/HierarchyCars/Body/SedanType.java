package HierarchyCars.Body;

import HierarchyCars.VehicleTypeEnum;

public class SedanType extends VehicleTypeByBodyTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.SEDAN.name();
    }
}
