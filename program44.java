import java.util.Scanner;
public class program44{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n/2;i++){
            b[i]=sc.nextInt();
        }
        delete(a, b);
      
    }
    public static int delete(int a[],int b[]){
        int n=a.length;
       for(int i=0;i<n;i++){
       for(int j=i;j<n;j++){
        if(a[i]==b[j]){
            return-1;
        }
        else{
            System.out.println(a[i]);
        }
       }
       }
    }
}