public static void bubbleSort(int[] arr) {
        int maxIndex = arr.length - 1;
        stepCount++; // statement in function body

        stepCount++; // initialization for loop 1

        for (int i = 0; i < maxIndex; i++) {

            stepCount++; // conditional for loop 1

            boolean swapped = false;
            stepCount++; // statement in for loop 1

            stepCount++; // initialization for loop 2
            for (int j = 0; j < maxIndex - i; j++) {

                stepCount++; // conditional for loop 2

                stepCount++; // if statement for loop 2

                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    stepCount++; // statement inside if statement for loop 2

                    arr[j] = arr[j + 1];
                    stepCount++; // statement inside if statement for loop 2

                    arr[j + 1] = tmp;
                    stepCount++; // statement inside if statement for loop 2

                    swapped = true;

                    stepCount++; // end curly brace for the if statement if met
                }

                stepCount++; // change of state for loop 2

            } stepCount += 2; // +2 step count for the unmet conditional and end curly brace for loop 2

            stepCount++; // conditional if statement in for loop 1
            if (swapped == false) {
                stepCount++; // break statement in if statement if met
                break;
            }

            stepCount++; // change of state for loop 1
        }
        stepCount += 2; // +2 step count for the unmet conditional and end curly brace for loop 1
    }
