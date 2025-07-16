package Workshop2;

import java.util.ArrayList;
import java.util.List;

public class Course {
      String CourseId;
      String CourseName;
      Faculty faculty;
      public Course(String CourseId, String CourseName,Faculty faculty){
        this.CourseId=CourseId;
        this.CourseName=CourseName;
        this.faculty=faculty;
      }
      public void AssignFaculty(Faculty faculty){
        this.faculty=faculty;
      }
}
class Faculty {
    String facultyId;
    String name;
    public Faculty(String facultyId, String name) {
        this.facultyId = facultyId;
        this.name = name;
    }
}
class Enrollment{
    Student student;
    Course course;
    String grade;
    public Enrollment(Student student,Course course,String grade){
          this.student=student;
          this.course=course;
          this.grade="Not Assigned";
    }
    public void assignGrade(String grade){
        this.grade=grade;
    }
    public void display(){
        System.out.println(student.name+" Is Enrolled In "+course.CourseName + " | Grade: " + grade);
    }
}
class Student {
    String studentId;
    String name;
    String electivePreference;
    List<Enrollment> enrollments = new ArrayList<>();
    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.electivePreference = "None";
    }
    public Student(String studentId, String name, String electivePreference) {
        this.studentId = studentId;
        this.name = name;
        this.electivePreference = electivePreference;
    }
  }
