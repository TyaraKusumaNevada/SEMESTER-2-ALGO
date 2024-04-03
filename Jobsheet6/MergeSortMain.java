package Jobsheet6;

public class MergeSortMain {
    public static void main(String[] args) {
        int data [] = {10,40,30,50,70,20,100,90};
        System.out.println("sorting dengan merge sort");
        MergeSorting28 mSort = new MergeSorting28();
        System.out.println("data awal");
        mSort.printArray(data);
        mSort.MergeSort(data);
        System.out.println("setelah diurutkan");
        mSort.printArray(data);
    }
}

