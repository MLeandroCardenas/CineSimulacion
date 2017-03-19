package cine.simulacion;
public class Pelicula {
    private String genero;
    private String año;
    private String sipnosis;
    private String titulo;
    private String duracion;

    public Pelicula(String genero, String año, String sipnosis, String titulo, String duracion) {
        this.genero = genero;
        this.año = año;
        this.sipnosis = sipnosis;
        this.titulo = titulo;
        this.duracion = duracion;
    }
    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getSipnosis() {
        return sipnosis;
    }

    public void setSipnosis(String sipnosis) {
        this.sipnosis = sipnosis;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    
}
