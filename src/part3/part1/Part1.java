package part3.part1;

/*
Чтение символа с клавиатуры.
 */
public class Part1 {

    public static void main(String args[])
            throws java.io.IOException {

        char ch;

        System.out.print("Нажмите нужную клавишу, а затем клавишу ENTER: ");
        ch = (char) System.in.read();
        System.out.println("Вы нажали клавишу " + ch);
    }
}