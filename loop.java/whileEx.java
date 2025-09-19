
import java.util.Scanner;

public class whileEx {

    // public static void main(String[] args) {
    //     int counter=0;
    //     while(counter<100){
    //         System.out.println("raju");
    //         counter++;
    //     }
    //     System.out.println("printed hW 10X");
    // }
    

//     public static void main(String[] args) {
//         int counter=1;
//         while(counter <=10){
//             System.out.print(counter+" ");
//             counter++;
//         }
//         System.out.println();
//     }
// }

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int range=sc.nextInt();
    int counter=1;

    while(counter <= range){
        System.out.print(counter + " ");
        counter++;
    }
    System.out.println();
    
}
}