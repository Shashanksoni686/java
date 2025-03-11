public class f1{
    public static void main(String[] args){
        printFirtstPattern();//calling first pattern
        printSecondPattern();//calling third pattern
    }
    public static void printFirtstPattern(){
        int rows = 0;
        while(rows < 25){
            System.out.print("*");
            int i = 0;
            while(i<rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
        }

        public static void printSecondPattern(){
            System.out.println("    *");
            System.out.println("   * *");
            System.out.println("  * * *");
            System.out.println(" * * * *");
            System.out.println("* * * * *");}
        }
