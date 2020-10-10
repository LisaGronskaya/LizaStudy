package part3;

import part1.MyFirstChangForGitHub;

public class part3 {
    public static void main(String args[]) {
        int x;
        double y;
        x = 10;
        y = 10.0;
        System.out.println("Начальное значение переменной x: " + x);
        System.out.println("Начальное значение переменной y: " + y);
        System.out.println();

        x = x / 4;
        y = y / 4;

        System.out.println("Значение переменной x после деления: " + x);
        System.out.println("Значение переменной y после деления: " + y);

        MyFirstChangForGitHub myFirstChangForGitHub = new MyFirstChangForGitHub();
        String value = myFirstChangForGitHub.getValue();
        System.out.println(value);

    }
}
