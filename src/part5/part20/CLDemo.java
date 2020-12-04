package part5.part20;

/*
Отображение всех данных, указываемых в командной строке.
 */
public class CLDemo {
    public static void main(String[] args) {
        System.out.println("Программе передано " + args.length + " аргумента коммандной строки.");

        System.out.println("Список аргументов: ");
        for (int i = 0; i < args.length; i++)
            System.out.println("arg[" + i + "]: " + args[i]);
    }
}
