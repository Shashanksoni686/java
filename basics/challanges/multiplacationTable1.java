
import java.util.Scanner;

public class multiplicationTable1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to multiplication world\n");
        System.out.print("Enter the number : ");
        int num = scanner.nextInt();
        multiplicationTable(num);
    }
    public static void multiplicationTable(int num){
        int i = 1 ;
        while (i<=10){
            System.out.println(num +" X "+ i + " = " + (num*i));
            i++;
        }
    }
}