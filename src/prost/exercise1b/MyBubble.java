package prost.exercise1b;

/*
Демонстрация алгоритма пузырьковой сортировки для массива строк.
 */
public class MyBubble {
    public static void main(String[] args) {
        String[] strarr = {"кошечка", "собачка", "капибара", "енот", "слон", "хомячок"};
        int a, b;
        String t;
        int size = strarr.length;

        System.out.print("Исходный массив строк:");
//        for (int i = 0; i < size; i++)
        for (int i = 0; i < strarr.length; i++)
            System.out.print(" " + strarr[i]);
        System.out.println();

        for (a = 1; a < strarr.length; a++)
            for (b = strarr.length - 1; b >= a; b--) {
                if (strarr[b - 1].compareTo(strarr[b]) > 0) {
                    t = strarr[b - 1];
                    strarr[b - 1] = strarr[b];
                    strarr[b] = t;
                }
            }
        System.out.print("Отсортированный массив:");
        for (int i = 0; i < strarr.length; i++)
            System.out.print(" " + strarr[i]);
        System.out.println();
    }
}
