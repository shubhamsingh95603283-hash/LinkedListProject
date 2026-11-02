package LinkedList;
public class SinglyLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // 1. Insert at Beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println("Node inserted successfully.");
    }

    // 2. Insert at End
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        System.out.println("Node inserted successfully.");
    }

    // 3. Insert at Position
    public void insertAtPosition(int data, int position) {

        if (position < 1) {
            System.out.println("Invalid position.");
            return;
        }

        if (position == 1) {
            insertAtBeginning(data);
            return;
        }

        Node temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position.");
            return;
        }

        Node newNode = new Node(data);

        newNode.next = temp.next;
        temp.next = newNode;

        System.out.println("Node inserted successfully.");
    }

    // 4. Insert After a Node
    public void insertAfter(int target, int data) {

        Node temp = head;

        while (temp != null) {

            if (temp.data == target) {

                Node newNode = new Node(data);

                newNode.next = temp.next;
                temp.next = newNode;

                System.out.println("Node inserted successfully.");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Target value not found.");
    }

    // 5. Insert Before a Node
    public void insertBefore(int target, int data) {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.data == target) {
            insertAtBeginning(data);
            return;
        }

        Node temp = head;

        while (temp.next != null) {

            if (temp.next.data == target) {

                Node newNode = new Node(data);

                newNode.next = temp.next;
                temp.next = newNode;

                System.out.println("Node inserted successfully.");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Target value not found.");
    }

    // 6. Delete from Beginning
    public void deleteFromBeginning() {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        head = head.next;

        System.out.println("Node deleted successfully.");
    }

    // 7. Delete from End
    public void deleteFromEnd() {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.next == null) {
            head = null;
            System.out.println("Node deleted successfully.");
            return;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;

        System.out.println("Node deleted successfully.");
    }

    // 8. Delete from Position
    public void deleteFromPosition(int position) {

        if (head == null || position < 1) {
            System.out.println("Invalid position.");
            return;
        }

        if (position == 1) {
            deleteFromBeginning();
            return;
        }

        Node temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Invalid position.");
            return;
        }

        temp.next = temp.next.next;

        System.out.println("Node deleted successfully.");
    }

    // 9. Delete by Value
    public void deleteByValue(int value) {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.data == value) {
            deleteFromBeginning();
            return;
        }

        Node temp = head;

        while (temp.next != null) {

            if (temp.next.data == value) {

                temp.next = temp.next.next;

                System.out.println("Node deleted successfully.");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Value not found.");
    }

    // 10. Search
    public void search(int value) {

        Node temp = head;
        int position = 1;

        while (temp != null) {

            if (temp.data == value) {
                System.out.println("Value found at position " + position);
                return;
            }

            temp = temp.next;
            position++;
        }

        System.out.println("Value not found.");
    }

    // 11. Update
    public void update(int oldValue, int newValue) {

        Node temp = head;

        while (temp != null) {

            if (temp.data == oldValue) {
                temp.data = newValue;
                System.out.println("Value updated successfully.");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Value not found.");
    }

    // 12. Display
    public void display() {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;

        System.out.print("List: ");

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    // 13. Count Nodes
    public void countNodes() {

        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println("Total nodes = " + count);
    }

    // 14. Find Maximum
    public void findMaximum() {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        int max = head.data;
        Node temp = head.next;

        while (temp != null) {

            if (temp.data > max) {
                max = temp.data;
            }

            temp = temp.next;
        }

        System.out.println("Maximum = " + max);
    }

    // 15. Find Minimum
    public void findMinimum() {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        int min = head.data;
        Node temp = head.next;

        while (temp != null) {

            if (temp.data < min) {
                min = temp.data;
            }

            temp = temp.next;
        }

        System.out.println("Minimum = " + min);
    }

    // 16. Find Middle
    public void findMiddle() {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle element = " + slow.data);
    }

    // 17. Reverse
    public void reverse() {

        Node previous = null;
        Node current = head;

        while (current != null) {

            Node next = current.next;

            current.next = previous;

            previous = current;
            current = next;
        }

        head = previous;

        System.out.println("List reversed successfully.");
    }

    // 18. Sort
    public void sort() {

        if (head == null || head.next == null) {
            return;
        }

        boolean swapped;

        do {

            swapped = false;

            Node temp = head;

            while (temp.next != null) {

                if (temp.data > temp.next.data) {

                    int value = temp.data;
                    temp.data = temp.next.data;
                    temp.next.data = value;

                    swapped = true;
                }

                temp = temp.next;
            }

        } while (swapped);

        System.out.println("List sorted successfully.");
    }

    // 19. Remove Duplicates
    public void removeDuplicates() {

        Node current = head;

        while (current != null) {

            Node temp = current;

            while (temp.next != null) {

                if (temp.next.data == current.data) {
                    temp.next = temp.next.next;
                } else {
                    temp = temp.next;
                }
            }

            current = current.next;
        }

        System.out.println("Duplicates removed successfully.");
    }
}