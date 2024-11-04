package EjercicioTelevisor11y12y13;

import java.util.Scanner;

public class Televisor11 {

    private String marca;
    private String modelo;
    private int anio;
    private boolean panoramica;
    private boolean stereo;
    private boolean encendida;
    private int volumen;
    private int canal;

    Televisor11(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        if (anio >=1950 && anio <=2200){
        this.anio = anio;
        }else {this.anio=2000;}
    }

    void caracteristicas() {
        System.out.format("""
                      Marca=%s
                      Modelo=%s
                      Año=%d
                      Panoramica=%b
                      Stereo=%b
                      Encendido=%b
                      Volumen=%d
                      Canal=%d
                      
                      """, marca, modelo, anio, panoramica, stereo, encendida, volumen, canal);

    }

    void cambiarVolumen(int volumen) {
        if (encendida) {
            if (volumen < 0 || volumen > 100) {
                System.out.println("Error, volumen fuera de rango");
            } else {
                this.volumen = volumen;
            }
        } else {
            System.out.println("Monitor apagado");
        }
    }

    void cambiarCanal(int canal) {
        if (this.encendida) {
            if (canal < 1 || canal > 100){
                System.out.println("Error, elija un canal entre 1 a 100");
            }else{
            this.canal = canal;}
            System.out.println("Se muestra el canal: " + this.canal);
        } else {
            System.out.println("Monitor apagado");
        }
    }

    void obtenerCanal() {
        if (this.encendida) {
            System.out.println("Está usted en el canal: " + this.canal);
        } else {
            System.out.println("TV apagada");
        }
    }

    void subirCanal() {
        if (this.encendida) {
            if (this.canal + 1 > 100){
                System.out.println("Error, elija un canal del 1 al 100");
            }else{this.canal+=1;}
            System.out.println("Ahora usted está en el canal: " + this.canal);
        } else {
            System.out.println("TV apagada");
        }
    }

    void bajarCanal() {
        if (this.encendida) {
            if ((this.canal - 1) < 1 ){
                System.out.println("Error, elija un canal entre 1 y 100");
            }else {this.canal-=1;
            System.out.println("Ahora está usted en el canal: " + this.canal);
        }}else {
            System.out.println("TV apagada");
        }
    }

    void encender() {
        if (!encendida) {
            System.out.println("Televisor encendido");
        } else {
        }
        encendida = true;
    }

    void apagar() {
        if (encendida) {
            System.out.println("Apagando TV");
        } else {
        }
        encendida = false;

    }
}
