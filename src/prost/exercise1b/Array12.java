package prost.exercise1b;

public class Array12 {
    public static void main(String[] args) {
        double array[] = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.1};
        double sum = 0;

        for (int i = 0; i < array.length; i++)
            sum += array[i];
        System.out.println("Среднее арифметическое массива: " + sum / array.length);
    }
}
