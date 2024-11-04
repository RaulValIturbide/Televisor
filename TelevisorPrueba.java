/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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
