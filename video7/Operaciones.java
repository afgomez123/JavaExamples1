public class Operaciones {
    public static void main(String args[]){

        int operacion = 5;
        int num_uno = 8;
        int num_dos = 4;
        int resultado = 0;

        if(operacion == 1){
            resultado = num_uno + num_dos;
            System.out.println("Resultado de la suma:" + resultado);
        }else if(operacion == 2){
            resultado = num_uno - num_dos;
            System.out.println("Resultado de la resta:" + resultado);
        }else if(operacion == 3){
            resultado = num_uno * num_dos;
            System.out.println("Resultado de la multiplicacion:" + resultado);
        }else if(operacion == 4){
            resultado = num_uno / num_dos;
            System.out.println("Resultado de la division:" + resultado);
        }else{
            System.out.println("La opcion que elegiste no existe");
        }
    } 
}