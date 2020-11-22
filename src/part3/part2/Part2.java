package part3.part2;

/*
Игра в угадывание букв.
 */
public class Part2 {
    public static void main(String args[])
            throws java.io.IOException {
        char ch, answer = 'K';
        System.out.println("Задумана буква из диапазона A-Z.");
        System.out.print("Попытайтесь ее угадать: ");

        ch = (char) System.in.read();
        if (ch == answer) System.out.println("** Правильно! **");
    }
}
