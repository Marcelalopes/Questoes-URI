import java.io.IOException;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		int cod, quant;
		double preco = 0, total;

		cod = s.nextInt();
		quant = s.nextInt();

		if (cod == 1) {
			preco = 4.0;
		}
		else if (cod == 2) {
			preco = 4.5;
		}
		else if (cod == 3) {
			preco = 5.0;
		}
		else if (cod == 4) {
			preco = 2.0;
		}
		else {
			preco = 1.5;
		}

		total = quant * preco;

		System.out.println("Total: R$ " + df.format(total));
 
    }
 
}
