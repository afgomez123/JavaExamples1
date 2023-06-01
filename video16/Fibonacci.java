public class Fibonacci{
    public static void main(String args[]){

    int a = 0, b = 1, acu = 0;
    System.out.println("");
    System.out.println("");
    System.out.println("***********************************");
    System.out.println("Serie con for: ");
    System.out.println("******************");


    for(int i = 0; i < 10; i++){
        if (i < 9){

          System.out.print(a + ",");
          acu = a + b;
          a = b;
          b = acu;    
        }else{
          System.out.print(a);
        }       
      }
    System.out.println("");
    System.out.println("");
    System.out.println("***********************************");
    System.out.println("Serie con While: ");
    System.out.println("********************");


    int i = 0;
    a = 0;
    b = 1;
    acu = 0;

    while(i < 10){
      if(i < 9){
      System.out.print(a + ",");
      acu = a + b;
      a = b;
      b = acu;

      }else{
           System.out.print(a);
      }
      i++;
    }
    System.out.println("");
    System.out.println("");
    System.out.println("***********************************");
    System.out.println("Serie con DoWhile: ");
    System.out.println("*********************");

    i = 0;
    a = 0;
    b = 1;
    acu = 0;

    do{
    
      if(i < 9){
      System.out.print(a + ",");
      acu = a + b;
      a = b;
      b = acu;

      }else{
           System.out.print(a);
      }
        i++;
 
    }while(i < 10);


    }
}