/**
 * Created by Jiazhang_Liu on 5/11/2015.
 */
public class MergeSort {
    public int[] mergeSort(int [] list) {
        if (list == null || list.length <= 1) {
            return list;
        }

        // Split the array in half
        int[] first = new int[list.length / 2];
        int[] second = new int[list.length - first.length];
        System.arraycopy(list, 0, first, 0, first.length);
        System.arraycopy(list, first.length, second, 0, second.length);

        // Sort each half
        mergeSort(first);
        mergeSort(second);

        // Merge the halves together, overwriting the original array
        merge(first, second, list);
        return list;
    }

    private void merge(int[] first, int[] second, int [] result) {
        // Merge both halves into the result array
        // Next element to consider in the first array
        int iFirst = 0;
        // Next element to consider in the second array
        int iSecond = 0;

        // Next open position in the result
        int j = 0;
        // As long as neither iFirst nor iSecond is past the end, move the
        // smaller element into the result.
        for(int i = 0; i < result.length; i++) {
            if (iFirst < first.length) {
                if (iSecond == second.length || first[iFirst] < second[iSecond])
                    result[j++] = first[iFirst++];
            }

            if (iSecond < second.length) {
                if (iFirst == first.length || first[iFirst] >= second[iSecond])
                    result[j++] = second[iSecond++];
            }
        }
    }
}
