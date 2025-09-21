
import java.util.Scanner;

// package flowchart;

public class average {
   public static void main(String[] args) {

    Scanner sc =new Scanner(System.in);

    int n=25;
    double sum=0;

    System.out.println("Enter"+n+"exam scores:");
      for(int i=1;i<=n;i++){
        System.out.println("Score"+i+":");
        double score=sc.nextDouble();
        sum += score;
      }

      double average=sum/n;

      System.out.println("Average of 25 exam scores="+average);

      sc.close();
   }
}
