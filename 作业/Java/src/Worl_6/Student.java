package Worl_6;

public class Student {
    private String stuName;
    private float stuScore;
    public Student() {
    }
    public Student(String stuName, int stuScore) {
        setstuName(stuName);
        setstuScore(stuScore);
    }
    public String getstuName() {
        return stuName;
    }
    public float getstuScore() {
        return stuScore;
    }
    public void setstuName(String stuName) {
        if (stuName.length() > 8) {
            System.out.println("学生姓名不能超过八个字符");
            System.exit(1);
        }
        this.stuName = stuName;
    }
    public void setstuScore(float stuScore) {
        if (stuScore > 100 || stuScore < 0) {
            System.out.println("学生成绩只能在[0，100]区间");
            System.exit(1);
        }
        this.stuScore = stuScore;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj.getClass() != getClass())
            return false;
        Student student = (Student) obj;
        return stuScore == student.stuScore && stuName.equals(student.stuName);
    }

    public String toString() {
        return "姓名: " + stuName  + ",成绩: " + (int)stuScore;
    }
}
