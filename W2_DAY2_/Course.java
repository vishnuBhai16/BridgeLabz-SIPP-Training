package W2_DAY2_;
public class Course {
    // Instance Variables
    private String courseName;
    private int duration; // in weeks
    private double fee;

    // Class Variable (shared among all objects)
    private static String instituteName = "Default Institute";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance Method: Display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: ₹" + fee);
        System.out.println("Institute: " + instituteName);
    }

    // Class Method: Update institute name
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}

