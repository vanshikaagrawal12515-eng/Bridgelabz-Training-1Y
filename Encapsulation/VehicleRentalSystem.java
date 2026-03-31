import java.util.*;

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }
    public abstract double calculateRentalCost(int days);

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    public Car(String vehicleNumber, double rentalRate, String policy) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = policy;
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return getRentalRate() * 0.10;
    }

    public String getInsuranceDetails() {
        return "Car Insurance Policy: " + insurancePolicyNumber;
    }
}

class Bike extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    public Bike(String vehicleNumber, double rentalRate, String policy) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = policy;
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return getRentalRate() * 0.05;
    }

    public String getInsuranceDetails() {
        return "Bike Insurance Policy: " + insurancePolicyNumber;
    }
}
class Truck extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, double rentalRate, String policy) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = policy;
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.5;
    }

    public double calculateInsurance() {
        return getRentalRate() * 0.15;
    }

    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + insurancePolicyNumber;
    }
}
public class VehicleRentalSystem {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("UP21AB1234", 2000, "CAR123"));
        vehicles.add(new Bike("UP21XY5678", 500, "BIKE456"));
        vehicles.add(new Truck("UP21TR9999", 4000, "TRUCK789"));

        int days = 3;

        for (Vehicle v : vehicles) {

            double rentalCost = v.calculateRentalCost(days);
            double insuranceCost = 0;

            System.out.println("Vehicle Number: " + v.getVehicleNumber());
            System.out.println("Vehicle Type: " + v.getType());
            System.out.println("Rental Cost for " + days + " days: " + rentalCost);

            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                insuranceCost = ins.calculateInsurance();
                System.out.println(ins.getInsuranceDetails());
                System.out.println("Insurance Cost: " + insuranceCost);
            }

            System.out.println("---------------------------");
        }
    }
}