import java.util.Scanner;

public class Min3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个数: ");
        int a = scanner.nextInt();
        System.out.print("请输入第二个数: ");
        int b = scanner.nextInt();
        System.out.print("请输入第二个数: ");
        int c = scanner.nextInt();
        int min = c;
        if (a < min)
            min = a;
        if (b < min)
            min = b;

        System.out.printf("****运行结果****%n");
        System.out.printf("最小值为：%d", min);
        scanner.close();
    }
}
