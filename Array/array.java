

// public class array {
//   public static void main(String[] args) {
//       int marks[]=new int[100];

//      Scanner sc = new Scanner(System.in);

//      marks[0]=sc.nextInt();
//      marks[1]=sc.nextInt();
//      marks[2]=sc.nextInt();

//      System.out.println("phy :" + marks[0]);
//      System.out.println("chem :" + marks[1]);
//      System.out.println("math  :" + marks[2]);
//   }

// }


// public class array{
//   public static void update(int marks[]){
//     for(int i=0;i<marks.length;i++){
//       marks[i]=marks[i]+i;
//     }
//   }

//   public static void main(String[] args) {
//       int marks[]={97,98,99};
//       update(marks);

//       for(int i=0;i<marks.length;i++){
//         System.out.print( marks[i]+" ");
//       }
//       System.out.println();
//   }
// }


////////////// largest ///////

public class array{
  public static int  getLargest(int numbers[]) {
      int largest = Integer.MIN_VALUE;
      int smallest=Integer.MAX_VALUE;

      for(int i=0;i<numbers.length;i++){
        if(largest<numbers[i]){
          largest=numbers[i];

        }
        if(smallest>numbers[i]){
          smallest=numbers[i];
        }
      }
      System.out.println("samllest value is :"+smallest);
      return largest;
  }

  public static void main(String[] args) {
      int numbers[]={1,2,6,3,5};
      System.out.println("largest value is:"+getLargest(numbers));
  }
}

