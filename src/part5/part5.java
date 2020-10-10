package part5;

public class part5 {
    public static void main (String args []) {
        int a, b, c;

        a = 2;
        b = 3;

        if(a < b) System.out.println("a меньше b");
        if(a == b) System.out.println("Вы  никогда не увидите этот текст");
        System.out.println();

        c = a - b;
        System.out.println("c содержит -1");
        if(c >= 0) System.out.println("c - не отрицательное число");
        if(c < 0) System.out.println("c - отрицательное число");
        System.out.println();

        c = b - a;
        System.out.println("c содержит 1");
        if(c >= 0) System.out.println("c - не отрицательное число");
        if(c < 0) System.out.println("c - отрицательное число");
    }
}
