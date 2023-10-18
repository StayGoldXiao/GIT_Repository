package Worl_6;
import java.util.Arrays;
import java.util.Comparator;

public class StudentTest2 {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("赵同学", 80);
        students[1] = new Student("李同学", 75);
        students[2] = new Student("张同学", 85);
        students[3] = new Student("孙同学", 95);
        students[4] = new Student("王同学", 90);


        Arrays.sort(students,Comparator.comparing(Student::getstuScore));

        for (Student student : students)
            System.out.println("姓名: " + student.getstuName()+",成绩："+(int)student.getstuScore());
    }
}
