package Task1;

public class task {
    public static void main(String[] args) {
        int a1 = 5;
        int a2=3;  //степень
        int a= Math.multiplyExact(a1,a2);
        int p1=2;
        int p2 = 2;  //степень
        int p = Math.multiplyExact(p1,p2);
        double m1 = 0.72;
        double m2 =1.2;
        double m3 = (m1+m2);
        double PI1 =3.14;
        double PI = 4*(PI1*PI1);
        double G = PI*(a/(p*m3));
        System.out.println("значение числа G = " + G);

        }


    }

