import java.util.Scanner;
public class Sort3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个数: ");
        int a = scanner.nextInt();
        System.out.print("请输入第二个数: ");
        int b = scanner.nextInt();
        System.out.print("请输入第二个数: ");
        int c = scanner.nextInt();
        int temp = a;
        if (a < b) {
            a = b;
            b = temp;
        }
        if (temp < c) {
            b = c;
            c = temp;
        }
        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }
        System.out.printf("****运行结果****%n");
        System.out.printf("%d > %d > %d", a, b, c);
        scanner.close();
    }
}
