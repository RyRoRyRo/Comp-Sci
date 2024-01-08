//Contact Book
//Nov 14 2023
//Ryan KS
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> contacts = new HashMap<>();
        boolean running = true;
        System.out.println("Welcome to your contact book!");
        System.out.println("-----Commands----- \n 'add' or 'create' make a new contact \n 'update' or 'edit' to change an existing contact \n 'find' or 'get' to find an existing contact\n 'delete' or 'remove' to delete an existing contact\n 'get' or 'list' to show all contacts\n 'quit' to exit.");

        while (running) {
            System.out.println("Enter a command: ");
            String command = scanner.nextLine();
            switch (command.toLowerCase()) {
                case "add", "create" -> {
                    System.out.println("Enter a name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter their phone number: ");
                    String number = scanner.nextLine();
                    contacts.put(name, number);
                }
                case "update", "edit" -> {
                    System.out.println("Enter a contact name to update: ");
                    String name = scanner.nextLine();
                    if (contacts.containsKey(name)) {
                        System.out.println("Enter their new phone number: ");
                        String number = scanner.nextLine();
                        contacts.put(name, number);
                    }
                    else {System.out.println("That contact does not exist! Type 'add' or 'create' to add that contact: ");}
                }
                case "find", "get" -> {
                    System.out.println("Enter a name: ");
                    String name2 = scanner.nextLine();
                    System.out.println(contacts.get(name2));
                }
                case "delete", "remove" -> {
                    System.out.println("Enter a name: ");
                    String name3 = scanner.nextLine();
                    contacts.remove(name3);
                }
                case "list", "display" -> {
                    for (String key : contacts.keySet()) {
                        System.out.println(key + ": " + contacts.get(key));
                    }
                }
                case "quit" -> running = false;
                default -> System.out.println("Invalid command");
            }
        }
    }
}