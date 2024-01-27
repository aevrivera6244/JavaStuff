package Algo;

public class QuickSort {
	static int TFC;
    public static void quickSort(int[] arr, int low, int high) {
    	TFC++;
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            TFC++;
            quickSort(arr, low, partitionIndex - 1);
            TFC++;
            quickSort(arr, partitionIndex + 1, high);
            TFC+=3;
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        TFC++;
        int i = low - 1;
        TFC++;
        TFC++;
        for (int j = low; j < high; j++) {
        	TFC++;
            if (arr[j] <= pivot) {
                i++;
                TFC++;
                swap(arr, i, j);
                TFC+=3;
            }
        }

        swap(arr, i + 1, high);
        TFC+=2;
        return i + 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        TFC++;
        arr[i] = arr[j];
        TFC++;
        arr[j] = temp;
        TFC+=2;
    }

    public static void main(String[] args) {
        int[] inputArray = {};
        TFC++;

        quickSort(inputArray, 0, inputArray.length - 1);
        TFC++;

        System.out.print("Sorted Array: ");
        TFC++;
        printArray(inputArray);
        TFC+=2;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) System.out.print(num + " ");
        TFC++;
        System.out.println();
        TFC+=4;
        System.out.println("Total Frequency Count: " + TFC);
    }
}


