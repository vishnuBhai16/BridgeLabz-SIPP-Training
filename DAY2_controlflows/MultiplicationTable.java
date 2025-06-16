public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 5; // You can change this to any number you want the multiplication table for
        int limit = 10; // The limit for the multiplication table

        System.out.println("Multiplication Table for " + number + ":");
        
        // Loop to generate the multiplication table
        for (int i = 1; i <= limit; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
    
}
