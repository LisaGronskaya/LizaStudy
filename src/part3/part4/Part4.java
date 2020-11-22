package part3.part4;

/*
Игра в угадывание букв, 3 версия.
 */
public class Part4 {
    public static void main(String args[])
            throws java.io.IOException {
        char ch, answer = 'K';

        System.out.println("Задумана буква из диапазона A-Z.");
        System.out.print("Попытайтесь ее угадать: ");

        ch = (char) System.in.read();
        if (ch == answer) System.out.println("**Правильно!**");
        else {
            System.out.print("...Извините, нужная буква находится ");
            if (ch < answer) System.out.println("ближе к концу алфавита");
            else System.out.println("ближе к началу алфавита");
        }
    }
}
