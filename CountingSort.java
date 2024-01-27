package Algo;

import java.util.Arrays;

public class CountingSort {
	static int TFC;
    public static void countingSort(int[] arr) {
        int max = Arrays.stream(arr).max().orElse(0);
        TFC++;
        int[] count = new int[max + 1];
        TFC++;
        int[] output = new int[arr.length];
        TFC++;
        TFC++;
        for (int num : arr) {
            count[num]++;
            TFC++;
        }	TFC++;
        TFC++;
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
            TFC++;
        }TFC++;
        TFC++;
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            TFC++;
            count[arr[i]]--;
            TFC++;
        }TFC++;

        System.arraycopy(output, 0, arr, 0, arr.length);
        TFC+=2;
    }

    public static void main(String[] args) {
        int[] inputArray = {};  
        TFC++;
        countingSort(inputArray);
        TFC++;
        System.out.println(Arrays.toString(inputArray));
        TFC+=3;
        System.out.println(TFC);
    }
}
