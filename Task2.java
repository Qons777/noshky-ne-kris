package Task;

import java.util.Arrays;


/**
 * Задача №2 (Класс Sort)
 * Дан целочисленный массив. Отсортировать его по убыванию и поменять местами первый и последний элемент.
 *
 * Например:
 *
 * Дано: [1,23,42,6,8,3] Результат: [1,23,8,6,3,42]
 */
public class Task2 {


    public static void main(String[] args) {
        int[] values = new int[]{1, 23, 42, 6, 8, 3};
        Arrays.sort(values);
        int result = values[5];
        values[5] = values[0];
        values[0] = result;
        for (int i = values.length - 1; i >= 0; i--) {
            System.out.print(values[i] + " ");
        }
    }
}

