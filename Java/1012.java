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
 
       double A,B,C;
       Scanner x = new Scanner (System.in);
       A = x.nextDouble();
       B = x.nextDouble();
       C = x.nextDouble();
       //a
       double areat;
       areat = (A*C)/2;
       System.out.printf("TRIANGULO: %.3f\n", areat) ;
       //b
       double areac;
       areac = (C*C)*3.14159;
       System.out.printf("CIRCULO: %.3f\n", areac) ;
       //c
       double areata;
       areata = ((A+B)*C)/2; 
       System.out.printf("TRAPEZIO: %.3f\n", areata) ;
       //d
       double areaQ;
       areaQ = (B*B); 
       System.out.printf("QUADRADO: %.3f\n", areaQ) ;
       //e
       double areare;
       areare = A*B; 
       System.out.printf("RETANGULO: %.3f\n", areare) ;
 
    }
 
}
