public class square {
    // public static void main(String[] args) {
    //     for(int i=1;i<=4;i++){
    //         System.out.println("****");
    //     }
    // }
    

    // public static void main(String[] args) {
    //     int n = 10899;
    //     while(n > 0){
    //         int lastDigit=n % 10;
    //         System.out.println(lastDigit);
    //         n=n / 10;
    //     }
    //     System.out.println();
    // }

    public static void main(String[] args) {
        int n=10899;
        int rev=0;
        while(n>0){
            int lastDigit=n%10;
            rev=(rev*10)+lastDigit;
            n=n/10;

        }
        System.out.println(rev);
    }
}
