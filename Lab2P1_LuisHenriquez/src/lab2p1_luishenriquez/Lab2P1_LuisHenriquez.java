
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
              }//ESTA ES LA SOLUCION DE LA FORMULA
               res = contador * 2;//EL Pi SOBRE 2 NO SE DIVIDE SI NO QUE SE PASA A MULTIPLICAR
              System.out.println("Pi: "+res);
              break;            
              
                
          
          case 3:
              System.out.println("Ingrese A");
              int Num1 = leer.nextInt();
               System.out.println("Ingrese B");
              int Num2 = leer.nextInt();
             
              
              while (Num1<=0 || Num2<=0){
              System.out.println(Num1);
              System.out.println(Num2);
              System.out.println("Los numeros tienen que ser positivos");
              System.out.println("Ingrese A");
               Num1 = leer.nextInt();
               System.out.println("Ingrese B");
               Num2 = leer.nextInt();
              }//En caso que un numero sea cero
              
                  while (Num1 != Num2) {
            if (Num1 > Num2) {
                Num1 = Num1-Num2;
            } else {
                Num2 = Num2 - Num1;
            }//RESTAS PARA SACAR EL MCD
        }
        
        // Imprimir el resultado
        System.out.println("El MCD es: " + Num1);
        
                break;
          
          default : 
               if (opc != 3){
                    System.out.println("ERROR OPCION INCORRECTA");
               }//OPCION INCORRECTA
               break;
                  
              }//fin del swtich
          
       System.out.println("Si quiere continuar ingrese {1} si no ingrese cualquier otro numero:");
     Respuesta = leer.nextInt();   
     //AQUI INGRESA SI QUIERE VOLVER ENTRAR AL MENU
      }//fin del while
     
     
     
     
     
     
     
     
     
     }
     
     
    }
