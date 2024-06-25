import java.util.Scanner;
public class Program23 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int r;
        int sum=0;
        while(n>0){
          r=n%10;
          sum+=r;
          n=n/10;
        }
        System.out.println(sum);
    }
    
}
