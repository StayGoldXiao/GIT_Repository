import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入学号: ");
        String id = scanner.nextLine();
        System.out.print("请输入班级: ");
        String classroom = scanner.nextLine();
        System.out.print("请输入姓名: ");
        String name = scanner.nextLine();
        System.out.println("******你的个人信息如下：******: ");
        System.out.println("*****************************");
        System.out.println("\t\t学号: " + id);
        System.out.println("\t\t班级: " + classroom);
        System.out.println("\t\t姓名: " + name);
        scanner.close();
    }
}
