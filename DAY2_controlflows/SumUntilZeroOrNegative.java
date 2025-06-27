public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        double total = 0.0;
        double number;

        System.out.print("Enter a number (0 or negative to stop): ");
        number = scanner.nextDouble();

        while (number > 0) {
            total += number;
            System.out.print("Enter a number (0 or negative to stop): ");
            number = scanner.nextDouble();
        }

        System.out.println("The sum of the numbers entered is: " + total);

        scanner.close();
    }
    
}
