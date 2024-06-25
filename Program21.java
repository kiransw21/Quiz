import java.util.Scanner;
public class Program21{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
          int order=String.valueOf(i).length();
          int sum=0;
          int temp=i;
          while(temp>0){
            int digit=temp%10;
            sum+=Math.pow(digit,order);
            temp/=10;
          }
          if(sum==i){
            System.out.println(i);
          }
        }
  }
}
