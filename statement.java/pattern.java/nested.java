// package pattern.java;

public class nested {
    // public static void main(String[] args) {
    //     for(int line=1; line<=5; line++){
    //         for(int star=1; star<=line; star++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=4;i++){
            for(int s=1;s<=n-i+1;s++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
