package part1.part8;

public class Part8 {

    public static void main(String args[]) {
        double gallons, liters;
        int counter;

        counter = 0;
        for (gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854;
            System.out.println(gallons + " галлонам соответветствует " + liters + " литра.");

            counter++;
            if (counter == 10) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
