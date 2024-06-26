package Jobsheet12;
import java.util.ArrayList;
import java.util.List;

public class DoubleLinkedList29 {
    Node29 head;
    int size;

    public DoubleLinkedList29() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item, int jarak) {
        if (isEmpty()) {
            head = new Node29(null, item, jarak, null);
        } else {
            Node29 newNode = new Node29(null, item, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public int getJarak(int index) throws Exception {
        if (isEmpty() || index >= size || index < 0) {
            throw new Exception("Nilai indeks diluar batas.");
        }
        Node29 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.jarak;
    }

    public void addLast(int item, int jarak) {
        if (isEmpty()) {
            addFirst(item, jarak);
        } else {
            Node29 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node29 newNode = new Node29(current, item, jarak, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int item, int jarak, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai indeks diluar batas");
        }
        if (isEmpty()) {
            addFirst(item, jarak);
        } else {
            Node29 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }

            if (current.prev == null) {
                Node29 newNode = new Node29(null, item, jarak, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node29 newNode = new Node29(current.prev, item, jarak, current);
                current.prev.next = newNode;
                current.prev = newNode;
            }
            size++;
        }
    }

    public Node29 getHead() {
        return head;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node29 tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        } else if (size == 1) {
            head = null;
            size--;
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        } else if (head.next == null) {
            head = null;
            size--;
        } else {
            Node29 current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
            size--;
        }
    }
    public boolean remove(int data) {
        if (isEmpty()) {
            return false;
        }

        Node29 current = head;

        // Jika node yang akan dihapus adalah head
        if (current.data == data) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            size--;
            return true;
        }

        // Traverse list to find the node with given data
        while (current != null && current.data != data) {
            current = current.next;
        }

        // If found, remove the node
        if (current != null) {
            // Adjust the pointers
            if (current.prev != null) {
                current.prev.next = current.next;
            }
            if (current.next != null) {
                current.next.prev = current.prev;
            }
            size--;
            return true;
        }

        return false; // Node not found
    }

    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        return head.data;
    }

    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        Node29 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int get(int index) throws Exception {
        if (isEmpty() || index >= size || index < 0) {
            throw new Exception("Nilai indeks diluar batas.");
        }
        Node29 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }


}