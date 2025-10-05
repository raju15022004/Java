
import java.util.Scanner;

// public class whiledo {
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

public class whiledo{
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n =sc.nextInt();
      int sum=0;

      int i=1;
      while(i<=n){
        sum +=i;
        i++;
      }

      System.out.println("sum is :"+sum);
  }
}
