
package com.example.TallerSemana3.model;

public class Empleado {
    private String nombre;
    private double sueldoBase;
    private int horasExtra; 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }
      // Métodos para calcular
    public double calcularTarifaPorHora() {
        return sueldoBase / 160;
    }

    public double calcularSueldoTotal() {
        return sueldoBase + (horasExtra * 8);
    }
}
