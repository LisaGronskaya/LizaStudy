package part3.part9;

/*
Цикл for, выполняющийся с отрицательным приращением переменной.
 */
public class Part9 {
    public static void main(String args[]) {
        int x;
        for (x = 100; x > -100; x -= 5) // на каждой итерации переменная цикла уменьшается на 5
            System.out.println(x);
    }
}
