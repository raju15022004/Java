import java.util.Scanner;

public class doex {
    // public static void main(String[] args) {
    //     int counter=1;
    //     do { 
    //         System.out.println("hello word");
    //         counter++;
            
    //     } while (counter <= 10);
    // }
    
public static void main(String[] args) {
    

    Scanner sc=new Scanner(System.in);

    do{
        System.out.println("enter the number");
        int n = sc.nextInt();

        if(n % 10 ==0){
            break;

        }
        System.out.println(n);

    }
    while(true);
}
}
