package regularexpression.assignment;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UC3 {
    
    public static boolean isValid(String check,String temp){

        if(Pattern.matches(check, temp)){
            return true;
        }

        return false;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the email");
        String email=sc.nextLine();

        String check="^[A-Za-z0-9]+(\\.[A-Za-z0-9]+)?@[A-Za-z0-9]+\\.[A-Za-z]{2,}(\\.[A-Za-z]{2,})?$";
       boolean result= isValid(check,email);
       if(result){
        System.out.println("Valid Email");
       }
       else{
        System.out.println("Not valid");
       }

        
    }
}
