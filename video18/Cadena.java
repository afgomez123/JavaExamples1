import java.util.Scanner;

public class Cadena {
    public static void main (String args[]){

        Scanner entradaKey = new Scanner(System.in);

        String textoCadena = "", textoCadenaSub ="" ;
        int desde = 0, hasta = 0, num_caracteres = 0;

        System.out.print("Ingresar cadena: ");
        textoCadena = entradaKey.nextLine();

        System.out.print("Cantidad Solcitada Inicial: ");
        desde = entradaKey.nextInt();

        System.out.print("Cantidad Solcitada Final: ");
        hasta = entradaKey.nextInt();

        num_caracteres = textoCadena.length(); 
        textoCadenaSub = textoCadena.substring(desde,hasta);


        System.out.println("La nueva cadena es: " + textoCadenaSub);
        System.out.println("Catidad de caracteres: " + num_caracteres);


    }
}