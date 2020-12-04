package part5.part18;

/*
Демонстрация использования массивов строк.
 */
public class StringArrays {
    public static void main(String[] args) {
        String strs[] = {"Эта", "строка", "является", "текстом."};

        System.out.println("Исходный массив: ");
        for (String s : strs)
            System.out.print(s + " ");
        System.out.println('\n');

        strs[2] = "также является";
        strs[3] = "текстом!";

        System.out.println("Измененный массив: ");
        for (String s : strs)
            System.out.print(s + " ");
    }
}
