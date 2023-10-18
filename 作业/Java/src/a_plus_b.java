import java.util.Scanner;

public class a_plus_b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个数: ");
        int a = scanner.nextInt();
        System.out.print("请输入第二个数: ");
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.printf("****运行结果****%n");
        System.out.printf("%d + %d = %d", a, b, sum);
        scanner.close();
    }
}
