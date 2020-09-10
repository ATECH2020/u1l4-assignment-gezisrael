import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();

        int secInHours1, secInHours2;
        int secInMin1, secInMin2;
        
         //calculating hours to seconds
         secInHours1 = hours1 * 3600;
         secInHours2 = hours2 * 3600;

         //calculating seconds in minutes
         secInMin1 = minutes1 * 60;
         secInMin2 = minutes2 * 60;

         //adding the secounds together
         System.out.print((secInHours2 - secInHours1) + (secInMin2 - secInMin1) + (seconds2 - seconds1));

        // closing the scanner object
        scanner.close();
    }
}