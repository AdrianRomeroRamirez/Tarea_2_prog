package Tarea2;

/**
 * Ejercicio 2. Constructor de frases.
 * Crea una clase en Java llamada Ejercicio2 para resolver este ejercicio. 
 * Almacena en una constante numérica tipo entera llamada CONSTANTE el número 4.
 * Después:

 * Inicializa una variable llamada res tipo cadena a "Estuve en ".
 * Crea un número real llamado ale. Establece el valor de dicho número con un
 * valor aleatorio entre -5 y 15. Para generar un número aleatorio entre min=-5 
 * y max=15 puedes usar la expresión Math.random()*(max-min)+min. Muestra dicho
 * número por pantalla.
 * Si la variable ale contiene un mayor o igual a CONSTANTE, debes concatenar a
 * la variable res el texto "Varsovia". En caso contrario debes concatenar
 * "Budapest".
 * Vuelve ahora a generar otro número aleatorio entre 0 y 12, almacenalo en la
 * variable ale y muéstralo por pantalla.
 * Si el nuevo valor de ale está entre 0 y 4, sin incluir el 4, pero si el 0,
 * se concatenará la cadena " y hacía frio." a la cadena res.
 * Si el nuevo valor de ale está entre 4 y 8, incluyendo ambos, se concatenará 
 * la cadena " y hacía calor." a la cadena res.
 * Si no se cumple ninguna de las dos condiciones anteriores, se concatenará "
 * y estaba nublado." a la cadena res.
 * Finalmente, se mostrará la cadena res por pantalla, resultante de las 
 * concatenaciones anteriores.
 * @author Adrian Romero
 * @version 1.0
 */
public class Ejercicio02 {

    public static void main (String[] args)
    {
        // Primero inicializo las variables y constantes.
        
        final int CONSTANTE=4;
        String res="Estuve en ";
        double ale=Math.random()*(-5-15)+15;
        System.out.println("El primer número aleatorio es: " + ale );
        
        /* 
        * Aquí uso la estructura if/else para que haga una acción u otra
        * dependiento de si se cumple una condición o no.
        */
        
        if (ale>=CONSTANTE)
            res=res+"Varsovia ";
        else
            res=res+"Budapest ";
        
        ale=Math.random()*12;
        
        System.out.println("El segundo numero aleatorio es: " + ale );
        
        /*
        * Aquí opto por usar la anidación de varios if/else ya que hay mas de
        * dos opciones que puede ejecutar dependiendo de las condiciones.
        */
        
        if (ale<4)
            res=res+"y hacía frio.";
        else
            if (ale>=4 && ale<=8)
                res=res+"y hacía calor.";
            else
                res=res+"y estaba nublado.";
      
        System.out.println(res);
                  
    }
    
}
