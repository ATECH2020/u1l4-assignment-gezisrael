import java.util.Scanner;
import java.lang.Math;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        double userTime = scanner.nextDouble();

        double hour;
        double minute;
        double minuteHand;


        /*
         *  your code goes here
         */
         hour = (Math.floor(userTime /30));
         minute = ((userTime / 30) - hour);

         minuteHand = (Math.round(minute * 60));
         System.out.print((int)hour + ":" + (int)minuteHand);

        // closing the scanner object

        scanner.close();
    }
}