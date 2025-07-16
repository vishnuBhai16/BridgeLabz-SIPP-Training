package WorkShop;
import java.util.Scanner;
class Main {
    public static int calculatefare(int distance, int time) {
        return ((distance * 10) + (1 * time));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int tr=0;
        while (true) {
            System.out.println("Do You Want to Continue Ride? yes or no");
            String str = sc.nextLine().trim().toLowerCase();
            if (str.equals("no")) {
                break;
            } else if (str.equals("yes")) {
                System.out.println("Enter Distance in km");
                int d = sc.nextInt();
                System.out.println("Enter Time In Minutes ");
                int t = sc.nextInt();
                sc.nextLine();
                int fare = calculatefare(d, t);
                total += fare;
                tr+=1;
            } else {
                System.out.println("Invalid input. Please enter yes or no.");
            }
        }
        System.out.println("Your Monthly Fare is : " + total);
        System.out.println("Total Rides ARE : "+tr);
        System.out.println("Average Fare Per Ride :"+total/tr);
        System.out.println("Have A GOOD DAY .");
        sc.close();
   }
}
// import java.util.*;

// // Course class
// class Course {
//     String courseId;
//     String courseName;
//     Faculty faculty;

//     public Course(String courseId, String courseName) {
//         this.courseId = courseId;
//         this.courseName = courseName;
//     }

//     public void assignFaculty(Faculty faculty) {
//         this.faculty = faculty;
//         System.out.println("Faculty " + faculty.name + " assigned to course: " + courseName);
//     }
// }

// // Faculty class
// class Faculty {
//     String facultyId;
//     String name;

//     public Faculty(String facultyId, String name) {
//         this.facultyId = facultyId;
//         this.name = name;
//     }
// }

// // Enrollment class
// class Enrollment {
//     Student student;
//     Course course;
//     String grade;

//     public Enrollment(Student student, Course course) {
//         this.student = student;
//         this.course = course;
//         this.grade = "Not Graded";
//     }

//     public void assignGrade(String grade) {
//         this.grade = grade;
//     }

//     public void display() {
//         System.out.println(student.name + " enrolled in " + course.courseName + " | Grade: " + grade);
//     }
// }

// // Student class
// class Student {
//     String studentId;
//     String name;
//     String electivePreference;
//     List<Enrollment> enrollments = new ArrayList<>();

//     // Constructor without elective preference
//     public Student(String studentId, String name) {
//         this.studentId = studentId;
//         this.name = name;
//         this.electivePreference = "None";
//     }

//     // Constructor with elective preference
//     public Student(String studentId, String name, String electivePreference) {
//         this.studentId = studentId;
//         this.name = name;
//         this.electivePreference = electivePreference;
//     }

//     public void enrollInCourse(Course course) {
//         Enrollment enrollment = new Enrollment(this, course);
//         enrollments.add(enrollment);
//         System.out.println(name + " enrolled in " + course.courseName);
//     }

//     public void viewEnrollments() {
//         System.out.println("\nEnrollments for " + name + ":");
//         for (Enrollment e : enrollments) {
//             e.display();
//         }
//     }

//     public Enrollment getEnrollmentByCourse(Course course) {
//         for (Enrollment e : enrollments) {
//             if (e.course == course) return e;
//         }
//         return null;
//     }
// }

// // Main class
// public class UniversitySystem {
//     public static void main(String[] args) {
//         // Create courses
//         Course math = new Course("C101", "Mathematics");
//         Course java = new Course("C102", "Java Programming");

//         // Create faculty
//         Faculty profSmith = new Faculty("F001", "Prof. Smith");
//         Faculty profJane = new Faculty("F002", "Prof. Jane");

//         // Assign faculty to courses
//         math.assignFaculty(profSmith);
//         java.assignFaculty(profJane);

//         // Create students
//         Student s1 = new Student("S001", "Alice");
//         Student s2 = new Student("S002", "Bob", "Java Programming");

//         // Enroll students
//         s1.enrollInCourse(math);
//         s2.enrollInCourse(java);

//         // Assign grades
//         Enrollment e1 = s1.getEnrollmentByCourse(math);
//         if (e1 != null) e1.assignGrade("A");

//         Enrollment e2 = s2.getEnrollmentByCourse(java);
//         if (e2 != null) e2.assignGrade("B+");

//         // View enrollments and grades
//         s1.viewEnrollments();
//         s2.viewEnrollments();
//     }
// }
