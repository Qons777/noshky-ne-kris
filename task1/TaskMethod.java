package Task;

public class TaskMethod {

    public static int calculateSumArray(int[] values) {
        int result = 0;
        for (int i = 0; i < values.length; i++) {
            result += values[i];
        }
        result /= values.length;
        return result;
    }
    }
