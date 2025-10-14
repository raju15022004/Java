
import java.util.Scanner;



// public class function {
//   public static void main(String[] args) {
//     int x=4;
//     int y=6;
//     int z=8;
//       Scanner sc=new Scanner(System.in);
//       System.out.print("Input the First number");
//       // double x=sc.nextDouble();
//       System.out.print("Input the Second number");
//       // double y=sc.nextDouble();
//       System.out.print("Input the Third number");
//       // double z=sc.nextDouble();
//       System.out.print("The average value is "+average(x,y,z)+"\n");

//   }
//   public static double average(double  x, double  y, double z){
//     return (x+y+z)/3;
//   }

// }


///////////////////  isEven that accepts an int argument /////////

public class function{
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int num;

      System.out.print("Enter an interger");
      num=sc.nextInt();

      if(isEven(num)){
        System.out.println("Number is even");
      }
      else{
        System.out.println("Number is odd");
      }
  }
  public static boolean isEven(int number){
    if(number%2==0){
      return true;
    }
    else{
      return false;
    }
  }

}
