

// // package practice Question;

// public class loop {

//   public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);

//     int number;
//     int choice;
//     int evenSum=0;
//     int oddSum=0;
//     do {
//       System.out.print("Enter the number");
//       number=sc.nextInt();

//       if(number% 2 == 0){
//         evenSum += number;
//       }
//       else{
//         oddSum +=number;
//       }

//       System.out.print("D0 you want to continue? press 1 for yes or 0 for no");

//       choice=sc.nextInt();

//     }
//     while(choice==1);
//     System.out.println("Sum of even numbers"+evenSum);
//     System.out.println("Sum of odd numbers"+oddSum);

//   }

// }


//////////////////  factorialofanumber  ////////////

// public class loop{
//   public static void main(String[] args) {
//       Scanner sc =new Scanner(System.in);
//       int num;
//       int fact = 1;

//       System.out.print("Enter any positive integer");
//       num = sc.nextInt();

//       for(int i=1;i<=num;i++){
//         fact *=i;
//       }
//       System.out.println("factorial"+fact);
//   }

// }

///////////// emultiplicationtableofanumber N /////////////

public class loop{
  public static void printMultiplicationTable(int number ){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number");
    int n=sc.nextInt();
    for(int i=1;i<=10;i++){
      System.out.println(n+" * " + i + " = " + n*i);
    }

  }
  public static void main(String[] args) {
      printMultiplicationTable(8);
  }
}


////////////  Scope of variable  ///////////

// public class loop{
//   public static void main(String[] args) {

//     for(int i=0;i<=5;i++){
//     System.out.println("i = " + i);
//   }

//   System.out.println("i after the loop = " );
//   }

// }
