/**
 * Created by Jiazhang_Liu on 5/11/2015.
 */
public class Main {

    public static void main(String args[]) {
        MergeSort ms = new MergeSort();

        int[] input1 = {1,3,5,7,9,2,4,6,8,10};
        int[] input2 = {-1, -2};
        int[] input3 = {10,9,8,7,6,5,4,3,2,1};
        int[] input4 = {2,2,2,3,3,3,4};
        int[] input5 = {1};
        ms.mergeSort(input1);
        ms.mergeSort(input2);
        ms.mergeSort(input3);
        ms.mergeSort(input4);
        ms.mergeSort(input5);

        for(Integer i : input2) {
            System.err.println(i);
        }

    }
}
