
import java.util.Scanner;

// package flowchart;

public class root {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter coefficient a:");
      double a = sc.nextDouble();

      System.out.println("Enter coefficient b:");
      double b=sc.nextDouble();

      if(a==0){
        System.out.println("Not a quadratic equation(a=0).");

      }else{
        double root1=1;
        double root2=-(b+1)/a;

        System.out.println("Root 1 = " +root1);
        System.out.println("Root 2 = " +root2);
      }

      sc.close();
  }
}
