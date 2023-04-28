
package lab2p1_luishenriquez;

import java.util.Scanner;

public class Lab2P1_LuisHenriquez {

   
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
     
    int Respuesta = 1;
        
     while (Respuesta == 1) {
         System.out.println("1.Numero par y primo");
            System.out.println("2.Pi");
             System.out.println("3.MCD de dos numero");
               System.out.println("Ingrese una opcion");
     int opc = leer.nextInt();
     
     
      switch (opc) {
          
          case 1:
              System.out.println("Ingrese un numero para ver si es primo y par");
              int primopar = leer.nextInt();
              int uno = 1;
              int cero = 0;
              boolean primo;
              boolean par; 
              
              
              while (primopar <= 0) {                     
              System.out.println("Ingrese un numero para ver si es primo y par");
              primopar = leer.nextInt();
              }
                                
              while (uno <= primopar) {
                  
                 if (primopar % uno == 0) {
                      cero = cero + 1;
                 }
                 
                   uno = uno + 1;
              }
              
              if (cero == 2) {   
                 primo = true;     
              }//por si es numero primo
              
                else{
                   primo = false; 
                }//no es numero primo
                     
                    if (primo == true) {
                       System.out.println("El numero " + primopar + " es primo");
                    }
                    else{
                     System.out.println("El numero "+ primopar + " no es primo");
                    }
                    
                    if (primopar % 2 ==0){
                        par = true;
                    }
                    else{
                       par = false;
                    }
                    
                    
                    if (par == true) {
                       System.out.println("El numero " + primopar + " es par");
                    }
                    else{
                     System.out.println("El numero "+ primopar + " no es par");
                    }
                    
                break;        
                            
                            
          case 2:
              System.out.println("Ingrese un numero para ver la respuesta de la formula");
              int PI = leer.nextInt();
              double res = 0;
              int i = 1;
              int dos = 2;
              double sumas = 0;
              double contador = 1;
              double arriba;
              double abajo;
              
              while (i <= PI) {
                 arriba = 4 * (Math.pow(i, dos));
                 abajo = 4 * (Math.pow(i, dos)) - 1;
                 sumas = arriba / abajo;
                 contador = contador * sumas;
              i = i + 1;
              }
               res = contador * 2;
              System.out.println("Pi: "+res);
              break;            
              
                
          
          case 3:
          
          default : 
               if (opc != 3){
                    System.out.println("ERROR OPCION INCORRECTA");
               }
               break;
          
      }//fin del switch
     
     
     
     
     
     
     
     
     System.out.println("Si quiere continuar ingrese {1} si no ingrese cualquier otro numero:");
     Respuesta = leer.nextInt();
     }
     
     
    }
    
}
