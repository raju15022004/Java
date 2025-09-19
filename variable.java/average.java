
import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);

        System.out.print(" Enter first number (A): ");
        double A =Scanner.nextDouble();

        System.out.print(" Enter secound number (B): ");
        double B =Scanner.nextDouble();

        System.out.print(" Enter third number (C): ");
        double C =Scanner.nextDouble();

        double average = (A+B+C)/3;

        System.out.println("The average  of the three numbers is: " + average);

        Scanner.close();

    }
    
}
