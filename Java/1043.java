import java.io.IOException;
import java.util.Scanner;
import static java.lang.Math.abs;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner(System.in);
		double A, B, C;

		A = s.nextDouble();
		B = s.nextDouble();
		C = s.nextDouble();

		if (((abs(B - C) < A) & (A < B + C)) & ((abs(A - C) < B) & (B < A + C)) & ((abs(A - B) < C) & (C < A + B))) {
			System.out.println("Perimetro = " + (A + B + C));
		}
		else {
			System.out.println("Area = " + (((A + B) * C)/2));
		}
 
    }
 
}
