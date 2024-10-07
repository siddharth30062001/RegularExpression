package regularexpression.assignment;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UC5 {


    public static boolean isValid(String check,String temp){

        if(Pattern.matches(check, temp)){
            return true;
        }

        return false;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Password: ");
        String password=sc.nextLine();
       

        String check="^(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()_+\\-={}:\";'<>?,./]).{8,}$";
       boolean result= isValid(check,password);
       if(result){
        System.out.println("Valid Password");
       }
       else{
        System.out.println("Not valid");
       }

        
    }
    }
    

