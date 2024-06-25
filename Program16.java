import java.util.Scanner;
public class Program16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int fact=1,n=5;
        while(n!=0){
            fact=fact*n;
            n--;
        }
        System.out.println(fact);

    }
    
}
