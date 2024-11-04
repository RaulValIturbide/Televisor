/*13)	Añade una clase llamada PruebaTelevisor al proyecto del ejercicio anterior que verifique el buen funcionamiento de los objetos de tipo Televisor.
Para ello haremos la siguiente secuencia de acciones:
-	Crearemos un televisor de la marca “Sony”, modelo “Bravia” del año 2024.
-	A continuación, imprimiremos sus características.
-	Encendemos el televisor e imprimimos el canal seleccionado.
-	Ahora bajamos de canal (debe dar un mensaje de error).
-	Seleccionamos el canal 23 y después subimos de canal.
-	Ahora intentamos poner el volumen a 300 (debe dar un error).
-	Ponemos el volumen a 50 e imprimimos las características de nuevo.
-	Apagamos el televisor
-	Seleccionamos el canal 60 (debe decir que está apagado).
-	Y por último apagamos el televisor otra vez.

*/
package EjercicioTelevisor11y12y13;


public class TelevisorPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Televisor11 tele1 = new Televisor11("Sony", "Bravia", 2024);
       tele1.caracteristicas();
       tele1.encender();
       tele1.obtenerCanal();
       tele1.bajarCanal();
       tele1.cambiarCanal(23);
       tele1.subirCanal();
       tele1.cambiarVolumen(300);
       tele1.cambiarVolumen(50);
       tele1.caracteristicas();
       tele1.apagar();
       tele1.cambiarCanal(60);
       tele1.apagar();
       
    }
    
}
