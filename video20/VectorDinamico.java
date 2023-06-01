import java.util.Scanner;

public class VectorDinamico {
    public static void main(String args[]){
        Scanner entradaTec = new Scanner(System.in);
        int longitud = 0;

        System.out.print("Ingresar la longitud del arreglo : ");
        longitud = entradaTec.nextInt();

        int numeros[] = new int[longitud];

        for(int i = 0; i < numeros.length; i++){
           System.out.println("Porfavor dame el valor # : " + (i + 1));  
           numeros[i] = entradaTec.nextInt();
        }

        for(int i = 0; i < numeros.length; i++){
           System.out.println("[" + numeros[i] + "]");  
        }
    }
}