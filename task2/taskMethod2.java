package Task;

import java.util.Arrays;

public class taskMethod2 {
    public static int sortArray(int[] values){
        Arrays.sort(values);
        int result = values[0];
        values[0] = values[5];
        values[5] = result;
        for (int i = values.length - 1; i >= 0; i--) {
            System.out.print(values[i] + " ");
        }
        return result;
    }
}
