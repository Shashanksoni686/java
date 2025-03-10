import java.util.Scanner;
public class ch{
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        // System.out.print("Enter any number : ");
        // float num = input.nextFloat();
        // if( 0>num){
        //     System.out.println("The number is -ve.");
        // }else if(num>0){
        //     System.out.println("the number is +ve");
        // }else {
        //     System.out.println("number is Zero.");
        // }

        // System.out.print("Enter the number : ");
        // int num = input.nextInt();
        // if(num % 2 == 0){
        //    System.out.println("The number is even.");
        // }else{
        //     System.out.println("The number is odd.");
        // }


        System.out.print("Enter number a : ");
        int a = input.nextInt();
        System.out.print("Enter number b : ");
        int b = input.nextInt();
        System.out.print("Enter number c : ");
        int c = input.nextInt();
        if(a>=b && a>=c){
            System.out.println("a is the greatest number.");
        }else if(b>=c){
            System.out.println("b is the greatest number.");
        }else{
            System.out.println("c is the greatest number.");
        }

    }
}