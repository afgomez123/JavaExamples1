import java.util.Scanner;

public class Nombre {
    public static void main(String argc[]){
    
    String nombre_uno = "", nombre_dos = "";
    Scanner entradaKey = new Scanner(System.in);

    System.out.print("Ingresar el primer nombre: ");
    nombre_uno = entradaKey.nextLine();

    System.out.print("Ingresar el segundo nombre: ");
    nombre_dos = entradaKey.nextLine();

    if(nombre_uno.equalsIgnoreCase(nombre_dos)){
        
    System.out.print("Los nombres son iguales");
    }else{
        
    System.out.print("Los nombres no son iguales");
    }
    }
}