package Jobsheet13;

public class BinaryTreeArray28 {
    int[] data;
    int idxLast;

    public BinaryTreeArray28() {
        data = new int[10];
        idxLast = -1; 
    }

    void populateData(int[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast && data[idxStart] != 0) {
            traverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 2);
        }
    }

    void add(int dataToAdd) {
        if (idxLast < data.length - 1) { 
            idxLast++;
            data[idxLast] = dataToAdd;
        } else {
            System.out.println("Binary tree array is full.");
        }
    }

    void traversePreOrder(int idx) {
        if (idx <= idxLast && data[idx] != 0) {
            System.out.print(data[idx] + " ");
            traversePreOrder(2 * idx + 1);
            traversePreOrder(2 * idx + 2);
        }
    }

    void traversePostOrder(int idx) {
        if (idx <= idxLast && data[idx] != 0) {
            traversePostOrder(2 * idx + 1);
            traversePostOrder(2 * idx + 2);
            System.out.print(data[idx] + " ");
        }
    }
}

