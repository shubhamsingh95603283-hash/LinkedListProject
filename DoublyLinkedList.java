package LinkedList;
public class DoublyLinkedList {

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head;
    Node tail;

    // 1. Insert at Beginning
    public void insertAtBeginning(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        System.out.println("Node inserted successfully.");
    }

    // 2. Insert at End
    public void insertAtEnd(int data) {

        Node newNode = new Node(data);

        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

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

        if (temp == tail) {
            insertAtEnd(data);
            return;
        }

        Node newNode = new Node(data);

        newNode.next = temp.next;
        newNode.prev = temp;

        temp.next.prev = newNode;
        temp.next = newNode;

        System.out.println("Node inserted successfully.");
    }

    // 4. Insert After a Node
    public void insertAfter(int target, int data) {

        Node temp = head;

        while (temp != null) {

            if (temp.data == target) {

                if (temp == tail) {
                    insertAtEnd(data);
                    return;
                }

                Node newNode = new Node(data);

                newNode.next = temp.next;
                newNode.prev = temp;

                temp.next.prev = newNode;
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

        Node temp = head;

        while (temp != null) {

            if (temp.data == target) {

                if (temp == head) {
                    insertAtBeginning(data);
                    return;
                }

                Node newNode = new Node(data);

                newNode.prev = temp.prev;
                newNode.next = temp;

                temp.prev.next = newNode;
                temp.prev = newNode;

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

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        System.out.println("Node deleted successfully.");
    }

    // 7. Delete from End
    public void deleteFromEnd() {

        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

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

        for (int i = 1; i < position && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position.");
            return;
        }

        if (temp == tail) {
            deleteFromEnd();
            return;
        }

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

        System.out.println("Node deleted successfully.");
    }

    // 9. Delete by Value
    public void deleteByValue(int value) {

        Node temp = head;

        while (temp != null) {

            if (temp.data == value) {

                if (temp == head) {
                    deleteFromBeginning();
                    return;
                }

                if (temp == tail) {
                    deleteFromEnd();
                    return;
                }

                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;

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

    // 12. Display Forward
    public void displayForward() {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;

        System.out.print("Forward: NULL <- ");

        while (temp != null) {

            System.out.print(temp.data);

            if (temp.next != null) {
                System.out.print(" <-> ");
            }

            temp = temp.next;
        }

        System.out.println(" -> NULL");
    }

    // 13. Display Backward
    public void displayBackward() {

        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = tail;

        System.out.print("Backward: NULL <- ");

        while (temp != null) {

            System.out.print(temp.data);

            if (temp.prev != null) {
                System.out.print(" <-> ");
            }

            temp = temp.prev;
        }

        System.out.println(" -> NULL");
    }

    // 14. Count Nodes
    public void countNodes() {

        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println("Total nodes = " + count);
    }

    // 15. Find Maximum
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

    // 16. Find Minimum
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

    // 17. Find Middle
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

    // 18. Reverse
    public void reverse() {

        Node current = head;

        while (current != null) {

            Node temp = current.next;

            current.next = current.prev;
            current.prev = temp;

            current = temp;
        }

        Node temp = head;
        head = tail;
        tail = temp;

        System.out.println("List reversed successfully.");
    }

    // 19. Sort
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

    // 20. Remove Duplicates
    public void removeDuplicates() {

        Node current = head;

        while (current != null) {

            Node temp = current.next;

            while (temp != null) {

                Node nextNode = temp.next;

                if (temp.data == current.data) {

                    if (temp.prev != null) {
                        temp.prev.next = temp.next;
                    }

                    if (temp.next != null) {
                        temp.next.prev = temp.prev;
                    }

                    if (temp == tail) {
                        tail = temp.prev;
                    }
                }

                temp = nextNode;
            }

            current = current.next;
        }

        System.out.println("Duplicates removed successfully.");
    }
}