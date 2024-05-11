/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author natsu
 */
public class Estudiantes {
    String nombre;
    double calif1;
    double calif2;
    double calif3;
    double prom;
    public Estudiantes(String nom, double c1, double c2){
        nombre = nom;
        calif1 = c1;
        calif2 = c2;
        calif3 = (c1 + c2)/2;
    }
    public Estudiantes(String nom , double c1, double c2, double c3){
        nombre = nom;
        calif1 = c1;
        calif2 = c2;
        calif3 = c3;
    }
    
    public void establecernombreEstudiantes(String nom) {
        nombre = nom;
    }

    public void establecerCalificacion1(double c) {
        calif1 = c;
    }

    public void establecerCalificacion2(double c) {
        calif2 = c;
    }

    public void establecerCalificacion3(double c) {
        calif3 = c;
    }

    public void establecerPromedio() {
        double suma;
        suma = calif1 + calif2 + calif3;
        prom = suma / 3;
    }
    public String obtenernombreEstudiantes() {
        return nombre;
    }

    public double obtnerCalificacion1() {
        return calif1;
    }

    public double obtnerCalificacion2() {
        return calif2;
    }

    public double obtnerCalificacion3() {
        return calif3;
    }
    @Override
    public String toString() {
        String cadena = String.format("Calificaciones Estudiantes\n"
                + "----------------------------------------------------------\n"
                + "Nombre del Estudiante: %s\n"
                + "Calficacion 1: %.2f\n"
                + "Calificacion 2: %.2f\n"
                + "Calificacion 3: %.2f\n"
                + "Promedio: %.2f\n"
                + "----------------------------------------------------------\n",
                nombre, calif1, calif2, calif3,
                prom);
        return cadena;
    }
}
