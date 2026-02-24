import java.util.Scanner;

/**
 * Write a description of class Q2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q2
{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter your string");
        String string1 = sc.nextLine();
        
        String trimmed = string1.trim();
        System.out.println(trimmed);
        
        System.out.println(trimmed.substring(0,10));
        
        String[] splitArray = string1.split(" ");
        
        for(String x : splitArray){
            System.out.println(x);
        }
    }
}