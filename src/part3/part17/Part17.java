package part3.part17;

/*
Вычисление целых степеней числа 2.
 */
public class Part17 {
    public static void main(String args[]) {
        int e;
        int result;

        for (int i = 0; i < 10; i++) {
            result = 1;
            e = i;
            while (e > 0) {
                result *= 2;
                e--;
            }
            System.out.println("2 в степени " + i + " равно " + result);
        }
    }
}
