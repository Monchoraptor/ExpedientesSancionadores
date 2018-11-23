package expedientessancionadores;

import java.time.LocalDate;

public class Conductor {

    private String nombre;
    private String direccion;
    private long idCarne;
    private LocalDate fechaObtencion;
    private LocalDate fechaCaducidad;
    private String email;
    private boolean gafas;

    public Conductor(String nombre, String direccion, long idCarne, LocalDate fechaObtencion, LocalDate fechaCaducidad, String email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.idCarne = idCarne;
        this.fechaObtencion = fechaObtencion;
        this.fechaCaducidad = fechaCaducidad;
        this.email = email;
        this.gafas = false;

    }

    public Conductor(String nombre, String direccion, long idCarne, LocalDate fechaObtencion, LocalDate fechaCaducidad, String email, boolean gafas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.idCarne = idCarne;
        this.fechaObtencion = fechaObtencion;
        this.fechaCaducidad = fechaCaducidad;
        this.email = email;
        this.gafas = gafas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getIdCarne() {
        return idCarne;
    }

    public void setIdCarne(long idCarne) {
        this.idCarne = idCarne;
    }

    public LocalDate getFechaObtencion() {
        return fechaObtencion;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getGafas() {
        return gafas;
    }

    public void setGafas(boolean gafas) {
        this.gafas = gafas;
    }
    
    public void presentarAlegacion(Alegacion a){
        
    }
}