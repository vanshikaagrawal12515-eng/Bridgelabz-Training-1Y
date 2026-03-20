interface VehicleDashboard {

    void displaySpeed();

    default void displayBattery() {
        System.out.println("Battery feature not available.");
    }
}

class ElectricVehicle implements VehicleDashboard {

    public void displaySpeed() {
        System.out.println("Speed: 80 km/h");
    }

    public void displayBattery() {
        System.out.println("Battery: 65%");
    }
}
