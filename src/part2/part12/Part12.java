package part2.part12;

/*
Демонстрация использования укороченныех логических операторов.
 */
public class Part12 {
    public static void main(String args[]) {
        int n, d, q;

        n = 10;
        d = 2;
        if (d != 0 && (n % d) == 0)
            System.out.println(d + " является делителем " + n);
        d = 0;

        if (d != 0 & (n % d) == 0)
            System.out.println(d + " является делителем" + n); //деление на ноль бууууууу
    }
}
