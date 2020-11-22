package part3.part11;

/*
Выполнение цикла до тех пор, пока с клавиатуры не будет введена буква s.
 */
public class Part11 {
    public static void main(String args[])
            throws java.io.IOException {
        int i;
        System.out.println("Для остановки нажмитеклавишу S");

        for (i = 0; (char) System.in.read() != 'S'; i++)
            System.out.println("Проход #" + i);
    }
}
