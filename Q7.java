import java.util.Scanner;


public class Q7
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Phone Number");
        String phoneNo = sc.nextLine();
        
        System.out.println("Entered phone number is:\n"+phoneNo);
        System.out.println(isValid(phoneNo));
    }
    public static String isValid(String phone){
        if(phone.matches("9[78]\\d{8}")){
            return "Valid phone number";
        }
        else{
            return "Invalid phone number";
        }
    }
}