package part8.part7;

public class SeriesDemo {
    public static void main(String[] args) {
        ByTwos ob = new ByTwos();

        for (int i = 0; i < 5; i++)
            System.out.println("Следующее значение: " + ob.getNext());
    }
}
