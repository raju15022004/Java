
import java.util.Scanner;

public class Average {
    public static double computerAverage(double a, double b , double c){

        return (a+b+c)/4.0;
     }

     public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);

         System.out.println("Enter three numbers:");
         double num1 =scanner.nextDouble();
         double num2 =scanner.nextDouble();
         double num3 =scanner.nextDouble();

         double Average=computerAverage(num1, num2, num3);
         System.out.println("Average :"+Average);

         scanner.close();

     }

}
