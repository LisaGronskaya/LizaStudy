package part2.part14;
/*
Демонстрация автоматического пребразования типа long в тип double.
 */

public class Part14 {
    public static void main(String args[]) {
        long L;
        double D;

        L = 100123285L;
        D = L;

        System.out.println("L и D: " + L + " " + D);
    }
}
