package DataStructures;
import java.util.Scanner;

public class AddressCalculation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter dimension: ");
        int dimension = sc.nextInt();
        int[] dimSize = new int[dimension];

        for (int i = 0; i < dimension; i++) {
            System.out.println("Enter UB" + i);
            dimSize[i] = sc.nextInt();
        }

        System.out.println("Enter Starting address: ");
        int SA = sc.nextInt();
        System.out.println("Enter esize: ");
        int ES = sc.nextInt();

        int numElements = 1;
        for (int i = 0; i < dimension; i++) {
            numElements *= dimSize[i];
        }

        System.out.println("Total number of Elements in the Array: " + numElements);

        System.out.println("\n***SEARCH FOR MEMORY ADDRESS OF ith ELEMENT***\n");

        int[] search = new int[dimension];
        for (int i = 0; i < dimension; i++) {
            System.out.println("Input search index at dimension " + i);
            search[i] = sc.nextInt();
        }

        int UP = 0;
        for (int i = 0; i < dimension - 1; i++) {
            int product = 1;
            for (int j = i + 1; j < dimension; j++) {
                product *= dimSize[j];
            }
            UP += product * search[i];
        }

        int MA = SA + (search[dimension - 1] + UP) * ES;

        System.out.println("MEMORY ADDRESS: " + MA);

        sc.close(); // Close scanner to prevent resource leak
    }
}
