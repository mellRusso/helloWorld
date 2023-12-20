package HierarchyCars.Body;

import HierarchyCars.VehicleTypeEnum;

public class DieselType extends VehicleTypeByBodyTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.DIESEL.name();
    }
}
