package stage1a_oop;

public class Student {
    String name;
    int physics_marks;
    int chemistry_marks;
    int math_marks;
    int average;
    int grade;

    Student(String name, int physics_marks, int chemistry_marks, int math_marks) {
        this.name = name;
        this.physics_marks = physics_marks;
        this.chemistry_marks = chemistry_marks;
        this.math_marks = math_marks;
    }

    int getAverage() {
        return (physics_marks + chemistry_marks + math_marks) / 3;
    }

    String getGrade(int marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75 && marks <= 89) {
            return "B";
        } else if (marks >= 60 && marks <= 74) {
            return "C";
        } else {
            return "Fail";
        }
    }

    void printReport() {
        int avg = getAverage();
        String grade = getGrade(avg);
        System.out.println(name + " | Avg: " + avg + " | Grade: " + grade);
    }

    public static void main(String[] args) {
        // Write your solution here
        Student student_1 = new Student("Akshay", 90, 60, 73);
        Student student_2 = new Student("Spunk", 43, 34, 78);
        student_1.printReport();
        student_2.printReport();
    }
}
