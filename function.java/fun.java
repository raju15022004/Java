
//   public static void printHelloWorld(){
//     System.out.println("Hello World");
//     System.out.println("Hello World");
//     System.out.println("Hello World");
//   }

//   public static void main(String[] args) {
//       printHelloWorld();
//   }

// }



/////////////// parameter ////////////////

// public class fun{
//   public static void printHelloWorld(){
//     System.out.println("Hello World");
//     System.out.println("Hello World");
//     System.out.println("Hello World");
//   }

//   public static void calculateSum(int num1,int num2){
//     int sum=num1+num2;
//     System.out.println("sum is " +sum);
//   }

//   public static void main(String[] args) {
//       Scanner sc=new Scanner(System.in);
//       int a=sc.nextInt();
//       int b=sc.nextInt();
//       calculateSum(a, b);
//   }

// }


///////////////////////// product ///////////////////

// public class fun{
//   public static void printHelloWorld(){
//     System.out.println("Hello world");
//     System.out.println("Hello world");
//     System.out.println("Hello world");
//   }

//   public static void swap(int a, int b){
//     int temp=a;
//     a=b;
//     b=temp;
//   }
//   public static int multiply(int a,int b){
//     int product=a*b;
//     return product;
//   }

//   public static void main(String[] args) {
//       int a=3;
//       int b=5;
//       int prod=multiply(a, b);
//       System.out.println("a*b="+prod);
//   }
// }

/////////////// factorial ///////////////

// public class fun{

//   public static void printHelloWorld(){
//     System.out.println("Hello world");
//     System.out.println("Hello world");
//     System.out.println("Hello world");
//   }

//   public static void swap(int a, int b){
//     int temp=a;
//     a=b;
//     b=temp;
//   }

//   public static int multiply(int a, int b){
//     int product=a*b;
//     return product;
//   }

//   public static int factorial(int n){
//     int f=1;

//     for(int i=1;i<=n;i++){
//       f=f*i;
//     }
//     return f;
//   }

//   public static void main(String[] args) {
//       System.out.println(factorial(5));
//   }
// }


///////////////// binomial ///////////////

// public class fun{

//   public static void printHelloWorld(){
//     System.out.println("Hello world");
//     System.out.println("Hello world");
//     System.out.println("Hello world");
//   }

//   public static void swap(int a, int b){
//     int temp=a;
//     a=b;
//     b=temp;
//   }

//   public static int multiply(int a, int b){
//     int product=a*b;
//     return product;
//   }

//   public static int factorial(int n){
//     int f=1;

//     for(int i=1;i<=n;i++){
//       f=f*i;
//     }
//     return f;
//   }

//   public static int binCoeff(int n,int r){
//     int fact_n= factorial(n);
//     int fact_r=factorial(r);
//     int fact_nmr=factorial(n-r);

//     int binCoeff=fact_n/(fact_r*fact_nmr);
//     return binCoeff;
//   }

//   public static void main(String[] args) {
//       System.out.println(binCoeff(6, 3));
//   }
// }

//////////////// overloading ////////////

// public class fun{

//   public static int sum(int a,int b){
//     return a+b;
//   }

//   public static int sum(int a, int b,int c) {
//       return a+b+c;
//   }
//   public static void main(String[] args) {
//       System.out.println(sum(3,5));
//       System.out.println(sum(5,2,1 ));
//   }

// }

/////////// prime ////////////

// public class fun{

//   public static int sum(int a,int b){
//     return a+b;
//   }

//   public static boolean isPrime(int n){
//     boolean isPrime=true;
//     for(int i=2;i<=n-1;i++){
//       if(n%i==0){
//         isPrime=false;
//         break;
//       }
//     }

//     return  isPrime;
//   }
//   public static void main(String[] args) {
//       System.out.println(isPrime(12));
//   }
// }


////////////// binary to  decimal ///////////////

public class fun{

  public static void binToDec(int binNum){
    int myNum=binNum;
    int pow=0;
    int decNum=0;

    while(binNum>0){
      int lastDigit=binNum%10;
      decNum=decNum + (lastDigit * (int) Math.pow(2,pow));

      pow++;
      binNum=binNum/10;

    }
    System.out.println("decimal of"+myNum+" = "+decNum);
  }

  public static void main(String[] args) {
      binToDec(111);
  }
}
