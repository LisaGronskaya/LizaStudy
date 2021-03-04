package part7.part8;

public class A {
    A() {
        System.out.println("Конструктор А");
    }
}

class B extends A {
    B() {
        System.out.println("Конструктор В");
    }
}

class C extends B {
    C() {
        System.out.println("Конструктор С");
    }
}

class OrderOfConstruction {
    public static void main(String[] args) {
        C c = new C();
    }
}
