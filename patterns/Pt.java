package patterns;

public class Pt {
    public static void main(String[] args) {
        pattern(12);
    }
    static void pattern(int n){
        for(int i=1;i<=6;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
