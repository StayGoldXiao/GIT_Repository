public class num100_7 {
    public static void main(String[] args) {
        int i, n;
        for (i = 7, n = 1; i <= 100; i += 7, n++) {
            System.out.printf("%d ", i);
            if (n % 5 == 0)
                System.out.print("\n");
        }
        System.out.println("\n被7整除的数共有：" + (n - 1) + "个");
    }
}
