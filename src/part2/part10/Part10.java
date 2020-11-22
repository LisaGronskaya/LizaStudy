package part2.part10;

/*
Демонстрация использования оператора %
 */
public class Part10 {
    public static void main(String args[]) {
        int iresult, irem;
        double dresult, drem;

        iresult = 10 / 3;
        irem = 10 % 3;

        dresult = 10.0 / 3.0;
        drem = 10.0 % 3.0;

        System.out.println("Результат и остаток от деления 10 / 3: " + iresult + " " + irem);
        System.out.println("Результат и остатов от деления 10.0 / 3.0: " + dresult + " " + drem);
    }
}
