package part5.part19;

/*
Использование строк для управления инструкцией switch.
 */
public class StringSwitch {
    public static void main(String[] args) {

        String command = "cancel";

        switch (command) {
            case "connnect":
                System.out.println("Подключение");
                break;
            case "cancel":
                System.out.println("Отмена");
                break;
            case "disconnect":
                System.out.println("Отключение");
                break;
            default:
                System.out.println("Неверная команда");
                break;
        }
    }
}
