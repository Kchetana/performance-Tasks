import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class VehicleSet {
    public static void main(String[] args) {
        Set<String> vehicles = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Vehicle Management System");
            System.out.println("1. Add Vehicle Type");
            System.out.println("2. Remove Vehicle Type");
            System.out.println("3. Check if Vehicle Type Exists");
            System.out.println("4. Display All Vehicle Types");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addVehicle(vehicles, scanner);
                case 2 -> removeVehicle(vehicles, scanner);
                case 3 -> checkVehicle(vehicles, scanner);
                case 4 -> displayVehicles(vehicles);
                case 5 -> {
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void addVehicle(Set<String> vehicles, Scanner scanner) {
        System.out.print("Enter vehicle type to add: ");
        String vehicle = scanner.nextLine();
        if (vehicles.add(vehicle)) {
            System.out.println(vehicle + " added successfully.");
        } else {
            System.out.println(vehicle + " already exists.");
        }
    }

    private static void removeVehicle(Set<String> vehicles, Scanner scanner) {
        System.out.print("Enter vehicle type to remove: ");
        String vehicle = scanner.nextLine();
        if (vehicles.remove(vehicle)) {
            System.out.println(vehicle + " removed successfully.");
        } else {
            System.out.println(vehicle + " not found.");
        }
    }

    private static void checkVehicle(Set<String> vehicles, Scanner scanner) {
        System.out.print("Enter vehicle type to check: ");
        String vehicle = scanner.nextLine();
        if (vehicles.contains(vehicle)) {
            System.out.println(vehicle + " is available.");
        } else {
            System.out.println(vehicle + " not found.");
        }
    }

    private static void displayVehicles(Set<String> vehicles) {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicle types available.");
        } else {
            System.out.println("Available Vehicle Types:");
            vehicles.forEach(System.out::println);
        }
    }
}
