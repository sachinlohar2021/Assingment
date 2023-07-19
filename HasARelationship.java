import java.util.ArrayList;
import java.util.List;

class University {

    private String universityName;
    List<Student> student;

    University(String universityName, List<Student> student) {
        this.universityName = universityName;
        this.student =student;
    }

    @Override
    public String toString() {
        return "University{" +
                "universityName='" + universityName + '\'' +
                ", student=" + student +
                '}';
    }
}

class Student {

    private String studentName;
    private int mobileNo;

    Student(String studentName, int mobileNo) {
        this.studentName = studentName;
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", mobileNo=" + mobileNo +
                '}';
    }
}

// Aggregate
public class HasARelationship {

    public static void main(String[] args) {

        Student s = new Student("Sachin",1233);
        Student s1 = new Student("Yash",123323);

        List<Student> studList=new ArrayList<>();
        studList.add(s);
        studList.add(s1);

        University u =new University("Pune University",studList);

        System.out.println(u);

    }
}
