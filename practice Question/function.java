
import java.util.Scanner;


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

// public class function{
//   public static void main(String[] args) {
//       Scanner sc=new Scanner(System.in);
//       int num;

//       System.out.print("Enter an interger");
//       num=sc.nextInt();

//       if(isEven(num)){
//         System.out.println("Number is even");
//       }
//       else{
//         System.out.println("Number is odd");
//       }
//   }
//   public static boolean isEven(int number){
//     if(number%2==0){
//       return true;
//     }
//     else{
//       return false;
//     }
//   }

// }

////////////  palindrome  ///////////////

// public class function{

//   public static void main(String[] args) {
//       System.out.print("Please Enter a number:");
//       Scanner sc=new Scanner(System.in);
//       int palindrome=sc.nextInt();

//       if(ispalindrome(palindrome)){
//         System.out.println("Number : " + palindrome + "is a palindrome");

//       }
//       else{
//         System.out.println("Number :"+ palindrome + "is not a palindrome");
//       }
//   }

//   public static boolean  ispalindrome(int number){
//     int palindrome=number;
//     int reverse=0;

//     while(palindrome !=0){
//       int reamainder=palindrome%10;
//       reverse=reverse*10+reamainder;
//       palindrome=palindrome/10;
//     }

//     if(number == reverse){
//       return true;
//     }
//     return false;
//   }
// }

//////////////  DIY question //////////////

public class function{
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Input an interger ");
      int digits=sc.nextInt();

      System.out.println(" The sum is " + sumDigits(digits));
  }

  public static int sumDigits(int n){
    int sumDigits=0;
    while(n>0){
      int lastDigit=n%10;
      sumDigits +=lastDigit;
      n/=10;
    }

    return sumDigits;
  }
}
