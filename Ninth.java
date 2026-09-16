import java.util.*;

class Course {
    String courseName;
    String duration;

    Course(String courseName, String duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return courseName + " (" + duration + ")";
    }
}

class Student {
    String name;
    Course enrolledCourse;

    Student(String name, Course enrolledCourse) {
        this.name = name;
        this.enrolledCourse = enrolledCourse;
    }

    @Override
    public String toString() {
        return "Student: " + name +
                "\nCourse: " + enrolledCourse;
    }
}

class PremiumStudent extends Student {
    int discount;

    PremiumStudent(String name, Course enrolledCourse, int discount) {
        super(name, enrolledCourse);
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Premium Student: " + name +
                "\nCourse: " + enrolledCourse +
                "\nDiscount: " + discount + "%";
    }
}

public class Ninth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Course input
        String[] courseData = sc.nextLine().split(",");
        Course course = new Course(courseData[0], courseData[1]);

        // Normal student
        String[] studentData = sc.nextLine().split(",");
        Student student = new Student(studentData[0], course);

        // Premium student
        String[] premiumData = sc.nextLine().split(",");
        PremiumStudent premium = new PremiumStudent(
                premiumData[0],
                course,
                Integer.parseInt(premiumData[2])
        );

        System.out.println(student);
        System.out.println(premium);
    }
}