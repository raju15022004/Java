import java.util.Scanner;

public class first {

    public static void main(String[] args) {
         Scanner Scanner=new Scanner(System.in);

    System.out.print("enter the radius of the circle:");
    double radius=Scanner.nextDouble();

    double area = Math.PI*Math.pow(radius,2);

    System.err.println("The area of circle is: " +area);

    Scanner.close();
    }

    
}