package io.bna.epibook.dutchflag;

/**
 * Created by brand on 9/8/2016.
 */
public class QsortStrat implements FlagSortStrategy {
    @Override
    public void sort(int[] array, int pivot) {
        int iMin = 0,
            iMax = array.length - 1,
            iPivotMin = pivot,
            iPivotMax = pivot;
        while(iMin < iPivotMin || iMax > iPivotMax) {
            if(iMin < iPivotMin) {
                if(array[iMin] == array[iPivotMin]) {
                    // move into pivot
                    swap(array, iMin, iPivotMin - 1);
                    iPivotMin--;
                } else if(array[iMin] > array[iPivotMin]) {
                    // move after pivot
                    swap(array, iMin, iPivotMax);
                    swap(array, iMin, iPivotMin - 1);
                    iPivotMin--;
                    iPivotMax--;
                } else
                    iMin++;
            }
            if(iMax > iPivotMax) {
                if(array[iMax] == array[iPivotMax]) {
                    // move into pivot
                    swap(array, iMax, iPivotMax + 1);
                    iPivotMax++;
                } else if(array[iMax] < array[iPivotMax]) {
                    // move before pivot
                    swap(array, iMax, iPivotMin);
                    swap(array, iMax, iPivotMax + 1);
                    iPivotMin++;
                    iPivotMax++;
                } else
                    iMax--;
            }
        }
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
