package Task;


import static Task.taskMethod2.sortArray;

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
        int[] values = new int[]{1, 23, 42, 6, 8, 100,76,89,80,4,70,26};
        sortArray(values);
    }
}

