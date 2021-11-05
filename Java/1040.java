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
 
        Scanner entrada = new Scanner(System.in);		
		float n1, n2, n3, n4, media, exame;		

		n1 = entrada.nextFloat();
		n2 = entrada.nextFloat();
		n3 = entrada.nextFloat();
		n4 = entrada.nextFloat();
		
		media = (n1*2+n2*3+n3*4+n4*1)/10;

		System.out.printf("Media: %.1f\n",media);

		if(media >= 7.0){
			System.out.println("Aluno aprovado.");
		}
		
		if(media < 5.0){
			System.out.println("Aluno reprovado.");
		}
		
		if(media >=5.0 && media < 7.0){
			System.out.println("Aluno em exame.");
			exame = entrada.nextFloat();
			System.out.printf("Nota do exame: %.1f\n",exame);
		        media = (media + exame)/2;
			if(media >= 5.0){
				System.out.println("Aluno aprovado.");
			}else{
				System.out.println("Aluno reprovado.");
			}
			System.out.printf("Media final: %.1f\n",media);
		}
 
    }
 
}
