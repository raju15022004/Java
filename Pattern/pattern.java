// public class pattern {
//   public static void hollow_reactangle(int totRows,int totCols){
//     for(int i=1;i<=totRows;i++){
//       for(int j=1;j<=totCols;j++){
//         if(i == 1 || i == totRows || j == 1 || j == totCols){
//           System.out.print("*");
//         }else{
//           System.out.print(" ");
//         }
//       }
//       System.out.println();

//     }


//     }
//     public static void main(String args[]){
//       hollow_reactangle(6,9);

//   }

// }

////////////////// half pyramid /////////////

// public class pattern {
//   public static void hollow_reactangle(int totRows,int totCols){
//     for(int i=1;i<=totRows;i++){
//       for(int j=1;j<=totCols;j++){
//         if(i == 1 || i == totRows || j == 1 || j == totCols){
//           System.out.print("*");
//         }else{
//           System.out.print(" ");
//         }
//       }
//       System.out.println();

//     }


//     }

//     public static void inverted_rotated_half_pyramid(int n){

//       for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i;j++){
//            System.out.print(" ");
//         }
//           for(int j=1;j<=i;j++){
//             System.out.print("*");
//           }
//           System.out.println();
//       }
//     }
//     public static void main(String args[]){
//      inverted_rotated_half_pyramid(8);

//   }

// }


//////////////// Number /////////

// public class pattern {
//   public static void hollow_reactangle(int totRows,int totCols){
//     for(int i=1;i<=totRows;i++){
//       for(int j=1;j<=totCols;j++){
//         if(i == 1 || i == totRows || j == 1 || j == totCols){
//           System.out.print("*");
//         }else{
//           System.out.print(" ");
//         }
//       }
//       System.out.println();

//     }


//     }

//     public static void inverted_rotated_half_pyramid(int n){

//       for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i;j++){
//            System.out.print(" ");
//         }
//           for(int j=1;j<=i;j++){
//             System.out.print("*");
//           }
//           System.out.println();
//       }
//     }

//     public static void inverted_rotated_half_pyramid_withNumbers(int n){
//       for(int i=1; i<=n;i++){
//         for(int j=1;j<=n-i+1;j++){
//           System.out.print(j+" ");
//         }
//         System.out.println();
//       }
//     }
//     public static void main(String args[]){
//     inverted_rotated_half_pyramid_withNumbers(5);

//   }

// }


///////////////// floyds_triangle ////////////

// public class pattern {
//   public static void hollow_reactangle(int totRows,int totCols){
//     for(int i=1;i<=totRows;i++){
//       for(int j=1;j<=totCols;j++){
//         if(i == 1 || i == totRows || j == 1 || j == totCols){
//           System.out.print("*");
//         }else{
//           System.out.print(" ");
//         }
//       }
//       System.out.println();

//     }


//     }

//     public static void inverted_rotated_half_pyramid(int n){

//       for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i;j++){
//            System.out.print(" ");
//         }
//           for(int j=1;j<=i;j++){
//             System.out.print("*");
//           }
//           System.out.println();
//       }
//     }

//     public static void floyds_triangle(int n){
//       int counter=1;
//       for(int i=1;i<=n;i++){
//         for(int j=1;j<=i;j++){
//           System.out.print(counter+" ");
//           counter++;

//         }
//         System.out.println();
//       }
//     }
//     public static void main(String args[]){
//      floyds_triangle(5);
//   }

// }

///////////////////////// 0 1 triangle ///////////


public class pattern {
  public static void hollow_reactangle(int totRows,int totCols){
    for(int i=1;i<=totRows;i++){
      for(int j=1;j<=totCols;j++){
        if(i == 1 || i == totRows || j == 1 || j == totCols){
          System.out.print("*");
        }else{
          System.out.print(" ");
        }
      }
      System.out.println();

    }
    }

    public static void zero_one_triangle(int n){
      for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
          if((i+j)%2 == 0){
            System.out.print("1");
          }else{
            System.out.print("0");
          }
        }
        System.out.println();
      }
    }
    public static void main(String args[]){
      zero_one_triangle(8);

  }

}

//////////////// butterfly /////////////

// public class pattern {
//   public static void hollow_reactangle(int totRows,int totCols){
//     for(int i=1;i<=totRows;i++){
//       for(int j=1;j<=totCols;j++){
//         if(i == 1 || i == totRows || j == 1 || j == totCols){
//           System.out.print("*");
//         }else{
//           System.out.print(" ");
//         }
//       }
//       System.out.println();

//     }
//     }

//     public static void butterfly(int n){

//       for(int i=1;i<=n;i++){

//         for(int j=1;j<=i;j++){
//           System.out.print("*");
//         }
//         for(int j=1;j<=2*(n-i);j++){
//           System.out.print(" ");
//         }
//         for(int j=1;j<=i;j++){
//           System.out.print("*");
//         }
//         System.out.println();
//       }

//       for(int i=n;i>=1;i--){
//         for(int j=1;j<=i;j++){
//           System.out.print("*");
//         }
//         for(int j=1;j<=2*(n-i);j++){
//           System.out.print(" ");
//         }
//         for(int j=1;j<=i;j++){
//           System.out.print("*");
//         }
//         System.out.println();
//       }
//     }

//     public static void solid_rhombus(int n){
//       for(int i=1;i<=n;i++){

//         for(int j=1;j<=(n-i);j++){
//           System.out.print(" ");
//         }

//         for(int j=1;j<=n;j++){
//           System.out.print("*");
//         }
//         System.out.println();
//       }
//     }

//     public static void main(String args[]){
//     // butterfly(4);
//     solid_rhombus(9);


//   }

// }


///////////// Diamond /////////////

// public class pattern {
//   public static void hollow_reactangle(int totRows,int totCols){
//     for(int i=1;i<=totRows;i++){
//       for(int j=1;j<=totCols;j++){
//         if(i == 1 || i == totRows || j == 1 || j == totCols){
//           System.out.print("*");
//         }else{
//           System.out.print(" ");
//         }
//       }
//       System.out.println();

//     }
//     }

//     public static void Diamond(int n){
//       // 1st half
//       for(int i=1;i<=n;i++){

//         for(int j=1;j<=(n-i);j++){
//           System.out.print(" ");
//         }
//         for(int j=1;j<=(2*i)-1;j++){
//           System.out.print("*");
//         }
//         System.out.println();
//       }

//       for(int i=n;i>=1;i--){

//         for(int j=1;j<=(n-i);j++){
//           System.out.print(" ");
//         }
//         for(int j=1;j<=(2*i)-1;j++){
//           System.out.print("*");
//         }
//         System.out.println();
//       }
//     }
//     public static void main(String args[]){
//     Diamond(7);

//   }

// }
