public class program42 {
public static void main(String[] args) {
    
        
            double number = 123.456789;
            int n = 3; // Number of decimal places to round to
            
            double multiplier = Math.pow(10, n);
            double roundedNumber = Math.round(number * multiplier) / multiplier;
            
            System.out.println(roundedNumber);
        
    
    
}
    
}
