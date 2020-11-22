package part2.part8;

/*
Демонстрация области действия блока кода.
 */
public class Part8 {
    public static void main(String args[]) {
        int x;
        x = 10;
        if (x == 10) {
            int y = 20;
            System.out.println("x и y: " + x + " " + y);

            x = y * 2;
        }
        System.out.println("x - это " + x);
    }
}
