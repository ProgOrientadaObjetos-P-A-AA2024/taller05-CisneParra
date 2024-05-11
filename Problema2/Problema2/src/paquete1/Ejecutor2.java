/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import paquete2.Matriculas;
import java.util.Scanner;

/**
 *
 * @author natsu
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String opcion;
        String ced;
        String marca;
        int year;
        double valor;
        String cadenaF = "Informe de matriculas de auto\n"
                + "---------------------------------------------------------\n";
        boolean bandera = true;
        do {
            System.out.println("Ingrese la cedula del propietario");
            ced = entrada.nextLine();
            System.out.println("Ingrese la marca del vehiculo");
            marca = entrada.nextLine();
            System.out.println("Ingrese año de fabricación del vehiculo");
            year = entrada.nextInt();
            System.out.println("Ingrese el valor del vehiculo");
            valor = entrada.nextInt();
            entrada.nextLine();
            Matriculas m = new Matriculas(ced, marca, year, valor);
            m.establecervalorMatricula();
            cadenaF = String.format("%s\n"
                    + "Cedula del propietario: %s\n"
                    + "Marca del vehiculo: %s\n"
                    + "Año de fabricacion: %d\n"
                    + "Valor del vehiculo: %.2f\n"
                    + "Valor total de la matricula: %.2f\n"
                    + "-------------------------------------------------------\n",
                    cadenaF, m.obtenerCedula(), m.obtenerMarca(), m.obtenerYear(),
                    m.obtenervalorAuto(), m.obtenervalorMatricula());
            System.out.println("Ingrese n para"
                    + " salir");
            opcion = entrada.nextLine();
            if (opcion.equals("n")) {
                bandera = false;
            }
        } while (bandera);
        System.out.printf("%s\n", cadenaF);
    }
}
