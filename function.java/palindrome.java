
import java.util.Scanner;

public class palindrome {
    public static boolean ispalindrome(int num){
        int originalNum=num;
        int reversedNum=0;

        while(num>0){
            int digit=num%10;
            reversedNum=reversedNum*10+digit;
            num /=10;
        }
        return originalNum==reversedNum;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a number:");
        int number=scanner.nextInt();

        if(ispalindrome(number)){
            System.out.println(number+"is a palindrome.");

        }
        else{
            System.out.println(number+"is not a palindrome.");

        }
        scanner.close();
    }
    
}
