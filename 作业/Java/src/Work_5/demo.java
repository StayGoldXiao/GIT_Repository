package Work_5;

class MyClass {
    public void testParams(int... arr) {
        System.out.print("使用不定长参数!");
    }
    public void testParams(int x, int y) {
        System.out.print("使用两个整型参数!");
    }
}
public class demo {
    public static void main(String[] args) {
        int a[]={1,2,3};
        MyClass x = new MyClass();
        x.testParams(a);
        x.testParams(0, 1);
        x.testParams(0, 1, 2);
    }
}
