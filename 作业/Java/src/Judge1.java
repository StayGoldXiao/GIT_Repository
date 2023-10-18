import java.util.Scanner;

public class Judge1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入: ");
        char ch1 = scanner.next().charAt(0);
        int ch= (int) ch1;

        if (ch >= 65 && ch <= 90) {
            System.out.println("输入的是大写字母");
        } else if (ch >= 97 && ch <= 122) {
            System.out.println("输入的是小写字母");
        } else if (ch >= 48 && ch <= 57) {
            System.out.println("输入的是数字");
        } else {
            System.out.println("输入的是其他字符");
        }

        scanner.close();
    }
}
