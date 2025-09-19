
import java.util.Scanner;

// package statement.java;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a:");
        int a=sc.nextInt();
        System.out.println("enter b:");

        int b=sc.nextInt();
        System.out.println("enter operator:");

        char opertor=sc.next().charAt(0);

        switch (opertor) {
            case '+':System.out.println(a+b); 
                break;
            case '-':System.out.println(a-b); 
                break;
            case '*':System.out.println(a*b); 
                break;
            case '/':System.out.println(a/b); 
                break;
            case '%':System.out.println(a%b); 
                break;    
            default: System.out.println("wrong operator");
                
        }
    }
    
}
