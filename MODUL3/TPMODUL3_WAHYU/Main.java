package MODUL3.TPMODUL3_WAHYU;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for student information
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();
        
        int studentId = 0;
        // Input validation for student ID
        while (true) {
            System.out.print("Enter student ID: ");
            try {
                studentId = scanner.nextInt();
                scanner.nextLine(); // consume the rest of the line
                break;
            } catch (InputMismatchException ime) {
                // If input was not an integer, print an error message and try again
                System.out.println("Invalid input. Please enter a valid integer for student ID.");
                scanner.next(); // discard the incorrect input
            }
        }
        
        // Prompt for courses to enroll in
        System.out.print("Enter courses to enroll in (separated by commas): ");
        String coursesInput = scanner.nextLine();
        String[] coursesArray = coursesInput.split(",");

        // Creating the student object and enrolling in courses
        Student student = new Student(studentName, studentId);
        for (String course : coursesArray) {
            student.enrollInCourse(course.trim());
        }

        // Displaying the student details
        System.out.println(student.getUserDetails());

        scanner.close();
    }
}