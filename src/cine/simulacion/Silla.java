package cine.simulacion;
/**
 * CLASE ENCARGADA DE CONTENER LA INFORMACION DE LA SILLA Y EL OBJETO USUARIO CON SU RESPECTIVA INFORMACION
 * @author edgar
 */
public class Silla {
    private int numero;
    private Cliente cliente;
    private byte tipo;
    private String estado;
    /**
     * CONSTRUCCTOR QUE RECIBE LA INFORMACION DE LA CLASE SILLA
     * @param numero
     * @param cliente
     * @param tipo
     * @param estado 
     */
    public Silla(int numero, Cliente cliente, byte tipo,String estado) {
        this.numero = numero;
        this.cliente = cliente;
        this.tipo = tipo;
        this.estado=estado;
    }
    /**
     * 
     * @return 
     */
    public int getNumero() {
        return numero;
    }
    /**
     * 
     * @param numero 
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    /**
     * 
     * @param cliente 
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    /**
     * 
     * @param tipo 
     */
    public void setTipo(byte tipo) {
        this.tipo = tipo;
    }
    /**
     * 
     * @return 
     */
    public Cliente getCliente() {
        return cliente;
    }
    /**
     * 
     * @return 
     */
    public byte getTipo() {
        return tipo;
    }
    /**
     * 
     * @return 
     */
    public String getEstado() {
        return estado;
    }
    /**
     * 
     * @param estado 
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
