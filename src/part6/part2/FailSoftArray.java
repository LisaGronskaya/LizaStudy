package part6.part2;

/*
В этом классе реализуется "отказоустойчивый" массив, предотвращающий ошибки времени выполнения.
 */
/*
public class FailSoftArray {
    private int a[];
    private int errval;
    public int length;

    public FailSoftArray(int size, int errv) {
        a = new int[size];
        errval = errv;
        length = size;
    }

    public int get(int index) {
        if (indexOk(index)) return a[index];
        return errval;
    }

    private boolean indexOk(int index, int val) {
    if (indexOk(index)) {
        a[index] = val;
        return true;
    }
    return false
    }
}
*/