package regularexpression.assignment;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UC1 {

    public static boolean isValid(String check,String temp){

        if(Pattern.matches(check, temp)){
            return true;
        }

        return false;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the FirstName");
        String input=sc.nextLine();
        String check="^[A-Z][a-z]{2,}$";
       boolean result= isValid(check,input);
       if(result){
        System.out.println("Valid Name");
       }
       else{
        System.out.println("Not valid");
       }

        
    }
    
}
