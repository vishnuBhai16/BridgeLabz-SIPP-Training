public class SpringSeason {
    public static void main(String[] args) {
        // Define the month and day
        int month = 3; // March
        int day = 20; // 20th

        // Check if the date is in the spring season
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day < 21)) {
            System.out.println("It is Spring season.");
        } else {
            System.out.println("It is not Spring season.");
        }
    }
    
}
