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
 
        int numFunc,horasTrab;
        double valorHora,sal;
        Scanner s = new Scanner (System.in);
        numFunc = s.nextInt();
        horasTrab = s.nextInt();
        valorHora = s.nextDouble();
        sal = (valorHora * horasTrab);
        System.out.println("NUMBER = "+numFunc);
        System.out.printf("SALARY = U$ %.2f", sal);
        System.out.println();
 
    }
 
}
