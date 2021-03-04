package part6.part1;

/*
Сравнение модификаторов доступа public и private.
 */
public class MyClass {
    private int alpha;
    public int beta;
    int gama;

    void setAlpha(int a) {
        alpha = a;
    }

    int getAlpha() {
        return alpha;
    }
}

class AccessDemo {
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        ob.setAlpha(-99);
        System.out.println("ob.alpha: " + ob.getAlpha());

        ob.beta = 88;
        ob.gama = 99;
    }
}
