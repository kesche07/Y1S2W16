import java.util.Scanner;


public class Q5
{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter first string");
       String text1 = sc.nextLine();
       
       System.out.println("Enter second String");
       String text2 = sc.nextLine();
       
       StringBuilder sb = new StringBuilder();
       System.out.println(sb.append(text1).append(text2));
       
       System.out.println("Enter a number to append");
       int num = sc.nextInt();
       sc.nextLine();
       
       System.out.println("Enter a character to append");
       String charac = sc.nextLine();
       
       sb.append(num).append(charac);
       System.out.println(sb.toString());
   }
}