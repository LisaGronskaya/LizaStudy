package part7.part5;

/*
Использование ключевого слова super для предотвращения сокрытия имен.
 */
public class A {
    int i;
}

class B extends A {
    int i;

    B(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("i в суперклассе: " + super.i);
        System.out.println("i в подклассе: " + i);
    }
}

class UseSuper {
    public static void main(String[] args) {
        B subOB = new B(1, 2);

        subOB.show();
    }
}
