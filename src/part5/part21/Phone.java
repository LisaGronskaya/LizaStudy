package part5.part21;

/*
Простейший автоматизированный телефонный справочник.ФИГНЯ, проверить
 */
public class Phone {
    public static void main(String[] args) {
        String numbers[][] = {
                {"Tom", "555-3222"},
                {"Mary", "555-8976"},
                {"John", "555-1400"}
        };
        int i;

        if (args.length != 1)
            System.out.println("Использование: java Phone <имя>");
        else {
            for (i = 0; i < numbers.length; i++) {
                if (numbers[i][0].equals(args[0])) {
                    System.out.println(numbers[i][0] + ": " + numbers[i][1]);
                    break;
                }
            }
            if ((i == numbers.length))
                System.out.println("ИНя не найдено.");
        }
    }
}
