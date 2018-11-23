package expedientessancionadores;

class Expediente {

    private Notificacion notif;
    private char estado;
    private Denuncia den;
    private Vehiculo vehic;
    private Conductor cond;
    private Alegacion aleg;

    public Expediente(Notificacion notif, char estado, Denuncia den, Vehiculo vehic, Conductor cond) {
        this.notif = notif;
        this.estado = estado;
        this.den=den;
        this.vehic=vehic;
        this.cond=cond;
        
    }
}
