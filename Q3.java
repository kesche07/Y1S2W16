import java.util.Scanner;


public class Q3
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your string");
        String string1 = sc.nextLine();
        
        System.out.println("Enter index number");
        int index = sc.nextInt();
        sc.nextLine();
        
        System.out.println(string1.charAt(index));
        
        System.out.println("Finding first occurence of character");
        String charac= sc.nextLine();
        System.out.println(string1.indexOf(charac));
        
        System.out.println("Checking if string contains specific word");
        System.out.println("Enter Specific word");
        String word = sc.nextLine();
        
        System.out.println(string1.contains(word)+"\nAt index"+string1.indexOf(word));
    }
}