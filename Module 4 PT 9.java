import java.util.Scanner;

public class Main {
    // Student class
    static class Student {
        // Attributes
        String name;
        int age;
        double grade;

        // Constructor
        public Student(String name, int age, double grade) {
            this.name = name;
            this.age = age;
            this.grade = grade;
        }

        // Method to display student details
        void displayStudent() {
            System.out.println("Student Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Grade: " + grade);
        }

        // Overloaded methods to update grade
        void setGrade(int newGrade) {
            this.grade = newGrade;
            System.out.println("Updating grade (int)... New Grade: " + grade);
        }

        void setGrade(double newGrade) {
            this.grade = newGrade;
            System.out.println("Updating grade (double)... New Grade: " + grade);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for Student 1
        System.out.print("Enter student name: ");
        String name1 = scanner.nextLine();

        System.out.print("Enter student age: ");
        int age1 = scanner.nextInt();

        System.out.print("Enter student grade: ");
        double grade1 = scanner.nextDouble();

        // Creating student object
        Student student1 = new Student(name1, age1, grade1);

        // Displaying initial details
        System.out.println("\nInitial Student Details:");
        student1.displayStudent();

        // Updating grades using method overloading
        System.out.print("\nEnter new grade (int) for student: ");
        int newGradeInt = scanner.nextInt();
        student1.setGrade(newGradeInt);

        System.out.print("\nEnter new grade (double) for student: ");
        double newGradeDouble = scanner.nextDouble();
        student1.setGrade(newGradeDouble);

        // Display updated details
        System.out.println("\nUpdated Student Details:");
        student1.displayStudent();

        // Close the scanner to prevent memory leaks
        scanner.close();
    }
}
