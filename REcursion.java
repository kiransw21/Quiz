
public class REcursion {
   public static void main(String args[]){
    int n=0;
    kiran(n);
   }
   public static void kiran(int n){
    if(n==6){
        return;
    }
    else{
        System.out.println(n);
        kiran(n+1);
    }
   }
    }
