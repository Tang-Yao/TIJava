package containers;

/**
 * Created by ty on 2017/1/4.
 */
public class TestParam {
    public final int SIZE;
    public final int LOOPS;
    public TestParam(int size, int loops) {
        SIZE = size;
        LOOPS = loops;
    }

    public static TestParam[] array(int... values) {
        int size = values.length / 2;
        TestParam[] result = new TestParam[size];
        int n = 0;
        for (int i = 0; i < size; i++)
            result[i] = new TestParam(values[n++], values[n++]);

        return result;
    }

    public static TestParam[] array(String[] values) {
        int[] vals = new int[values.length];
        for (int i = 0; i < vals.length; i++) {
            vals[i] = Integer.decode(values[i]);
        }
        return array(vals);
    }
}
