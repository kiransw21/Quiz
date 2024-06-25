import java.util.Scanner;
public class Program35{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter m");
        int m=sc.nextInt();
        System.out.println("enter n");
        int n=sc.nextInt();
        int a[][]=new int[10][10];

        System.out.println("enter the elements of A matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("matrix");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               
               System.out.print(a[i][j] +" ");
               
            }
            System.out.println();
        }
        
    System.out.println("after transpose ");
     for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
           
           System.out.print(a[j][i] +" ");
           
        }
        System.out.println();
    }
    
}
}


    

