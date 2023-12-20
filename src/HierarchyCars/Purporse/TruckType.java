package HierarchyCars.Purporse;

import HierarchyCars.VehicleTypeEnum;

public class TruckType extends VehicleTypeByPurpose {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.TRUCK.name();
    }
}
