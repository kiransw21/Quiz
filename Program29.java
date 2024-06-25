import java.util.Scanner;

public class Program29 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of elements to inset in an array");
        int n=sc.nextInt();
        int a[]=new int[n];
       System.out.println("enter the elements in array");
        for(int i=0;i<n;i++){
           
            a[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            System.out.print(" "+a[i]);
        }
        System.out.println();
    }
}
