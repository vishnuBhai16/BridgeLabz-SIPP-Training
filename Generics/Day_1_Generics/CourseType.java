package Day_1_Generics;

import java.util.List;

abstract class CourseType {
    String courseName;
    public CourseType(String name) {
        this.courseName = name;
    }
    abstract void evaluate();
}

class ExamCourse extends CourseType {
    public ExamCourse(String name) { super(name); }
    void evaluate() { System.out.println("Exam for " + courseName); }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String name) { super(name); }
    void evaluate() { System.out.println("Assignment for " + courseName); }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String name) { super(name); }
    void evaluate() { System.out.println("Research for " + courseName); }
}

class Course<T extends CourseType> {
    T type;
    public Course(T type) {
        this.type = type;
    }

    public void conductEvaluation() {
        type.evaluate();
    }

    public static void handleAllCourses(List<? extends CourseType> courses) {
        for (CourseType ct : courses) {
            ct.evaluate();
        }
    }
}

