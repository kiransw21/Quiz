import java.util.Scanner;
public class Program19 {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number");
      int n=sc.nextInt();
      int reverse=0;
      int temp=n;
    while(n!=0){
       int digit=n%10;
       reverse=reverse*10+digit;
        n=n/10;
      }
      if(temp==reverse){
       System.out.println("given number palindrome");
      }
      else{
        System.out.println("not a palindrome");
      }
      
    }
  }
