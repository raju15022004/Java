import java.util.Scanner;

public class question2 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int evenSum=0, oddSum=0;

        System.out.println("enter integers(type '0' to stop):");

        while(true){
            int number=scanner.nextInt();
            if(number == 0){
                break;

            }
            if(number % 2 == 0){
                evenSum +=number;
            }else{
                oddSum +=number;
            }
        }
        System.out.println("sum of even numbers:" + evenSum);
        System.out.println("sum of odd numbers:" + oddSum);
        }
    }
    

