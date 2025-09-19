
import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter two number:");
        double num1=scanner.nextDouble();
        double num2=scanner.nextDouble();

        System.out.println("Minimum:"+Math.min(num1,num2));

        System.out.println("Maximum:"+Math.max(num1,num2));


        System.out.println("Square Root of:"+num1+":"+Math.sqrt(num1));

        System.out.println(num1+"raised to the power"+num2+":"+Math.pow(num1,num2));

        System.out.println("Average:"+((num1+num2)/2));

        System.out.println("Absolute value of"+num1+":"+Math.abs(num1));

        scanner.close();
    }
}
