public class EmployeeBonus {
    public static void main(String[] args) {
        int salary = 50000; // Example salary
        int bonus = 0; // Initialize bonus

        // Calculate bonus based on salary
        if (salary < 30000) {
            bonus = 5000; // Bonus for salary less than 30,000
        } else if (salary < 60000) {
            bonus = 10000; // Bonus for salary between 30,000 and 60,000
        } else {
            bonus = 15000; // Bonus for salary above 60,000
        }

        // Print the calculated bonus
        System.out.println("The bonus for the employee is: " + bonus);
    }
    
}
