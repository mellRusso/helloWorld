package HierarchyCars.Fuel;

import HierarchyCars.VehicleTypeEnum;

public class PickupType extends VehicleTypeByFuelTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PICKUP.name();
    }
}
