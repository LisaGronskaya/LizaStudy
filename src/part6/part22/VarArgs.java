package part6.part22;

/*
Демонстрация использования метода с переменным числом аргументов.
 */
public class VarArgs {
    static void vaTest(int... v) {
        System.out.println("Количество аргументов: " + v.length);
        System.out.println("Содержимое: ");

        for (int i = 0; i < v.length; i++)
            System.out.println("arg " + i + ": " + v[i]);

        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(10);
        vaTest(1, 2, 3);
        vaTest();
    }
}
