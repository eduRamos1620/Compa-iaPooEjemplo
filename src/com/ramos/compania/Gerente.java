package com.ramos.compania;

public class Gerente extends Empleado{
    private double presupuesto;

    public Gerente(double presupuesto, int empleadoId, double remuneracion, String numFiscal, String nombre, String apellido, String direccion){
        super(empleadoId, remuneracion, numFiscal,nombre, apellido, direccion);
        this.presupuesto = presupuesto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return "presupuesto=" + presupuesto +
                super.toString();
    }
}
