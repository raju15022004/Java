

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

// public class array{
//   public static int  getLargest(int numbers[]) {
//       int largest = Integer.MIN_VALUE;
//       int smallest=Integer.MAX_VALUE;

//       for(int i=0;i<numbers.length;i++){
//         if(largest<numbers[i]){
//           largest=numbers[i];

//         }
//         if(smallest>numbers[i]){
//           smallest=numbers[i];
//         }
//       }
//       System.out.println("samllest value is :"+smallest);
//       return largest;
//   }

//   public static void main(String[] args) {
//       int numbers[]={1,2,6,3,5};
//       System.out.println("largest value is:"+getLargest(numbers));
//   }
// }

////////////// bineary search ////////////////

//  public class array{

//   public static int binearySearch(int numbers[],int key){
//     int start=0,end=numbers.length-1;

//     while(start <= end){
//       int mid = (start + end)/2;

//       if(numbers[mid] == key){
//         return mid;
//       }
//       if(numbers[mid]<key){
//         start=mid+1;
//       }
//       else{
//         end=mid-1;
//       }
//     }
//     return-1;
//   }
//   public static void main(String[] args) {
//       int numbers[]={2,4,6,8,10,12,14};
//       int key=10;
//       System.out.println("index for key is :"+binearySearch(numbers, key));
//   }
//  }


///////////////// revers ////////////

// public class array{
//   public static void reverse(int numbers[]){
//     int first=0,last=numbers.length-1;

//     while(first<last){
//       int temp=numbers[last];
//       numbers[last]=numbers[first];
//       numbers[first]=temp;

//       first++;
//       last--;

//     }
//   }

//   public static void main(String[] args) {
//       int numbers[]={2,4,6,8,10};

//       reverse(numbers);
//       for(int i=0;i<numbers.length;i++){
//         System.out.print (numbers[i]+" ");
//       }
//       System.out.println();
//   }
// }

//////////////// pairs ///////////////////

public class array{
  public static void printSubarrays(int numbers[]){
    int ts=0;
    for(int i=0;i<numbers.length;i++){
      int start=i;
      for(int j=i;j<numbers.length;j++){
        int end=j;
        for(int k=start;k<end;k++){
          System.out.print(numbers[k]+" ");
        }
        ts++;
        System.out.println();
      }
      System.out.println();
    }
    System.out.println("total subarrays="+ts);

  }
  public static void main(String[] args) {
      int numbers[]={2,4,6,8,10,12};
      printSubarrays(numbers);
  }
}
