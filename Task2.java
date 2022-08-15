package Task1;

/**Ќайти в строке самое длинное слово и количество символов в нем. ≈сли таких слов несколько - вернуть самое
 * последнее из них (самое правое). ≈сли строка состоит из одного слова - вернуть исходную строку в верхнем регистре
 * и количество символов в ней. ¬ качестве разделител€ слов выступает пробел. «наки препинани€ не учитывать(представим,
 * что их нет во входной строке)
 */

public class Task2 {
    public static void main(String[] args) {
        String line = "Team Spirit wins Arlington Major";
        String T = "Team";
        int T1 = T.length();
        String S = "Spirit";
        int S1 = S.length();
        String W = "wins";
        int W1 = W.length();
        String A = "Arlington";
        int A1 = A.length();
        String M = "Major";
        int M1 = M.length();
        String team = T + T1;
        String spirit = S + S1;
        String wins = W + W1;
        String arlington = A + A1;
        String major = M + M1;
        System.out.println(arlington);

        }
        }
   
