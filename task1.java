package Task;

/**
 * ����� ������� �������������� ���� ��������� �������
 *
 * ��������:
 *
 * ����: [1,3,5,8] ���������: 4
 */
public class task1 {
    public static void main(String[] args) {
        int[] values ={1,3,5,8};
        int result=0;
        for (int i = 0; i <values.length ; i++) {
            result +=values[i];
        }
        result /= values.length;
        System.out.println(result);
    }

}
