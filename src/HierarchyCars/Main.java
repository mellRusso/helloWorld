package HierarchyCars;

import HierarchyCars.Body.SedanType;
import HierarchyCars.Body.DieselType;
import HierarchyCars.Fuel.PickupType;
import HierarchyCars.Fuel.PetrolType;
import HierarchyCars.Purporse.PassengerType;
import HierarchyCars.Purporse.TruckType;

public class Main {
    public static void main(String[] args) {
        AdsService adsService = new AdsService();
        VehicleAd volvoAd = new VehicleAd("Volvo", "123", new PassengerType(), new SedanType(), new PetrolType());
        VehicleAd kamazAd = new VehicleAd("Kamaz", "45", new TruckType(), new DieselType(), new PickupType());
        VehicleAd carAd = new VehicleAd("Lambargini", "229", new PassengerType(), new SedanType(), new PetrolType());

        adsService.setAdList(new VehicleAd[]{volvoAd, kamazAd, carAd});
        adsService.filterByVehicleTypeByPurpose(new TruckType());
        adsService.filterByVehicleTypeByFuelTypes(new PickupType());
        adsService.filterByVehicleTypeByFuelTypes(new PetrolType());
    }
}
