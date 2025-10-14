
import java.util.Scanner;

// package practice Question;

public class function {
  public static void main(String[] args) {
    int x=4;
    int y=6;
    int z=8;
      Scanner sc=new Scanner(System.in);
      System.out.print("Input the First number");
      // double x=sc.nextDouble();
      System.out.print("Input the Second number");
      // double y=sc.nextDouble();
      System.out.print("Input the Third number");
      // double z=sc.nextDouble();
      System.out.print("The average value is "+average(x,y,z)+"\n");

  }
  public static double average(double  x, double  y, double z){
    return (x+y+z)/3;
  }

}
