

public class parameter{
    public static void main(String[] args){
        int num = sumTwoNumbers(4,7);//(4,7) are arguments.

        System.out.println(num);
        /*
        we can also do,
        System.out.println(sumTwoNumbers(4,7));
         */
    }
    //makeing a function for adding two numbers.
    public static int sumTwoNumbers(int first,int second)//(int first,int second) are parameters.
    {
        System.out.println("First number : "+first);
        System.out.println("Second number : "+second);
        int sum = first+second;
        return sum;
    }
}