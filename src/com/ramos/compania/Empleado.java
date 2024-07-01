package com.ramos.compania;

public class Empleado extends Persona{
    private double remuneracion;
    private int empleadoId;

    public Empleado(int empleadoId, double remuneracion, String numFiscal, String nombre, String apellido, String direccion){
        super(numFiscal, nombre, apellido, direccion);
        this.empleadoId = empleadoId;
        this.remuneracion = remuneracion;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }
}
