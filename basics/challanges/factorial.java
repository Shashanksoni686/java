import java.util.Scanner;

public class factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        long facts = fact(num);
        System.out.println("Factorial is : "+facts);
    }
    public static long fact(int num){
        if(num < 2){
            return 1;
        }
        long facts = 1;
        int i = 2;
        while(i <= num){
            facts *= i;
            i++;
        }
        return facts;

    }
}