// public class patternEx {

//   public static void main(String[] args) {
//     // int line=0;
//     for(int line=1;line<=6;line++){
//       for(int star=1;star<=line;star++){

//         System.out.print("*");
//       }
//       System.out.println("");
//     }
//   }
// }


/////////// invered star //////////////

// public class patternEx{

//   public static void main(String[] args) {
//     int n=4;
//     for(int i=1;i<=4;i++){
//       for(int j=1;j<=(n-i+1);j++){
//         System.out.print("*");
//       }
//       System.out.println("");
//     }
//   }
// }


////////////// half pyramid ////////////

public class patternEx{

  public static void main(String[] args) {

    int n=4;
    for(int i=1;i<=4;i++){
      for(int j=1;j<=i;j++){

        System.out.print(j);
      }
      System.out.println();
    }
  }
}
