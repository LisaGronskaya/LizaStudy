package part2.part13;

/*
Демонстрация роли побочных эффектов.
 */

public class Part13 {
    public static void main(String args[]) {
        int i;
        i = 0;

        if (false & (++i < 100))
            System.out.println("Эта строка не будет отображаться");
        System.out.println("Инструкция if выполняется: " + i);

        if (false && (++i < 100))
            System.out.println("Эта строка не будет отображаться");
        System.out.println("Инструкция if выполняется: " + i);

    }
}