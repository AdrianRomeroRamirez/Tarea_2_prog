package Tarea2;

/**
 * Ejercicio 4. Secuencia de caracteres.
 * Crea un archivo llamado Ejercicio4.java para realizar este ejercicio.
 * En este ejercicio tendrás que escribir un programa que genere una secuencia
 * de caracteres compuesta por los caracteres '<', '*' y '>'.La secuencia de
 * caracteres tendrá siempre 10 caracteres.
 * El número de asteriscos a incluir será un número aleatorio entre 0 y 5, 
 * ambos incluidos. Para elegir un número aleatorio entre 0 y 5 puedes usar 
 * las siguiente fórmula: (int)Math.round(Math.random()*5)

 * El número de símbolos '<' y el número de símbolos '>', deberá ajustarse
 * para que la cadena siempre tenga 10 símbolos. Por ejemplo, si el número 
 * de asteriscos es 4 (número par), a la izquierda y a la derecha de los
 * asteriscos irán el mismo número de símbolos; pero si el número de asteriscos
 * es 3 (número impar), tendrán que añadirse 4 símbolos a la izquierda y 3 a la
 * derecha, uno más a la izquierda que a la derecha.
 * @author Adrian Romero
 * @version 1.0
 */
public class Ejercicio04 {
    
    public static void main (String[] args)
    {
        int ale=(int)Math.round(Math.random()*5);
        String cadena="";               
        int div=Math.round(10-ale)/2; 
        /*
        *Mi idea era que div me diera el numero de veces que se repite > ya que
        *se supone que tiene que redondear a la alza, por lo menos eso creo.
        *Pero como redondea hacia abajo lo he usado para el numero de <
        */
        int resto=10-ale-div;
        int contador=0;
        
        do{
            cadena=cadena+">";
            contador=contador+1;
        }
        while (contador<resto);
        
        contador=0; //Reinicio contador a 0
        
        while (contador<ale){  
            cadena=cadena+"*";      
            contador=contador+1;
        }
        /*
        *El bucle while lo he usado con los asteriscos ya que puede tener
        *valor 0, por lo tanto nunca se ejecutaria el bucle
        */
        
        contador=0;
        
        do{
            cadena=cadena+"<";
            contador=contador+1;
        }
        while (contador<div);
        
        System.out.println(cadena);
        
    } 
}
