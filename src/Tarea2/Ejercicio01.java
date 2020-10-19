package Tarea2;

/**
 * Ejercicio 1. Uso del depurador.
 * En este apartado se te pide que uses el depurador de NetBeans para realizar 
 * la tarea. Para ello debes partir del siguiente código. Escríbelo en un 
 * archivo llamado Ejercicio01.java
 * En este ejercicio no se pide que elabores código en Java, tampoco está
 * permitido modificar el código del ejercicio, sino que debes elaborar un 
 * documento donde aparezca lo siguiente:

 * Breve descripción de lo que realiza el programa.
 * El programa, tal y como está diseñado, jamás llega a mostrar el caso de 
 * "Hebreo se pronuncia 'shalom'." por pantalla, y a través del depurador debes
 * conseguir que se muestre. Para ello establece un punto de ruptura en una 
 * línea antes del bucle while. La idea es que detengas la ejecución y que en 
 * tiempo de ejecución cambies el valor de la variable j en la ventana del 
 * depurador llamada "Variables". Debes modificar el valor de dicha variable de
 * manera que llegue a mostrarse como se pronuncia hola en hebreo por pantalla.
 * No olvides realizar una captura de pantalla con la variable modificada para
 * adjuntarla al documento, es importante modificar la variable en el lugar 
 * adecuado, dado que sino no funcionaría.
 * Quita el punto de ruptura anterior, y añade un punto de ruptura justo en el 
 * comienzo del switch y ejecuta paso a paso. Dentro de la ejecución paso a paso,
 * fijate cuando la variable "mensaje" contiene el mensaje completo que se
 * mostrará por pantalla (incluido como se dice hola en el idioma 
 * correspondiente). Justo después de que tenga el valor final, y antes de que
 * sea mostrado por pantalla, modifica el valor de la variable "mensaje" a través
 * de la ventana "Variables" del depurador para que por pantalla se muestre 
 * "Gracias." añadido al final del mensaje mostrado por pantalla. Por ejemplo, 
 * si j fuera 3, en vez de mostrar "Caso 3: Hola en Ruso se pronuncia 'pri-viet'.
 * " tendrías que forzar a que mostrara "Caso 3: Hola en Ruso se pronuncia
 * 'pri-viet'. Gracias.".
 * @author Adrian Romero
 * @version 1.0
 */
public class Ejercicio01 {
    
    public static void main (String[] m)
    {
        int j=(int)Math.round(Math.random()*4+2); 
        int i=0;        
        int x=0;
        String mensaje="Caso "+j+": Hola en ";
        while (x<=j) {
            i+=x;
            x++;
        }        
        
        switch(i)
        {
            case 3: 
                mensaje+="Suajili se pronuncia 'jambo'.";
                break;
            case 6: 
                mensaje+="Ruso se pronuncia 'pri-viet'.";
                break;
            case 10: 
                mensaje+="Árabe se pronuncia \"As-salām 'alaykum\".";
                break;             
            case 15:
                mensaje+="Chino se pronuncia 'ni hao'.";
                break;                 
            case 21:
                mensaje+="Japonés se pronuncia 'ko-nin-chi-wá'.";
                break; 
            case 28:
                mensaje+="Hebreo se pronuncia 'shalom'.";
                break; 
        }
        
        System.out.println(mensaje);
    }
    
}
