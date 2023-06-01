import java.util.Scanner;

public class Trabajador{
  public static void main(String args[]){

    Scanner entradaTeclado = new Scanner(System.in);
    String nombre = "";
    int claveDep = 0, antiguedad = 0, vacaciones = 0;

    System.out.println("*****************************************************");
    System.out.println("Bienvenido al sistema vacacional de Coca-Cola company");
    System.out.println("*****************************************************");
    System.out.println("");
    System.out.println("");

    System.out.println("Por favor ingresar nombre: ");
    nombre = entradaTeclado.nextLine();
    System.out.println("");

    System.out.println("Ingresar clave de departamento: ");
    claveDep = entradaTeclado.nextInt();
    System.out.println("");

    System.out.println("Ingresar antiguedad: ");
    antiguedad = entradaTeclado.nextInt();
    System.out.println("");


        if (claveDep == 1){

            if(antiguedad == 1){
                vacaciones = 6;
                System.out.println("El trabajador "+ nombre + " tiene derecho a " + vacaciones + " dias.");
            } else if(antiguedad >= 2 && antiguedad <= 6){
                vacaciones = 14;
                System.out.println("El trabajador "+ nombre + " tiene derecho a " + vacaciones + " dias.");
            }else if(antiguedad >= 7){
                vacaciones = 20;
                System.out.println("El trabajador "+ nombre + " tiene derecho a " + vacaciones + " dias.");
            }

        }else if(claveDep == 2){

            if(antiguedad == 1 ){
                vacaciones = 7;
                System.out.println("El trabajador "+ nombre + " tiene derecho a " + vacaciones + " dias.");
            }else if(antiguedad <= 6){
                vacaciones = 15;
                System.out.println("El trabajador "+ nombre + " tiene derecho a " + vacaciones + " dias.");
            }else if(antiguedad >= 7){
                vacaciones = 22;
                System.out.println("El trabajador "+ nombre + " tiene derecho a " + vacaciones + " dias.");
            }

        }else if(claveDep == 3){

            if(antiguedad == 1){
                vacaciones = 10; 
                System.out.println("El trabajador "+ nombre + " tiene derecho a " + vacaciones + " dias.");
            }else if(antiguedad <= 6){
                vacaciones = 20;
                System.out.println("El trabajador "+ nombre + " tiene derecho a " + vacaciones + " dias.");
            }else if(antiguedad >= 7){
                vacaciones = 30;
                System.out.println("El trabajador "+ nombre + " tiene derecho a " + vacaciones + " dias.");
            }

        }else{
            System.out.println("Error!, la clave de departamento es incorrecta o no existe.");  
        }
    }  
} 