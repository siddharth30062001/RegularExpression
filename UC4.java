package regularexpression.assignment;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UC4 {


    public static boolean isValid(String check,String temp){

        if(Pattern.matches(check, temp)){
            return true;
        }

        return false;

    }


    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Phone Number: ");
        String email=sc.nextLine();

        String check="^\\d{2}\\s\\d{10}$";
       boolean result= isValid(check,email);
       if(result){
        System.out.println("Valid Phoneno.");
       }
       else{
        System.out.println("Not valid");
       }

        
    }
    }

