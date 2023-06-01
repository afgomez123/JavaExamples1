public class CiclosDosMia{
    public static void main(String args[]){

        int i = 1;
        int j = 99;

        System.out.println("Serie con doWhile");
        do{               
             
                    System.out.print(i);
                    i++ ;
                    System.out.print(",");

                    System.out.print(j);
                    j--;
                    if(i <= 5){                   
                    System.out.print(",");
                    }                  
          
        }while(i <= 5 );


        System.out.println("");
        System.out.println("");
        i = 1;
        j = 99;
        System.out.println("Serie con doWhile");
        while(i <= 5 ){               
             
                    System.out.print(i);
                    i++ ;
                    System.out.print(",");

                    System.out.print(j);
                    j--;
                    if(i <= 5){                   
                    System.out.print(",");
                    }                  
          
        }

        System.out.println("");
        System.out.println("");
        i = 1;
        j = 99;
        System.out.println("Serie con For");
        for(i = 1 ; i <= 5; i++){               
             
                    System.out.print(i);
                    System.out.print(",");

                    System.out.print(j);
                    j--;
                    if(j >= 95){                   
                    System.out.print(",");
                    }                  
          
        }

    }
}