package regularexpression.assignment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {
        
        private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";

        public static boolean isValidEmail(String email) {
            Pattern pattern = Pattern.compile(EMAIL_REGEX);
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        }
    
        public static void main(String[] args) {
            // Valid emails
            String[] validEmails = {
                    "abc@yahoo.com",
                    "abc-100@yahoo.com",
                    "abc.100@yahoo.com",
                    "abc111@abc.com",
                    "abc-100@abc.net",
                    "abc.100@abc.com.au",
                    "abc@1.com",
                    "abc@gmail.com.com",
                    "abc+100@gmail.com"
            };
    
            // Invalid emails
            String[] invalidEmails = {
                    "abc",
                    "abc@.com.my",
                    "abc123@gmail.a",
                    "abc123@.com",
                    "abc123@.com.com",
                    ".abc@abc.com",
                    "abc()*@gmail.com",
                    "abc@%*.com",
                    "abc..2002@gmail.com",
                    "abc.@gmail.com",
                    "abc@abc@gmail.com",
                    "abc@gmail.com.1a",
                    "abc@gmail.com.aa.au"
            };
    
            System.out.println("Valid Emails:");
            for (String email : validEmails) {
                System.out.println(email + " : " + (isValidEmail(email) ? "Valid" : "Invalid"));
            }
    
            System.out.println("\nInvalid Emails:");
            for (String email : invalidEmails) {
                System.out.println(email + " : " + (isValidEmail(email) ? "Valid" : "Invalid"));
            }
        }
    
}
