import java.util.Scanner;
public class cha{
    public static void main(String[] args) {
        System.out.print("Enter your name : ");
        Scanner input = new Scanner (System.in);
        String name = input.next();
        System.out.println("welcome "+name+" to LPU.");





        //Adding two number.


        System.out.print("Enter First number: ");
        int firstnum = input.nextInt();
        System.out.print("Second number:");
        int secondnum = input.nextInt();
        int sum = firstnum+secondnum;
        System.out.println("The sum of given numbers is : "+sum);



    }

}