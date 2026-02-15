package stage1b_corejava;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        // Ask how many students
        Scanner sc = new Scanner(System.in);
        System.out.print("How many students ? : ");
        int count = sc.nextInt();
        sc.nextLine();
        // create two arrays - name and marks
        String[] names = new String[count];
        int[] marks = new int[count];
        // Loop to collect each student's name and marks
        for (int i = 0; i < count; i++) {
            System.out.print("Enter your Name: ? ");
            String studentName = sc.nextLine();
            names[i] = studentName;
            System.out.print("Enter your Marks: ? ");
            int studentMark = sc.nextInt();
            sc.nextLine();
            marks[i] = studentMark;
        }
        // Loop again to print name, marks, grade
         String topper = "";
        double average = 0;
        double total = 0;
        int highestMark = -1;
        for (int i = 0; i < count; i++) {
            String grade;

            if(marks[i] > highestMark){
                highestMark = marks[i];
                topper = names[i];
            }



            total = marks[i] + total;

            if(marks[i] >= 90){
                grade = "A";
            } else if (marks[i] >= 80) {
                grade = "B";
            } else if (marks[i] >= 70) {
                grade = "C";
            } else if (marks[i] >= 60) {
                grade = "D";
            }else{
                grade = "Fail";
            }
            System.out.println(names[i] + ":" + marks[i] + " " + grade);




        }
        average = total / count;
        System.out.println("Class average : " + average);
        System.out.println("Topper : " + topper);
        // Calculate average while looping
        // Track topper while looping
    }
}
