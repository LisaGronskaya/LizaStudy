package part3.part15;

/*
Объявление переменной цикла for в самом цикле for.
 */
public class Part15 {
    public static void main(String args[]) {
        int sum = 0;
        int fact = 1;

        for (int i = 1; i <= 5; i++) {
            sum += 1;
            fact *= i;
        }
        System.out.println("Сумма: " + sum);
        System.out.println("Факториал: " + fact);
    }
}
