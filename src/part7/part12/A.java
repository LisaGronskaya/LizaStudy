package part7.part12;

/*
Методы с разными сигнатурами не переопределяются, а перегружаются.
 */
public class A {
    int i, j;

    A(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}

class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show(String msg) {
        System.out.println(msg + k);
    }
}

class Overload {
    public static void main(String[] args) {
        B subOb = new B(1, 2, 3);

        subOb.show("k: ");
        subOb.show();
    }
}
