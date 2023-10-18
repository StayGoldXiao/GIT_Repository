import java.util.Scanner;

public class Calculate1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个数: ");
        double a = scanner.nextDouble();
        System.out.print("请输入第二个数: ");
        double b = scanner.nextDouble();
        System.out.print("请输入一个运算符 (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        double result1 = 0;

        switch (operator) {
            case '+':
                result1 = a + b;
                break;
            case '-':
                result1 = a - b;
                break;
            case '*':
                result1 = a * b;
                break;
            case '/':
                if (b != 0) {
                    result1 = a / b;
                } else
                    System.out.println("除数不能为零");
                break;
        }

        System.out.println("运算结果为: " + result1);

        scanner.close();
    }
}
