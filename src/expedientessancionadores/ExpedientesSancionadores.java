package expedientessancionadores;

import java.time.LocalDateTime;

public class ExpedientesSancionadores {

    public static void main(String[] args) {
        Notificacion n = new Notificacion();
        
        Denuncia d =   new Denuncia(LocalDateTime.now(),696969,"Lleva faro roto",200);
        System.out.print(d.toString());
    }

}
