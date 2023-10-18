package Worl_6;

public class StudentTest1 {
    public static void main(String[] args) {
        Student student1 = new Student("张同学", 95);
        Student student2 = new Student("王同学", 80);

        System.out.println("学生信息如下:");
        System.out.println(student1);
        System.out.println(student2);

        System.out.println("比较结果:");
        if (student1.equals(student2)) {
            System.out.println("内容相等");
        } else {
            System.out.println("内容不相等");
        }


    }
}