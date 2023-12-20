package HierarchyCars;

public class VehicleType {
    public String attribute;

    protected VehicleType(String attribute) {
        this.attribute = attribute;
    }

    public String getAttributeOfType() {
        return attribute;
    }

    public String getTypeName() {
        return "Some vehicle type name";
    }
}
