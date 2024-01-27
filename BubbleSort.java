package Algo;
import java.util.Arrays;

public class BubbleSort {
	static int TFC;
    public static void main(String[] args) {
    	TFC++;
        int[] arr = {};
        TFC++;
        bubbleSort(arr);
        TFC++;
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        TFC++;
        System.out.println("Total Frequency Count: "+ TFC);
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
         TFC++;
         TFC++;
        for (int i = 0; i < n - 1; i++) {
        	TFC++;
            for (int j = 0; j < n - i - 1; j++) {
            	TFC++;
                if (arr[j] > arr[j + 1]) {
                	TFC++;
                    int temp = arr[j];
                    TFC++;
                    arr[j] = arr[j + 1];
                    TFC++;
                    arr[j + 1] = temp;
                    TFC++;
                }
            }
        }
        TFC+=5;
    }
}

