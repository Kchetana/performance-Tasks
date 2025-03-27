import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ClubMembers {
    private static ArrayList<String> members = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Club Member Management System");
            System.out.println("1. Add Member");
            System.out.println("2. Delete Member");
            System.out.println("3. List All Members");
            System.out.println("4. Search Member");
            System.out.println("5. Update Member");
            System.out.println("6. Sort Members Alphabetically");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addMember();
                case 2 -> deleteMember();
                case 3 -> listMembers();
                case 4 -> searchMember();
                case 5 -> updateMember();
                case 6 -> sortMembers();
                case 7 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void addMember() {
        System.out.print("Enter member name to add: ");
        String name = sc.nextLine();
        if (!members.contains(name)) {
            members.add(name);
            System.out.println(name + " added successfully.");
        } else {
            System.out.println(name + " is already a member.");
        }
    }

    private static void deleteMember() {
        System.out.print("Enter member name to delete: ");
        String name = sc.nextLine();
        if (members.remove(name)) {
            System.out.println(name + " removed successfully.");
        } else {
            System.out.println(name + " not found.");
        }
    }

    private static void listMembers() {
        if (members.isEmpty()) {
            System.out.println("No registered members.");
        } else {
            System.out.println("Registered Members:");
            members.forEach(System.out::println);
        }
    }

    private static void searchMember() {
        System.out.print("Enter member name to search: ");
        String name = sc.nextLine();
        if (members.contains(name)) {
            System.out.println(name + " is a registered member.");
        } else {
            System.out.println(name + " not found.");
        }
    }

    private static void updateMember() {
        System.out.print("Enter existing member name: ");
        String oldName = sc.nextLine();
        if (members.contains(oldName)) {
            System.out.print("Enter new name: ");
            String newName = sc.nextLine();
            members.set(members.indexOf(oldName), newName);
            System.out.println("Member updated successfully.");
        } else {
            System.out.println(oldName + " not found.");
        }
    }

    private static void sortMembers() {
        if (members.isEmpty()) {
            System.out.println("No members to sort.");
        } else {
            Collections.sort(members);
            System.out.println("Members sorted alphabetically.");
        }
    }
}

