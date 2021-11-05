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
 
        int cod1,qnt1; double valor1;
        int cod2,qnt2; double valor2;
        double valPag;
        Scanner s = new Scanner (System.in);
        cod1 = s.nextInt();
        qnt1 = s.nextInt();
        valor1 = s.nextDouble();
        cod2 = s.nextInt();
        qnt2 = s.nextInt();
        valor2 = s.nextDouble();
        
        valPag = ((qnt1*valor1) + (qnt2*valor2));
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valPag);
 
    }
 
}
