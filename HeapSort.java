package Algo;

public class HeapSort {
		static int TFC;
	    public static void heapSort(int[] arr) {
	    	TFC++;
	        int n = arr.length;
	        TFC++;
	        TFC++;
	        for (int i = n / 2 - 1; i >= 0; i--) heapify(arr, n, i);
	        TFC++;
	        
	        for (int i = n - 1; i > 0; i--) {
	        	TFC++;
	            int temp = arr[0]; arr[0] = arr[i]; arr[i] = temp;
	            TFC++;
	            heapify(arr, i, 0);
	            TFC++;
	            TFC+=2;
	        }
	    }

	    public static void heapify(int[] arr, int n, int i) {
	        int largest = i, left = 2 * i + 1, right = 2 * i + 2;
	        TFC++;
	        if (left < n && arr[i] < arr[left]) largest = left;
	        TFC++;
	        if (right < n && arr[largest] < arr[right]) largest = right;
	        TFC++;
	        TFC++;
	        if (largest != i) {
	            int temp = arr[i]; arr[i] = arr[largest]; arr[largest] = temp;
	            TFC++;
	            heapify(arr, n, largest);
	            TFC++;
	            TFC+=2;
	        }
	    }

	    public static void main(String[] args) {
	        int[] inputArray = {};  
	        TFC++;
	        heapSort(inputArray);
	        TFC++;
	        printArray(inputArray);
	        TFC++;
	        TFC+=3;
	        System.out.println();
	        System.out.println("Total Frequency Count: " + TFC);
	    }

	    public static void printArray(int[] arr) {
	    	TFC+=3;
	        for (int num : arr) System.out.print(num + " ");
	    }
}
