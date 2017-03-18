package cine.simulacion;
public class Cliente {
    private String nombre;
    private int edad;
    private String genero;
    private byte ubicacion[][];
    private int taquilla=5000;
    
    public Cliente(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
    public int getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public int getTaquilla() {
        return taquilla;
    }

    public void setTaquilla(int taquilla) {
        this.taquilla = taquilla;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}

