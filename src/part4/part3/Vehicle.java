package part4.part3;

/*
Добавление метода range() в класс Vehicle.
 */
public class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    void range() {
        System.out.println(" Дальность - " + fuelcap * mpg + " миль.");
    }
}

class AddMeth {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1, range2;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        System.out.print("Мини-фургон может перевезти " + minivan.passengers + " пассижиров.");
        minivan.range();
        System.out.print("Спортивный автомобиль может перевезти " + sportscar.passengers + " пассижиров.");
        sportscar.range();
    }
}