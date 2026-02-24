import java.util.Scanner;

public class Q1
{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter First String");
        String string1 = sc.nextLine();
        
        System.out.println("Enter Second String");
        String string2 = sc.nextLine();
        
        System.out.println("Concatenated String:");
        String concatenated = string1.concat(string2);
        
        System.out.println(concatenated);
        
        System.out.println("Enter third String");
        String string3 = sc.nextLine();
        
        System.out.println("IF concatenated and third input are same:");
        System.out.println(string3.equals(concatenated));
        
        
    }
}