package cine.simulacion;
/**
 * Clase en donde se crean los atributos y metodos del cliente del cinema
 * @author EdgarAndresKrejciBautista,Michael Leandro Cardenas
 */
public class Cliente {
    private String nombre;
    private int edad;
    private String genero;
    private int taquilla=5000;
    /**
     * Condtrucctor en el cual se instancian los atributos cuando se instancia un objeto de esta clase
     * @param nombre
     * @param edad
     * @param genero 
     */
    public Cliente(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
    /**
     * METODO QUE RETORNA LA EDAD DEL USUARIO PARA DETERMINAR SI POSEE DESCUENTO
     * @return 
     */
    public int getEdad() {
        return edad;
    }
    /**
     * METODO QUE ME PERMITE CAMBIAR EL VALOR DE LA EDAD SI ES NECESARIO
     * @param edad 
     */
    public void setEdad(byte edad) {
        this.edad = edad;
    }
    /**
     * METODO QUE ME PERMITE OBTENER EL NOMBRE EL USUARIO
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * METODO QUE ME PERMITE CAMBIAR EL NOMBRE DEL USUARIO EN CASO DE SER NECESARIO
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * METODO QUE ME RETORNA EL GENERO DEL CLIENTE
     * @return 
     */
    public String getGenero() {
        return genero;
    }
    /**
     * METODO QUE ME RETORNA LA TAQUILLA QUE DEBE PAGAR EL CLIENTE INCLUYENDO SU DESCUENTO EN CASO DE SER MENOR DE EDAD
     * @return 
     */
    public int getTaquilla() {
        if ((edad<18)&&(edad>0)){
            taquilla=taquilla-2000;
        }
        return taquilla;
    }
    /**
     *METODO QUE ME PERMITE MODIFICAR EL VALOR DE LA TAQUILLA EN CASO DE SER NECESARIO 
     * @param taquilla 
     */
    public void setTaquilla(int taquilla) {
        this.taquilla = taquilla;
    }
    /**
     * METODO QUE ME PERMITE DEFINIR EL GENREO DEL USUARIO
     * @param genero 
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
}

