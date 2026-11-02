package LinkedList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n==============================================");
            System.out.println("       LINKED LIST MANAGEMENT SYSTEM");
            System.out.println("==============================================");
            System.out.println("1. Singly Linked List");
            System.out.println("2. Doubly Linked List");
            System.out.println("3. Compare Singly vs Doubly Linked List");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    singlyMenu();
                    break;

                case 2:
                    doublyMenu();
                    break;

                case 3:
                    compare();
                    break;

                case 4:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // ================= SINGLY MENU =================

    static void singlyMenu() {

        SinglyLinkedList list = new SinglyLinkedList();

        while (true) {

            System.out.println("\n********** Singly Linked List **********");

            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Position");
            System.out.println("4. Insert After a Node");
            System.out.println("5. Insert Before a Node");
            System.out.println("6. Delete from Beginning");
            System.out.println("7. Delete from End");
            System.out.println("8. Delete from Position");
            System.out.println("9. Delete by Value");
            System.out.println("10. Search");
            System.out.println("11. Update");
            System.out.println("12. Display");
            System.out.println("13. Count Nodes");
            System.out.println("14. Find Maximum");
            System.out.println("15. Find Minimum");
            System.out.println("16. Find Middle Element");
            System.out.println("17. Reverse");
            System.out.println("18. Sort");
            System.out.println("19. Remove Duplicates");
            System.out.println("20. Exit");

            System.out.print("Enter the choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    list.insertAtBeginning(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    list.insertAtEnd(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter value: ");
                    int value = sc.nextInt();

                    System.out.print("Enter position: ");
                    int position = sc.nextInt();

                    list.insertAtPosition(value, position);
                    break;

                case 4:
                    System.out.print("Enter target value: ");
                    int target = sc.nextInt();

                    System.out.print("Enter new value: ");
                    value = sc.nextInt();

                    list.insertAfter(target, value);
                    break;

                case 5:
                    System.out.print("Enter target value: ");
                    target = sc.nextInt();

                    System.out.print("Enter new value: ");
                    value = sc.nextInt();

                    list.insertBefore(target, value);
                    break;

                case 6:
                    list.deleteFromBeginning();
                    break;

                case 7:
                    list.deleteFromEnd();
                    break;

                case 8:
                    System.out.print("Enter position: ");
                    list.deleteFromPosition(sc.nextInt());
                    break;

                case 9:
                    System.out.print("Enter value: ");
                    list.deleteByValue(sc.nextInt());
                    break;

                case 10:
                    System.out.print("Enter value: ");
                    list.search(sc.nextInt());
                    break;

                case 11:
                    System.out.print("Enter old value: ");
                    int oldValue = sc.nextInt();

                    System.out.print("Enter new value: ");
                    int newValue = sc.nextInt();

                    list.update(oldValue, newValue);
                    break;

                case 12:
                    list.display();
                    break;

                case 13:
                    list.countNodes();
                    break;

                case 14:
                    list.findMaximum();
                    break;

                case 15:
                    list.findMinimum();
                    break;

                case 16:
                    list.findMiddle();
                    break;

                case 17:
                    list.reverse();
                    break;

                case 18:
                    list.sort();
                    break;

                case 19:
                    list.removeDuplicates();
                    break;

                case 20:
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // ================= DOUBLY MENU =================

    static void doublyMenu() {

        DoublyLinkedList list = new DoublyLinkedList();

        while (true) {

            System.out.println("\n********** Doubly Linked List **********");

            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Position");
            System.out.println("4. Insert After a Node");
            System.out.println("5. Insert Before a Node");
            System.out.println("6. Delete from Beginning");
            System.out.println("7. Delete from End");
            System.out.println("8. Delete from Position");
            System.out.println("9. Delete by Value");
            System.out.println("10. Search");
            System.out.println("11. Update");
            System.out.println("12. Display Forward");
            System.out.println("13. Display Backward");
            System.out.println("14. Count Nodes");
            System.out.println("15. Find Maximum");
            System.out.println("16. Find Minimum");
            System.out.println("17. Find Middle Element");
            System.out.println("18. Reverse");
            System.out.println("19. Sort");
            System.out.println("20. Remove Duplicates");
            System.out.println("21. Exit");

            System.out.print("Enter the choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    list.insertAtBeginning(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    list.insertAtEnd(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter value: ");
                    int value = sc.nextInt();

                    System.out.print("Enter position: ");
                    int position = sc.nextInt();

                    list.insertAtPosition(value, position);
                    break;

                case 4:
                    System.out.print("Enter target value: ");
                    int target = sc.nextInt();

                    System.out.print("Enter new value: ");
                    value = sc.nextInt();

                    list.insertAfter(target, value);
                    break;

                case 5:
                    System.out.print("Enter target value: ");
                    target = sc.nextInt();

                    System.out.print("Enter new value: ");
                    value = sc.nextInt();

                    list.insertBefore(target, value);
                    break;

                case 6:
                    list.deleteFromBeginning();
                    break;

                case 7:
                    list.deleteFromEnd();
                    break;

                case 8:
                    System.out.print("Enter position: ");
                    list.deleteFromPosition(sc.nextInt());
                    break;

                case 9:
                    System.out.print("Enter value: ");
                    list.deleteByValue(sc.nextInt());
                    break;

                case 10:
                    System.out.print("Enter value: ");
                    list.search(sc.nextInt());
                    break;

                case 11:
                    System.out.print("Enter old value: ");
                    int oldValue = sc.nextInt();

                    System.out.print("Enter new value: ");
                    int newValue = sc.nextInt();

                    list.update(oldValue, newValue);
                    break;

                case 12:
                    list.displayForward();
                    break;

                case 13:
                    list.displayBackward();
                    break;

                case 14:
                    list.countNodes();
                    break;

                case 15:
                    list.findMaximum();
                    break;

                case 16:
                    list.findMinimum();
                    break;

                case 17:
                    list.findMiddle();
                    break;

                case 18:
                    list.reverse();
                    break;

                case 19:
                    list.sort();
                    break;

                case 20:
                    list.removeDuplicates();
                    break;

                case 21:
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // ================= COMPARISON =================

    static void compare() {

        System.out.println("\n==============================================");
        System.out.println("       SINGLY VS DOUBLY LINKED LIST");
        System.out.println("==============================================");

        System.out.println("Feature              Singly          Doubly");
        System.out.println("----------------------------------------------");
        System.out.println("Links                next            prev + next");
        System.out.println("Memory               Less            More");
        System.out.println("Forward traversal    Yes             Yes");
        System.out.println("Backward traversal   No              Yes");
        System.out.println("Search               O(n)            O(n)");
        System.out.println("Insert Beginning     O(1)            O(1)");
        System.out.println("Reverse              O(n)            O(n)");

        System.out.println("==============================================");
    }
}