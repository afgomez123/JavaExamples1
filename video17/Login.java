import java.util.Scanner;

public class Login {
    public static void main(String args[]){

        String usuario = "", password = "";
        Scanner entradaKey = new Scanner(System.in);

        System.out.print("Ingresar el usuario:");
        usuario = entradaKey.nextLine();

        System.out.print("Ingresar el password:");
        password = entradaKey.nextLine();

        if(usuario.equals("andres") && password.equals("12345")){
            System.out.print("Inicio de session correcto");
        }else{
            System.out.print("Inicio de session incorrecto");
        }
    }
}