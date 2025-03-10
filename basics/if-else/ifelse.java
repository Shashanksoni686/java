

public class ifelse{
    public static void main(String[] args) {
        boolean isMale = true;
        String name = "Bob";
        if(isMale){
            System.out.println("Mr."+ name);    
        }
        else{
            System.out.println("Mrs."+name);
        }


        boolean isSenior = true;
        boolean isAdult = false;
        if(isSenior){
            System.out.println("Hello Senior");
        }else if(isAdult){    
            System.out.println("Hello Adult");
        }else{
           System.out.println("Hello Child");
            }
        }
    }