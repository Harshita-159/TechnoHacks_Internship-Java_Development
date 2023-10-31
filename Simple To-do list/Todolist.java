import java.util.ArrayList;
import java.util.Scanner;

public class Todolist {
    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- To-Do List ---");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. View List");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the task to add: ");
                    String newItem = scanner.nextLine();
                    toDoList.add(newItem);
                    System.out.println("Task added: " + newItem);
                    break;
                case 2:
                    if (toDoList.isEmpty()) {
                        System.out.println("The to-do list is empty.");
                    } else {
                        System.out.print("Enter the task index to remove: ");
                        int indexToRemove = scanner.nextInt();
                        if (indexToRemove >= 0 && indexToRemove < toDoList.size()) {
                            String removedItem = toDoList.remove(indexToRemove);
                            System.out.println("Task removed: " + removedItem);
                        } else {
                            System.out.println("Invalid index. Please enter a valid index(Index in To-do List starts from 0)");
                        }
                    }
                    break;
                case 3:
                    if (toDoList.isEmpty()) {
                        System.out.println("The to-do list is empty.");
                    } else {
                        System.out.println("--- To-Do List ---");
                        for (int i = 0; i < toDoList.size(); i++) {
                            System.out.println((i + 1) + ". " + toDoList.get(i));
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting the program. Farewell!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
