import java.io.IOException;
 
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        double R,A;
        Scanner x = new Scanner (System.in);
        R = x.nextDouble();
        A = 3.14159 * R * R;
        System.out.printf("A=%.4f\n", A);
        
        
        
    }
 
}
