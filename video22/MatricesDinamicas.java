import java.util.Scanner;

public class MatricesDinamicas{
      public static void main(String args[]){

        int filas = 0, columnas = 0, contador = 1;
        

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresar numero de filas :");
        filas = teclado.nextInt();

        System.out.println("Ingresar numero de columnas :");
        columnas = teclado.nextInt();
        
        int numeros[][] = new int [filas][columnas];

        for(int f = 0; f < filas; f++) {
            for(int c = 0; c < columnas; c++) {
                    numeros[f][c] = contador;
                    contador++;
                    System.out.print("["+ numeros[f][c] +"]");

            }
            System.out.println("");
        }
    }
}