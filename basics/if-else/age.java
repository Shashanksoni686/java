import java.util.Scanner;
public class age{
    public static void main(String[] args){
        System.out.println("Welcome");
        System.out.print("Enter your age: ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if( age <=13){
            System.out.println("You are child.");
        }
        else if(age <= 20 && age >=13){
            System.out.println("You are a teenager.");
        }
        else if( age <= 60 && age >= 20){
            System.out.println("You are an adult.");
        }
        else{
            System.out.println("You are a senior citizen.");
    }
    }
    }