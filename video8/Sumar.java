import java.util.Scanner;

public class Sumar{
    public static void main(String args[]){
        
        Scanner entradaTeclado = new Scanner(System.in);
        String nombre = "";
        int numUno = 0, numDos = 0, resultado = 0;

        System.out.println("¿Cual es tu nombre?");
        nombre = entradaTeclado.nextLine();

        System.out.println("Dame el primer valor para tu suma:");
        numUno = entradaTeclado.nextInt();

        System.out.println("Dame el segundo valor para tu suma:");
        numDos = entradaTeclado.nextInt();

        resultado = numUno + numDos;
        System.out.println("Hola " + nombre + " el resultado de tu suma es: " + resultado);
    }
}