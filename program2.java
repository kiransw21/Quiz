
import java.util.Scanner;
public class program2 {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    
      System.out.println("enter the values of a,b,c:");
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      int s=a+b+c/2;
     double area=Math.sqrt(s*(s-a)*(s-b)*(s-c))/2;
     System.out.println(area);
    }
}
