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
        int seconds2 = scanner.nextInt()
        int secInHours1, secInHours2;


        /*
         *  your code goes here
         */
         secInHours1 = hours1 * 3600;
         secInHour2 = hours2 * 3600




        // closing the scanner object
        scanner.close();
    }
}