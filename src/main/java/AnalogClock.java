import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hoursDegree = scanner.nextInt();
        int minAngle;

        minAngle = ((hoursDegree % 30) * 12);
        
        System.out.print(minAngle);


        scanner.close();
    }
}