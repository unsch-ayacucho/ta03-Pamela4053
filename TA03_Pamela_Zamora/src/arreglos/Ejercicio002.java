
package arreglos;
import java.util.Scanner;
public class Ejercicio002 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int numerosInicial[]= new int[10]; // CREAMOS EL ARRAY LISTA
        int numerosFinal[]= new int[10];
        // SE PEDIRA AL USUARIO 10 NUMEROS
        for(int i=0;i<10;i++){
            System.out.print((i+1)+" .ingrese un numero:");
            int numero= entrada.nextInt();
            numerosInicial[i]= numero; // SE ALMACENARA EN EL ARRAY
        } 
        System.out.println(" ");
        // SE IMPRIME EL ARRAY INICIAL
        // imprimir indice
        for(int i=0;i<10;i++){
            System.out.print("  "+i+"  ");
        }
            System.out.println(" ");
            for(int i=0;i<10;i++){
            System.out.print("[ "+ numerosInicial[i]+" ]");
        }   
        
        // hallando los primos
         // mandar al inicio a todos los numeros primos
        int valor =0;        
        for (int i = 0; i < 10; i++) {
            int cont = 0;
            for (int j = 1; j <= numerosInicial[i]; j++) {
                if (numerosInicial[i] % j == 0) {
                    cont=cont+1;
                }                
            }
            if(cont == 2){
                    // se pone al inicio los numeros primos
                    numerosFinal[valor]=numerosInicial[i];
                    valor=valor+1;                
            }            
        }  
          System.out.println("");
         // mandar al final los que no son primos
        for (int i = 0; i < 10; i++) {
            int cont = 0;
            for (int j = 1; j <= numerosInicial[i]; j++) {
                if (numerosInicial[i] % j == 0) {
                    cont++;
                }               
            }
            if(cont != 2){
                    // si no es primo va despues de los primos
                    numerosFinal[valor]=numerosInicial[i];
                    valor=valor+1;               
                }            
        }
        
        // imprimir el arrray final
         for(int j=0;j<10;j++){
            System.out.print("  "+j+"  ");
        }
            System.out.println(" ");
            for(int j=0;j<10;j++){
            System.out.print("[ "+numerosFinal[j]+" ]");
        }   
      
        
        
        
    } 
    
    
    
    
}
