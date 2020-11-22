package part2.part1;

/*
Расчет числа кубических дюймов в кубе объемом в 1 куб. милю.
 */
public class Part1 {
    public static void main(String args[]) {
        long ci;
        long im;

        im = 5280 * 12;
        ci = im * im * im;

        System.out.println("В одной кубической миле содержится " + ci + " кубических дюймов");
    }
}
