
import java.util.Scanner;

public class question4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a number to print its multiplication table:");
        int number=scanner.nextInt();

        System.out.println("multiplication table of " + number + ":");
        for(int i=1;i<=10;i++){
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
    
}
