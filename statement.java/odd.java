
import java.util.Scanner;

// package statement.java;

public class odd {
    public static void main(String[] args) {
        
    Scanner Sc=new Scanner(System.in);
    int number = Sc.nextInt();

    if(number % 2 == 0){
        System.out.println("even");

    }
    else{
        System.out.println("odd");
    }

    }
}
