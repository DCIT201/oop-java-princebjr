public class Main {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();

        // Create vehicles
        Car car = new Car("CAR001", "Benz-c300" , 30.0);
        Truck truck = new Truck(50.0, true, 10.0, "TRK001", "Ford E-Series", 40.0);
        Motorcycle motorcycle = new Motorcycle("MOTO001", "Suzuki", 20.0);

        // Add vehicles to the agency fleet
        agency.addVehicle(car);
        agency.addVehicle(truck);
        agency.addVehicle(motorcycle);

        // Create a customer
        Customer customer = new Customer("CUST001", "My name");

        // Process rentals
        agency.processRental(car, customer, 3);
        agency.processRental(truck, customer, 5);
        agency.processRental(motorcycle, customer, 2);

        // Rental details
        System.out.println("\nRental History for " + customer.getName() + ":");
        for (Vehicle vehicle : customer.getRentalHistory()) {
            System.out.println(vehicle.getModel() + " - Rental Cost: $" + vehicle.calculateRentalCost(5));
        }

        // Return vehicle
        agency.returnVehicle(truck);

        // Availability after return
        System.out.println(
                "\nTruck availability after return: " + (truck.isAvailableForRental() ? "Available" : "Not Available"));

        // Generating a report
        agency.generateReport();
    }
}
