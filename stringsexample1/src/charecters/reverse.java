package charecters;
import java.util.*;
public class reverse {

 public static void main(String args[])
 {
                int i,n;
 
 String s;
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the string");
 s=sc.nextLine();
 char str[] = s.toCharArray();
     n=str.length;
     System.out.println("Reversed string is");
     for(i=n-1;i>=0;i--)
     {
       System.out.print(str[i]);
     }
 }    

}
