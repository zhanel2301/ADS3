import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the data set: ");
        int size = sc.nextInt();
        int[] data = new int[size];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print("element " + (i + 1) + ": ");
            data[i] = sc.nextInt();
        }

        System.out.println("\nChoose a sorting algorithm:");
        System.out.println("1. Quick Sort");
        System.out.println("2. Merge Sort");
        System.out.println("3. Heap Sort");
        System.out.println("4. Insertion Sort");
        System.out.println("5. Selection Sort");
        System.out.print("Enter the number of the sorting algorithm: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                QuickSort.quickSort(data, 0, data.length - 1);
                break;
            case 2:
                MergeSort.mergeSort(data, 0, data.length - 1);
                break;
            case 3:
                HeapSort.heapSort(data);
                break;
            case 4:
                InsertionSort.insertionSort(data);
                break;
            case 5:
                SelectionSort.selectionSort(data);
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println("\nSorted data:");
        for (int num : data)
            System.out.print(num + " ");

        sc.close();
    }
}
