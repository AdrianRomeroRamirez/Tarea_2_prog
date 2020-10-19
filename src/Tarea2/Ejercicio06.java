package Tarea2;

/**
 * Ejercicio 6. TV show.
 * Para realizar este ejercicio crea una clase llamada Ejercicio6.
 * En un concurso de televisión, donde hay un total de 25 participantes 
 * dispuestos en 5 columnas y 5 filas, se van eligiendo los participantes de 2
 * en 2 para competir entre sí. Para facilitar la tarea de la presentadora, te
 * piden que hagas un programa que automatice la elección de los participantes.
 * En el texto anterior se puede ver claramente que fila y que columna ocuparía
 * cada participante elegido, empezando a contar desde 0. Es imprescindible que
 * la primera mesa y la segunda sean diferentes, hay que tener cuidado con eso,
 * dado que al ser mesas elegidas al azar, puede ocurrir que las mesas elegidas
 * sean la misma (es difícil pero el azar es el azar). También es importante que
 * la ubicación de las mesas elegidas se muestre claramente, sin confusión.
 * El proceso a realizar sería el siguiente:

 * En primer lugar hay que elegir aletoriamente la fila y la columna del
 * primer participante. Para obtener un número aleatorio entre 0 y 4
 * (ten en cuenta que la numeración empieza en 0), puedes usar el
 * siguiente código: (int)(Math.random()*5).
 * En segundo lugar hay que elegir aleatoriamente la fila y la columna del
 * segundo participante, pero asegurandose de que no coincide con las 
 * coordenadas del primer participante. Para realizar este apartado deberás
 * usar un bucle do-while o un bucle while, el que tu creas más conveniente.
 * En tercer lugar habrá que mostrar las coordenadas de las mesas elegidas:
 * En cuarto lugar habrá que añadir la cabecera de la tabla:
 * Y por último, a través de dos bucles for (uno anidado dentro de otro),
 * muestra la tabla con las ubicaciones:
 * Para realiza la tabla final es altamente recomendable ir concatenando
 * carácteres en una cadena: "cad=cad+'C'"; tal y como se ha indicado
 * en ejercicios anteriores.
 * @author Adrian Romero
 * @version 1.0
 */
public class Ejercicio06 {
    
    public static void main (String[] args){
        
        int f_1=(int)(Math.random()*5);
        int c_1=(int)(Math.random()*5);
        int f_2=(int)(Math.random()*5);
        int c_2=(int)(Math.random()*5);
        int i=0;
        int j=0;
        String cadena="";
        
        while (f_1==f_2 && c_1==c_2){
            f_2=(int)(Math.random()*5);
            c_2=(int)(Math.random()*5);
        }
        /*
        *Con esta estructura while consigo que si "f_1 y f_2" y tambien "c_1 y_c_2"
        *coinciden, se busca otros numeros al azar.
        */
            
        System.out.println("La primera mesa elegida es columna "+c_1+", fila "+f_1);
        
        System.out.println("La segunda mesa elegida es columna "+c_2+", fila "+f_2);
        
        System.out.println(" 01234");
        
        for (i=0; i<5; i++){
            
            cadena=cadena+i;
            
            for (j=0; j<5; j++){
                
                if ((c_1==j && f_1==i) | (c_2==j && f_2==i))
                    
                    cadena=cadena+"*";
                
                else
                    
                    cadena=cadena+"-";
                
                if (j==4)
                    
                    cadena=cadena+"\n";
                /*
                *Con este ultimo if consigo que al terminar la lista de j salte
                *al sigueinte parrafo.
                */

            }
        }
        
        System.out.println(cadena);
    
    }
    
}
