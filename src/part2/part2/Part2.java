package part2.part2;

/*
Определение длины гипотенузы исходя из длины катетов по теореме Пифагора.
 */
public class Part2 {
    public static void main(String args[]) {
        double x, y, z;

        x = 3.0;
        y = 4.0;

        z = Math.sqrt(x * x + y * y);
        System.out.println("Длина гипотенузы: " + z);
    }
}
