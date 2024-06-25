import java.util.Scanner;
public class Program14 {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int r;
      int sum=0;
      System.out.println("enter number");
      int n=sc.nextInt();
      int temp=n;
      while(n!=0){
       r=n%10;
       sum=sum+r*r*r;
       n=n/10;
      }
      if(temp==sum){
       System.out.println("armstrong number");
      }
      else{
        System.out.println(" not an armstrong");
      }
    }
    
}
