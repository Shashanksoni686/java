import java.util.Scanner;
public class grades{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Grade Calculator: ");
        System.out.print("Enter your Percentage : ");
        float percentage = input.nextFloat();
        if(percentage >= 90){
            System.out.println("Your grade is A");
            }
        else if(percentage >= 75){
            System.out.println("Your grade is B");
        }
        else if(percentage >= 60){
            System.out.println("Your grade is C");
        }
        else if(percentage >= 30){
            System.out.println("Your grade is D");
        }
        else{
            System.out.println("Your grade is F");
        }
    }
}