public class Unary{
    public static void main(String[] args){
    int x = 5;
    int y = -x;
    int z = -y;//converts -ve to positive
    System.out.println(z);

    int a = 5;
    // a += 1;
    // System.out.println(a);
    // a++;//post increment  
    // System.out.println(a);
    // ++a;
    System.out.println(a++);//post increment.value will be increased after.
    System.out.println(a);
    int b = 10;
    System.out.println(++b);//pre increment. value will be increased before.
    }
}