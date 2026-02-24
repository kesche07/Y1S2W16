import java.util.Scanner;

/**
 * Write a description of class Q4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q4
{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter your string");
       String text = sc.nextLine();
       
       String trimmed = text.trim();
       
       System.out.println("To Uppercase:\n" +trimmed.toUpperCase());
       System.out.println("To LowerCase:\n" +trimmed.toLowerCase());
       
       String[] words = trimmed.split("\\s+");
       
       StringBuilder sb = new StringBuilder();
       
       for(int i=0;i<words.length;i++){
           String first= words[i].substring(0,1).toUpperCase();
           String rest= words[i].substring(1).toLowerCase();
           sb.append(first).append(rest).append(" ");
       }
       
       System.out.println("To title case:\n"+sb.toString().trim());
       
   }
}