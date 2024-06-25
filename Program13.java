import java.util.Scanner;
public class Program13{
    public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.println("enter n");
   int n=sc.nextInt();
   int count=0;
   for(int i=2;i<=n;i++){
        if(n%i==0){
            count++;
        }
    }
        if(count==1){
            System.out.println("given number is prime");
        }
        else{
        System.out.println("not a prime number");
        }
    
    }
    
}

