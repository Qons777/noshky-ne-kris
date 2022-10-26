package Task;

/**
 * Найти среднее арифметическое всех элементов массива
 *
 * Например:
 *
 * Дано: [1,3,5,8] Результат: 4
 */
public class task1 {
    public static void main(String[] args) {
        int[] values ={1,3,5,8};
        System.out.println(calculateSumArray(values));
    }


    public static int calculateSumArray(int[] values){
        int result=0;
        for (int i = 0; i <values.length ; i++) {
            result +=values[i];
        }
        result /= values.length;
        return result;
    }
}
