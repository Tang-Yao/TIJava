package innerclasses;

/**
 * Created by Administrator on 2016/11/1.
 */
public class TestBed {
    public void f() { System.out.println("f()"); }

    public static class Tester {
        public static void main(String[] args) {
            TestBed t = new TestBed();
            t.f();
        }
    }
}
