import java.util.Scanner; 
public class Swap{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Swapping Station");
        System.out.print("Enter the value of A: ");
        int a = input.nextInt();
        System.out.print("Enter the value of B: ");
        int b = input.nextInt();
        int c = a;
        a= b;
        b = c;
        System.out.println("Value of A is: "+a);
        System.out.println("Value of B is: "+b);

    }
} 