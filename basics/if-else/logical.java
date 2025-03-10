import java.util.Scanner;
public class logical{
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Welcome to the Ticket Discount Calculator.");
       System.out.print("Enter your age : ");

       int age = input.nextInt();

       System.out.print("Are you a female? (true or false)");
       boolean isFemale = input.nextBoolean();
       if(age<5){
        System.out.println("You got 75% discount.");
       }else if(isFemale){
        System.out.println("You got 50% discount.");
       }else if( age> 60 && !isFemale){
        System.out.println("You got 35% discount.");
       }else{
        System.out.println("You got no discount");
       }
    }
}