package part5.part1;

/*
Демонстрацмя одномерного массива.
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int sample[] = new int[10];
        int i;

        for (i = 0; i < 10; i++) {
            sample[i] = i;
            System.out.println("Элемент [" + i + "]:" + sample[i]);
        }
//        for (i = 0; i < 10; i++)
//            System.out.println("Элемент [" + i + "]:" + sample[i]);
    }
}
