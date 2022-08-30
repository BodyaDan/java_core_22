package second;

public class Vehicle {
    String typeOfVehicle;
    int maxSpeed;

    Vehicle() {
        typeOfVehicle = "Car";
    }

    Vehicle(String type) {
        typeOfVehicle = type;
        maxSpeed = 160;
    }

    Vehicle(int maxSpeed) {
        this();
        this.maxSpeed = maxSpeed;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "typeOfVehicle='" + typeOfVehicle + '\'' +
                '}';
    }
}
