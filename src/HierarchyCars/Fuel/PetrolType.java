package HierarchyCars.Fuel;

import HierarchyCars.Body.VehicleTypeByBodyTypes;
import HierarchyCars.VehicleTypeEnum;

public class PetrolType extends VehicleTypeByFuelTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PETROL.name();
    }
}
