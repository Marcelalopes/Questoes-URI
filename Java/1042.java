import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
		int a, b, c;

		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();

		if ((a < b) & (b < c)) {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
		else if ((a < c) & (c < b)) {
			System.out.println(a);
			System.out.println(c);
			System.out.println(b);
		}
		else if ((b < a) & (a < c)) {
			System.out.println(b);
			System.out.println(a);
			System.out.println(c);
		}
		else if ((b < c) & (c < a)) {
			System.out.println(b);
			System.out.println(c);
			System.out.println(a);
		}
		else if ((c < a) & (a < b)) {
			System.out.println(c);
			System.out.println(a);
			System.out.println(b);
		}
		else {
			System.out.println(c);
			System.out.println(b);
			System.out.println(a);
		}

			System.out.println("\n" + a);
			System.out.println(b);
			System.out.println(c);
 
    }
 
}
