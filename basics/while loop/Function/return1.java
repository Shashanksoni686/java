
import java.util.Scanner;

public class return1{
    public static void main(String[] args) {
        int first = readNumber();
        int second = readNumber();
        
        int sum = first + second;
        System.out.println("Sum of the numbers is : "+sum);
        
    }
    public static int readNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        return number;
    }
}