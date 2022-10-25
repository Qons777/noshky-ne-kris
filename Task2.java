package Task;

import java.util.Arrays;


/**
 * ������ �2 (����� Sort)
 * ��� ������������� ������. ������������� ��� �� �������� � �������� ������� ������ � ��������� �������.
 *
 * ��������:
 *
 * ����: [1,23,42,6,8,3] ���������: [1,23,8,6,3,42]
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

