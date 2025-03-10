
import java.util.Scanner;

public class bitwise{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int first = input.nextInt();
        System.out.print("Enter the second number : ");
        int second = input.nextInt();
        int result = first & second;
        int result1 = first | second;
        int result2 = first ^ second;
        int result3 = ~first;
        int result4 = first << second;
        int result5 = first >> second;

        System.out.println("Result for and operation is : "+result);
        System.out.println("Result for or operation is : "+result1);
        System.out.println("Result for xor operation is : "+result2);
        System.out.println("Result for not operation is : "+result3);
        System.out.println("Result for left shift operation is : "+result4);
        System.out.println("Result for right shift operation is : "+result5);
    }
}