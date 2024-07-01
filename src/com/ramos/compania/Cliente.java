package com.ramos.compania;

public class Cliente extends Persona{
    private int clienteId;

    public Cliente(int clienteId, String numFiscal, String nombre, String apellido, String direccion){
        super(numFiscal, nombre, apellido, direccion);
        this.clienteId = clienteId;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }
}
