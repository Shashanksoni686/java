import java.util.Scanner;
public class inputs{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name is: ");
        String name = input.nextLine();//for string
        System.out.println("Good Morning "+name);
        System.out.print(name+" Also tell me your age: ");
        int age =input.nextInt();//for integer
        System.out.println("Your age is : "+age);
    }
}