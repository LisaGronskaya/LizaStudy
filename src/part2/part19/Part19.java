package part2.part19;

/*
Программа, находящая все простые числа от 2 до 100.
 */
public class Part19 {
    public static void main(String args[]) {
        int i, j;
        boolean insprime;

        for (i = 2; i < 100; i++) {
            insprime = true;

            for (j = 2; j <= i / j; j++)
                if ((i % j) == 0) insprime = false;

            if (insprime)
                System.out.println(i + " - простое число.");
        }
    }
}
