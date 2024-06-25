import java.util.Scanner;
public class Program33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter m");
        int m=sc.nextInt();
        System.out.println("enter n");
        int n=sc.nextInt();
        int a[][]=new int[10][10];
        int b[][]=new int[10][10];
        int c[][]=new int[10][10];
        System.out.println("enter the elements of A matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the elements of matrix B");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               c[i][j]=a[i][j]+b[i][j];
               System.out.print(c[i][j] +" ");
               
            }
            System.out.println();
        }
        
    }
    
}
