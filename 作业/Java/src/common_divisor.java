import java.util.Scanner;

public class common_divisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个整数：");
        int num1 = scanner.nextInt();
        System.out.print("请输入第二个整数：");
        int num2 = scanner.nextInt();
        int result = Common_divisor(num1, num2);
        System.out.printf("****运行结果****%n");
        System.out.println("最大公约数是：" + result);
        scanner.close();
    }

    public static int Common_divisor(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
