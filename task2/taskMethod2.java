package Task;

import java.util.Arrays;

public class taskMethod2 {
    public static int sortArray(int[] values) {
        Arrays.sort(values);
        int minIndex = minInd(values);
        int maxIndex = maxInd(values);
        int result = values[minIndex];
        values[minIndex] = values[maxIndex];
        values[maxIndex] = result;
        for (int i = values.length - 1; i >= 0; i--) {
            System.out.print(values[i] + " ");
        }
        return result;
    }

    public static int minInd(int[] values) {
        int minIndex = 0;
        int minValues = values[minIndex];
        for (int i = 0; i < values.length; i++) {
            if (minValues > values[i]) {
                minValues = values[i];
                minIndex = i;
            }
        }
        return minIndex;
    }


    public static int maxInd(int[] values) {
        int maxIndex = 0;
        int maxValue = values[maxIndex];
        for (int i = 0; i < values.length; i++) {
            if (maxValue < values[i]) {
                maxValue = values[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}

