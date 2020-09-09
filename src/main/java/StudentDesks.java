import java.util.Scanner;
import java.lang.Math;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        double classADesks = scanner.nextDouble();
        double classBDesks = scanner.nextDouble();
        double classCDesks = scanner.nextDouble();

        double aDesks, bDesks, cDesks;
        double deskPair = 2;
        double totalDesks;
        int convertInt;

        /*
         *  your code goes here
         */
         aDesks = (classADesks / deskPair);
         bDesks = (Math.round(classBDesks / deskPair));
         cDesks = (classCDesks / deskPair);

         totalDesks = (aDesks + bDesks + cDesks);
         
        System.out.print((int)totalDesks);

        // closing the scanner object
        scanner.close();
    }
}