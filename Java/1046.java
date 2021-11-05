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
		int inicio, fim, duracao=0;

		inicio = input.nextInt();
		fim = input.nextInt();
		
		if ((inicio > fim)) {
			duracao = (fim - inicio) + 24;
			if (duracao >= 1 & duracao <= 24){
		    System.out.println("O JOGO DUROU " + duracao + " HORA(S)");}
		}
		if (inicio < fim){
		    duracao = fim - inicio;
		    if (duracao >= 1 & duracao <= 24){
		    System.out.println("O JOGO DUROU " + duracao + " HORA(S)");}
		}
		if (inicio == fim){
		    duracao = 24;
		    if (duracao >= 1 & duracao <= 24){
		    System.out.println("O JOGO DUROU " + duracao + " HORA(S)");}
		    
		}
		
 
        
 
    }
 
}
