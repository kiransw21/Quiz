
import java.util.Scanner;
public class Program30 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a numer");
    
    int a[]=new int[]{1,2,2,12,3,2,4,5,4};
    int b[]=new int[20];
    int visited=-1;
    for(int i=0;i<a.length;i++){
     int count=1;
     for(int j=i+1;j<a.length;j++){
        if (a[i]==a[j]) {
            count++;
            b[j]=visited;
            
        }
     }
     if(b[i]!=visited)
     b[i]=count;
    }
    
    for(int i = 0; i < b.length; i++){  
        if(b[i] != visited)  
            System.out.println("    " + a[i] + "     =     " + b[i]);  
    }  

    
    
    
    
    
    
    
    
    
    
    
    

    
    
   } 
}
