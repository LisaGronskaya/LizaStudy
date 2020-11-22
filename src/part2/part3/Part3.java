package part2.part3;

/*
Использование символьной переменной как целочисленной.
 */
public class Part3 {
    public static void main(String args[]) {
        char ch;

        ch = 'X';
        System.out.println("ch содержит " + ch);

        ch++;
        System.out.println("Теперь ch содержит " + ch);

        ch = 90;
        System.out.println("Теперь ch содержит " + ch);
    }
}
