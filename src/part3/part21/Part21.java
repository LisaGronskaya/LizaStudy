package part3.part21;

/*
Применение инструкции break для выхода из цикла.
 */
public class Part21 {
    public static void main(String[] args) {
        int num;

        num = 100;

        for (int i = 0; i < num; i++) {
            if (i * i >= num) break;

            System.out.print(i + " ");
        }
        System.out.println("Цикл завершен.");
    }
}
