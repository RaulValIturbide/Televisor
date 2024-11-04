/*Sabiendo que:
-	El método “imprimirCaracteristicas” muestra en pantalla el valor de todas las propiedades del objeto.
-	Si al cambiar el volumen o el canal de la televisión, el nuevo valor está fuera del rango permitido se debe mostrar un mensaje de error y dejar el valor que hubiera previamente.
-	Si se intenta encender o apagar dos el televisor veces consecutivas no se debe mostrar ningún mensaje.
-	Si el televisor está apagado sólo podremos encenderlo o imprimir sus características. En el resto de los métodos escribiremos: “Televisor apagado”.
-	Para el resto de los casos de los métodos se debe mostrar un mensaje que indique la acción que se ha realizado.
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
