package Algo;

public class MergeSort {
	static int TFC;
    public static void mergeSort(int[] arr, int low, int high) {
    	TFC++;
    	TFC++;
        if (low < high) {
            int mid = (low + high) / 2;
            TFC++;
            mergeSort(arr, low, mid);
            TFC++;
            mergeSort(arr, mid + 1, high);
            TFC++;
            merge(arr, low, mid, high);
            TFC+=3;
        }
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int n1 = mid - low + 1, n2 = high - mid;
        TFC++;
        int[] left = new int[n1], right = new int[n2];
        TFC++;
        System.arraycopy(arr, low, left, 0, n1);
        TFC++;
        System.arraycopy(arr, mid + 1, right, 0, n2);
        TFC++;
        TFC+=2;
        for (int i = 0, j = 0, k = low; k <= high; k++)
            arr[k] = (j >= n2 || (i < n1 && left[i] <= right[j])) ? left[i++] : right[j++];
        	TFC++;
    }

    public static void main(String[] args) {
        int[] inputArray = {};
        TFC++;
        mergeSort(inputArray, 0, inputArray.length - 1);
        TFC++;
        printArray(inputArray);
        TFC+=3;
        System.out.println("Total Frequency Count: " + TFC);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) System.out.print(num + " ");
        TFC++;
        System.out.println();
        TFC+=3;
    }
}

