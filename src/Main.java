import java.util.Scanner;
import java.util.regex.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        System.out.println("Enter email: ");
        String email= sc.next();
//        for(int i=0;i<email.length();i++){
            boolean isvalid = Pattern.matches(emailRegex,email);
            System.out.println(email +": "+isvalid);
//        }

    }
}