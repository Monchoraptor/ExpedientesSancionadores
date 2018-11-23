package expedientessancionadores;

import java.time.LocalDateTime;

public /*abstract*/ class Denuncia {

    protected LocalDateTime fechayHora;
    protected long idDenuncia;
    protected String causa;
    protected double importe;
    
    public Denuncia(LocalDateTime fechayHora,long idDenuncia,String causa,double importe){
        this.fechayHora=fechayHora;
        this.idDenuncia=idDenuncia;
        this.causa=causa;
        this.importe=importe;
    }
    public void enviarNotificacion(Notificacion n) {

    }

    @Override
    public String toString() {

        return ("La denuncia nº: " + idDenuncia + " del día " + this.dia() + " " + fechayHora.getDayOfMonth() + " de " + this.mes()+" de "+this.fechayHora.getYear()+ ". Motivo: "+causa+" Tiene un importe de "+this.importe+" euros");
    }

    public String dia() {
        String dayString = "";
        switch (fechayHora.getDayOfWeek().getValue()) {
            case 1:
                dayString = "Lunes";
                break;
            case 2:
                dayString = "Martes";
                break;
            case 3:
                dayString = "Miércoles";
                break;
            case 4:
                dayString = "Jueves";
                break;
            case 5:
                dayString = "Viernes";
                break;
            case 6:
                dayString = "Sábado";
                break;
            case 7:
                dayString = "Domingo";
                break;

        }
        return dayString;
    }

    public String mes() {
        String monthString = "";
        switch (fechayHora.getMonthValue()) {
            case 1:
                monthString = "Enero";
                break;
            case 2:
                monthString = "Febrero";
                break;
            case 3:
                monthString = "Marzo";
                break;
            case 4:
                monthString = "Abril";
                break;
            case 5:
                monthString = "Mayo";
                break;
            case 6:
                monthString = "Junio";
                break;
            case 7:
                monthString = "Julio";
                break;
            case 8:
                monthString = "Agosto";
                break;
            case 9:
                monthString = "Septiembre";
                break;
            case 10:
                monthString = "Octubre";
                break;
            case 11:
                monthString = "Noviembre";
                break;
            case 12:
                monthString = "Diciembre";
                break;
            default:
                monthString = "Invalid month";
                break;

        }
        return monthString;
    }
}
