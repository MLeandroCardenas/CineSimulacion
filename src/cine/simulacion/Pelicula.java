package cine.simulacion;
/**
 * 
 * @author EdgarAndresKrejci,Michael Leandro Cardenas 
 */
public class Pelicula {
    private String genero;
    private String año;
    private String sipnosis;
    private String titulo;
    private String duracion;
    /**
     * CONSTRUCTOR ENCARGADO DE SETEAR LA INFORMACION DE LA PELICULA
     * @param genero
     * @param año
     * @param sipnosis
     * @param titulo
     * @param duracion 
     */
    public Pelicula(String genero, String año, String sipnosis, String titulo, String duracion) {
        this.genero = genero;
        this.año = año;
        this.sipnosis = sipnosis;
        this.titulo = titulo;
        this.duracion = duracion;
    }
    /**
     * 
     * @return 
     */
    public String getGenero() {
        return genero;
    }
    /**
     * 
     * @param genero 
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
    /**
     * 
     * @return 
     */
    public String getAño() {
        return año;
    }
    /**
     * 
     * @param año 
     */
    public void setAño(String año) {
        this.año = año;
    }
    /**
     * 
     * @return 
     */
    public String getSipnosis() {
        return sipnosis;
    }
    /**
     * 
     * @param sipnosis 
     */
    public void setSipnosis(String sipnosis) {
        this.sipnosis = sipnosis;
    }
    /**
     * 
     * @return 
     */
    public String getTitulo() {
        return titulo;
    }
    /**
     * 
     * @param titulo 
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    /**
     * 
     * @return 
     */
    public String getDuracion() {
        return duracion;
    }
    /**
     * 
     * @param duracion 
     */
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    
}
