package part3.part30;

/*
Программа, которая считывает символы с клавиатуры до тех пор, пока не встретится точка версия из ответов.
 */
public class Part30_1 {
    public static void main(String[] args)
            throws java.io.IOException {

        char ch;
        int spaces = 0;

        System.out.println("Для остановки введите символ точки.");

        do {
            ch = (char) System.in.read();
            if (ch == ' ') spaces++;
        } while (ch != '.');
        System.out.println("Пробелов: " + spaces);
    }
}
