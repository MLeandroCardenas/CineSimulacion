package cine.simulacion;
public class Silla {
    private int numero;
    private Cliente cliente;
    private byte tipo;
    private String estado;
    public Silla(int numero, Cliente cliente, byte tipo,String estado) {
        this.numero = numero;
        this.cliente = cliente;
        this.tipo = tipo;
        this.estado=estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setTipo(byte tipo) {
        this.tipo = tipo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public byte getTipo() {
        return tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
