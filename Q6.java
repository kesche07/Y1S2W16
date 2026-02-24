import java.util.Scanner;


public class Q6
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your string");
        String text= sc.nextLine();
        String trimmed = text.trim();
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=trimmed.length()-1; i>=0; i--)
        {
            sb.append(trimmed.charAt(i));
        }
        
        String reversed = sb.toString();
        System.out.println("Reversed:\n"+reversed);
        
        if(trimmed.equals(reversed)){
            System.out.println("The String is a palindrome");
        }
        else{
            System.out.println("The String is not a palindrome");
        }
    }
}