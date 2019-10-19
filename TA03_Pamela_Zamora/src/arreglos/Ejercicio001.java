
package arreglos;
import java.util.Random;// se importa random
import java.util.Scanner;

public class Ejercicio001 {
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in); 
        Random dado= new Random ();
        // se crea una lista que tendra 100 elementos
        int arreglo [] = new int[100]; 
            
            for (int j=0;j<100;j++){
                // desde 0 hasta 20 sera la cantidad
                arreglo[j] = (dado.nextInt(20)+1);
                System.out.print("["+arreglo[j]+ "]");// se imprime
            }
                // DIGITAMOS LOS NUMEROS
                System.out.print(" \ndigite PRIMER numero del 1 al 20:");
                int numero1= entrada. nextInt();   
                System.out.print(" digite SEGUNDO numero del 1 al 20:");
                int numero2= entrada. nextInt(); 
                
                // SE INTERCAMBIA EL NUMERO 1 POR EL NUMERO 2
                    String N2 = Integer.toString(numero2);
                    String[] arregloString = new String[100];
                    for (int i = 0; i < 100; i++) {
                        // SE CONVIERTE A STRING EL NUMERO 
                        String numeroString = Integer.toString(arreglo[i]);
                        arregloString[i] = numeroString;
                        if (arreglo[i] == numero1) {
                        arregloString[i] = "'" + N2 + "'"; 
                        }
                    }
                    for (int i = 0; i < 100; i++) {
                    System.out.print("[" + arregloString[i]+"]");
                    }                     
                }      
            }
       
               
              
            
        
           
            
            
            
            
                      
            
  
    

