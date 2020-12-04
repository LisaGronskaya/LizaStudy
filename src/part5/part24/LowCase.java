package part5.part24;

/*
Преобразование прописных букв английского алфавита в строчные.
 */
public class LowCase {
    public static void main(String[] args) {
        char ch;

        for (int i = 0; i < 10; i++) {
            ch = (char) ('A' + i);
            System.out.print(ch);

            ch = (char) ((int) ch | 32);

            System.out.print(ch + " ");
        }
    }
}
