package Tarea2;

/**
 * Ejercicio 3.Precio del uniforme.
 * En un colegio e instituto privado, que cubre las etapas educativas desde 
 * primaria hasta secundaria, tienen un pequeño programa para calcular el precio
 * del uniforme en función de la etapa educativa y del genero del alumnado.
 * Crea una clase llamada Ejercicio3 para resolver este ejercicio.

 * En primer lugar debes crear dos enumerados:

 * Enumerado Curso con los valores INFANTIL, PRIMARIA, SECUNDARIA y DESCONOCIDO.
 * Enumerado Para con los valores NIÑO y NIÑA.
 * En segundo lugar, dentro del método main:

 * Declara una variable entera llamada edad. Dicha variable contendrá un número
 * aleatorio entre 0 y 20. Para generar dicho número puedes usar el siguiente
 * código (int)Math.round(Math.random()*20).
 * Declara una variable entera llamada genero. Dicha variable contendrá un 
 * número aleatorio entre 0 y 1. Para generar dicho número puedes puedes usar 
 * el siguiente código: (int)Math.round(Math.random()).
 * Declara una variable llamada curso del tipo enumerado Curso anterior.
 * Se inicializará más adelante.
 * Declara una variable llamada para del tipo enumerado Para anterior.
 * También se inicializará más adelante.
 * Una vez realizado lo anterior, y utilizando unicamente un switch, determina
 * a partir de la edad el curso al que iría el alumno o la alumna:

 * Si edad es 3, 4 o 5 años el curso será INFANTIL.
 * Si edad es 6, 7, 8, 9, 10 u 11 años, el curso será PRIMARIA.
 * Si edad es 12, 13, 14 o 15, el curso será SECUNDARIA.
 * Si no se da ninguno de los casos anteriores, el curso será DESCONOCIDO.
 * Después, utilizando otra vez un switch, determina a partir del genero, si el
 * uniforme es para niña o niño (debes almacenar el valor correspondiente en la
 * variable llamada para antes creada):

 * Si genero es 0, es un uniforme para NIÑO.
 * Si genero es 1, es un uniforme para NIÑA.
 * Por último, tienes que determinar el precio del uniforme, usando estructuras
 * if/else anidadas y las variables para y curso antes creadas, siguiendo
 * las premisas que hay a continuación:

 * Si el curso es DESCONOCIDO se mostrará "Etapa educativa desconocida." por
 * pantalla y nada más.
 * Si el curso es INFANTIL el precio del uniforme será 100€.
 * Si el curso es PRIMARIA y se trata de un NIÑO entonces el uniforme vale 126€.
 * Si el curso es PRIMARIA y se trata de un NIÑA entonces el uniforme vale 124€.
 * Si el curso es SECUNDARIA el precio del uniforme será 143€.
 * @author Adrian Romero
 * @version 1.0
 */
public class Ejercicio03 {
    
    public enum Curso {INFANTIL, PRIMARIA, SECUNDARIA, DESCONOCIDO};
    public enum Para {NIÑO, NIÑA};
    
    public static void main (String[] args)
    {
        int edad=(int)Math.round(Math.random()*20);
        int genero=(int)Math.round(Math.random());
        Curso curso;
        Para para;
        String cadena;
        
        switch (edad)
        {
            case 3:
                curso=Curso.INFANTIL;
                break;
            case 4:
                curso=Curso.INFANTIL;
                break;
            case 5:
                curso=Curso.INFANTIL;
                break;
            case 6:
                curso=Curso.PRIMARIA;
                break;
            case 7:
                curso=Curso.PRIMARIA;
                break;
            case 8:
                curso=Curso.PRIMARIA;
                break;
            case 9:
                curso=Curso.PRIMARIA;
                break;
            case 10:
                curso=Curso.PRIMARIA;
                break;
            case 11:
                curso=Curso.PRIMARIA;
                break;
            case 12:
                curso=Curso.SECUNDARIA;
                break;
            case 13:
                curso=Curso.SECUNDARIA;
                break;
            case 14:
                curso=Curso.SECUNDARIA;
                break;
            case 15:
                curso=Curso.SECUNDARIA;
                break;
            default:
                curso=Curso.DESCONOCIDO;
                break;
        }
        
        switch (genero)
        {
            case 0:
                para=Para.NIÑO;
                break;
            default:
                para=Para.NIÑA;
                break;   
        }
        
        System.out.println("Edad: "+edad);
        System.out.println("Genero: "+genero);
        cadena="El uniforme de "+curso+" para "+para;
        
        if (curso==Curso.DESCONOCIDO)
            cadena="Etapa educativa desconocida";
        else
            if (curso==Curso.INFANTIL)
                cadena=cadena+" vale 100€.";
            else
                if (curso==Curso.PRIMARIA)
                    if (para==Para.NIÑO)
                        cadena=cadena+" vale 126€.";
                    else
                        cadena=cadena+" vale 124€.";
                else
                    cadena=cadena+" vale 143€.";    
            
        System.out.println(cadena);
    }
    
}
