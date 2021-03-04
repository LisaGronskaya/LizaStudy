package part6.part19;

/*
Простая версия класса Quiksort
 */
public class Quiсksort {
    static void qsort(char items[]) {
        qs(items, 0, items.length - 1);
    }

    private static void qs(char items[], int left, int rigth) {
        int i, j;
        char x, y;

        i = left;
        j = rigth;
        x = items[(left + rigth) / 2];

        do {
            while ((items[i]) < x && (i < rigth)) i++;
            while ((x < items[j]) && (j > left)) j--;

            if (i <= j) {
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++;
                j--;
            }
        } while (i <= j);
        if (left < j) qs(items, left, j);
        if (i < rigth) qs(items, i, rigth);
    }
}

class QSDemo {
    public static void main(String[] args) {
        char a[] = {'d', 'x', 'a', 'r', 'p', 'j', 'i'};
        int i;

        System.out.print("Исходный массив: ");
        for (i = 0; i < a.length; i++)
            System.out.print(a[i]);
        System.out.println();

        Quiсksort.qsort(a);

        System.out.print("Отсортированный массив: ");
        for (i = 0; i < a.length; i++)
            System.out.print(a[i]);
    }
}
