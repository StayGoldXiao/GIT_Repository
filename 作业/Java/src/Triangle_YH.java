public class Triangle_YH {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.format("%4d", num);
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
// 杨辉三角形的第n行的m个数可表示为 C(n-1，m-1)
//