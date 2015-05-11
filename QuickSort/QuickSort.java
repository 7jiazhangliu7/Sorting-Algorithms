/**
 * Created by Jiazhang_Liu on 5/11/2015.
 */
public class QuickSort {
    //http://www.algolist.net/Algorithms/Sorting/Quicksort
    public static void QuickSort(int[] input, int low, int high) {
        if(input == null || input.length == 0 || low >= high) return;

        int pivot = input[(low+high)/2];

        int i = low, j = high;

        while(i <= j) {
            while(input[i] < pivot) {
                i++;
            }

            while(input[j] > pivot) {
                j--;
            }

            if(i <= j) {
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
                i++;
                j--;
            }
        }

        if(j > low) {
            QuickSort(input, low, j);
        }

        if(i < high) {
            QuickSort(input, i, high);
        }
    }
}
