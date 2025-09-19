
import java.util.Scanner;

public class sum {
    public static int sum(int num){
        int sum=0;
        while(num !=0){
            int last=num%10;
            sum+=last;
            num/=10;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter an integer:");
        int number=scanner.nextInt();

        System.out.println("sum of Digits:"+sum(number));
        scanner.close();
    }
    
}
