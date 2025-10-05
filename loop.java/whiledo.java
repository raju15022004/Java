
import java.util.Scanner;


//   public static void main(String[] args) {
//       int counter=0;
//       while(counter<100){
//         System.out.println("Raju");
//         counter++;
//       }
//   }

// }

/////////////// number //////////////

// public class whiledo{
//   public static void main(String[] args) {
//       int counter=1;
//       while(counter<=10){
//         System.out.print(counter+" ");
//         counter++;
//       }
//       System.out.println();
//   }
// }


////////////////////// sum number ////////////

// public class whiledo{
//   public static void main(String[] args) {
//       Scanner sc=new Scanner(System.in);
//       int n =sc.nextInt();
//       int sum=0;

//       int i=1;
//       while(i<=n){
//         sum +=i;
//         i++;
//       }

//       System.out.println("sum is :"+sum );
//   }
// }


/////////////////// for loop ////////////////
//  public class whiledo{
//   public static void main(String[] args) {
//        int A=1;

//       for(int i=1;i<=10;i++){
//         System.out.println("Raju");
//       }
//   }
//  }

////////////// square ///////////////

// public class whiledo{
//   public static void main(String[] args) {
//       for(int i=1;i<=4;i++){
//         System.out.println("****");
//       }
//   }
// }


/////////////// reverse //////////////

// public class whiledo{
//   public static void main(String[] args) {
//       int n=10899;

//       while(n>0){
//         int lastDigit=n%10;
//         System.out.print(lastDigit+" ");
//         n=n/10;

//       }
//       System.out.println();
//   }
// }


///////////////// prime number //////////////

public class whiledo{
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();

      boolean isPrime=true;
      for(int i=2;i<=n-1;i++){
        if(n % i==0){
          isPrime=false;
        }
      }
      if(isPrime == true){
        System.out.println("n is prime");
      }
      else{
        System.out.println("n is not prime");
      }
  }
}
