package main.java.arrays.countingSort;

public class CountingSort {
    public static void main(String[] args) {

        int[] intArray = {2, 5, 2, 8, 2, 8, 7, 10, 4, 3};

        countingSort(intArray, 1, 10);

        for (int value : intArray) {
            System.out.println(value);
        }
    }

    public static void countingSort(int[] input, int min, int max) {

        int[] countArray = new int[(max - min) + 1];

        for (int i = 0; i < input.length; i++) {
            countArray[input[i] - min]++;
        }

        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                input[j++] = i;
                countArray[i - min]--;
            }
        }
    }
}
