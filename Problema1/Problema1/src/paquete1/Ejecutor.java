/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import paquete2.Estudiantes;
import java.util.Scanner;

/**
 *
 * @author natsu
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        String nom;
        double c1;
        double c2;
        double c3;
        boolean bandera = true;

        System.out.println("Promedio de 2 materias              [1]");
        System.out.println("Promedio de 3 materias              [2]");
        opcion = entrada.nextInt();
        do {

            switch (opcion) {
                case 1:
                    entrada.nextLine();
                    System.out.println("Ingrese el nombre del estudiante");
                    nom = entrada.nextLine();
                    System.out.println("Ingrese la primera nota");
                    c1 = entrada.nextInt();
                    System.out.println("Ingrese la segunda nota");
                    c2 = entrada.nextInt();
                    Estudiantes estudiante1 = new Estudiantes(nom, c1, c2);
                    estudiante1.establecerPromedio();
                    System.out.printf("%s\n", estudiante1);
                    break;
                case 2:
                    entrada.nextLine();
                    System.out.println("Ingrese el nombre del estudiante");
                    nom = entrada.nextLine();
                    System.out.println("Ingrese la primera nota");
                    c1 = entrada.nextInt();
                    System.out.println("Ingrese la segunda nota");
                    c2 = entrada.nextInt();
                    System.out.println("Ingrese la tercera nota");
                    c3 = entrada.nextInt();
                    Estudiantes estudiante2 = new Estudiantes(nom, c1, c2, c3);
                    estudiante2.establecerPromedio();
                    System.out.printf("%s\n", estudiante2);
                    ;
                    break;
                default:
                    break;
            }
            entrada.nextLine();
            System.out.println("Desea ingresar más estudiantes? Ingrese n para"
                    + " salir");
            String respuesta = entrada.nextLine();
            if (respuesta.equals("n")) {
                bandera = false;
            }
        } while (bandera);
    }

}
