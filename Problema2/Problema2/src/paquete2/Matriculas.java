/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author natsu
 */
public class Matriculas {

    private String marca;
    private double valorMatricula;
    private double valorAuto;
    private String cedula;
    private int year;

    public Matriculas(String c, String m, int a, double v) {
        cedula = c;
        marca = m;
        year = a;
        valorAuto = v;
    }

    public void establecercedula(String ce) {
        cedula = ce;
    }

    public void estableceryear(int a) {
        year = a;
    }

    public void establecermarca(String m) {
        marca = m;
    }

    public void establecervalorAuto(double v) {
        valorAuto = v;
    }

    public void establecervalorMatricula() {
        double calculo = valorAuto * 0.00002;
        valorMatricula = (calculo * year);
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerMarca() {
        return marca;
    }

    public int obtenerYear() {
        return year;
    }

    public double obtenervalorAuto() {
        return valorAuto;
    }

    public double obtenervalorMatricula() {
        return valorMatricula;
    }
}
