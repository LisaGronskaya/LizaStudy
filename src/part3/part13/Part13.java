package part3.part13;

/*
Пропуск отдельных составляющих в определении цикла for.
 */
public class Part13 {
    public static void main(String args[]) {
        int i;
        i = 0;

        for (; i < 10; ) {
            System.out.println("Переход #" + i);
            i++;
        }
    }
}
