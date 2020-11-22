package part3.part3;

/*
Игра в угадывание букв, 2 версия.
 */
public class Part3 {
    public static void main(String args[])
            throws java.io.IOException {
        char ch, answer = 'K';

        System.out.println("Задумана буква из диапазона A-Z.");
        System.out.print("Попытайтесь ее угадать: ");

        ch = (char) System.in.read();
        if (ch == answer) System.out.println("**Правильно!**");
        else System.out.println("...Извините, вы не угадали.");
    }
}
