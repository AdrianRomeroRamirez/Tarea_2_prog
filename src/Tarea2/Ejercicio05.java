package Tarea2;

/**
 * Ejercicio 5. Matemáticas manipulativas.
 * Crea una clase llamada Ejercicio5 para realizar este ejercicio. Un maestro
 * de matemáticas te ha pedido que realices un programa que genere una serie de
 * mini-tarjetas para trabajar en clase con su alumnado de 1º de Primaria. 
 * La idea es que se le entregue la primera tarjeta (que corresponde con la 
 * primera línea recortada), y que el alumnado tenga que buscar las tarjetas 
 * que correspondan en otras mesas (que serían las otras líneas recortadas).
 * Solo debes usar bucles for, en total, cuatro bucles for.
 * El número que aparece oculto (con asteriscos) será elegido al azar entre 10 
 * y 19, ambos incluidos. Dicho número se almacenará en una variable llamada x.
 * Para ello puedes usar el siguiente código: (int)(Math.random()*10+10).
 * En la segunda línea es imprescindible que el número aparezca justo
 * debajo de los asteriscos, para que el alumnado asocie cada número a
 * su posición dentro de la secuencia.
 * Para generar la tercera línea es imprescindible que en el bucle for comience
 * de la siguiente forma: "for (int i=x+1;..." (los puntos suspensivos
 * habría que sustituirlos por código).
 * Para generar la cuarta línea es imprescindible que en el bucle for comience
 * de la siguiente forma: "for (int i=x-1;..." (nuevamente, los puntos 
 * suspensivos habría que sustituirlos por código).
 * @author Adrian Romero
 * @version 1.0
 */
public class Ejercicio05 {
    
    public static void main (String[] args){
        
        int x=(int)(Math.random()*10+10);
        int i=0;
        String cadena="";
        
        for (i=10; i<20; i++){
            
            if (i==x)
                cadena=cadena+" **";
            else
                cadena=cadena+" "+i;
        }
        
        System.out.println(cadena); 
        
        cadena=""; //Reinicio cadena a ""
                                
        for (i=10; i<20; i++){
            
            if (i==x)
                cadena=cadena+" "+i;
            else
                cadena=cadena+"---";
        }
        
        System.out.println(cadena);
        
        cadena="";
        
        for (i=x+1; i<x+6; i++){
            
            cadena=cadena+" "+i;
        }
        
        System.out.println("Los 5 números posteriores son: "+cadena);
        
        cadena="";
        
        for (i=x-1; i>x-6; i--){
            
            cadena=cadena+" "+i;
        }
        
        System.out.println("Los 5 números anteriores son: "+cadena);
        
    }
    
}
