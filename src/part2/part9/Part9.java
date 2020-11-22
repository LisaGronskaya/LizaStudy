package part2.part9;
/*
Демонстрация времени жизни переменной.
 */

public class Part9 {
    public static void main(String args[]) {
        int x;

        for (x = 0; x < 3; x++) {
            int y = -1;
            System.out.println("y: " + y);
            y = 100;
            System.out.println("Измененной значение y: " + y);
        }
    }
}
