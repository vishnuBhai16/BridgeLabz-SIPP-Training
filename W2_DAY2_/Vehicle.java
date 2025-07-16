package W2_DAY2_;
public class Vehicle {
    // Instance Variables
    private String ownerName;
    private String vehicleType;
    // Class Variable
    private static double registrationFee = 500.0; // Default fee for all vehicles
    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance Method: Display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
    }

    // Class Method: Update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

