package Work_5;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {23, 13, 20, 30, 25};
        TestArray testArray = new TestArray();
        int max = testArray.getMax(arr);

        System.out.println("数组中最大值为: " + max);
    }
}
