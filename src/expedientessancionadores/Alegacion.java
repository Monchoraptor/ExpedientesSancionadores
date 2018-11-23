package expedientessancionadores;

import java.io.File;

class Alegacion {

    private File documento;
    private char estado2;

    public Alegacion(File documento, char estado2) {
        this.documento = documento;
        this.estado2 = estado2;
    }

    public File getDocumento() {
        return this.documento;

    }

    public void setDocumento(File documento) {
        this.documento = documento;
    }

    public char getEstado2() {
        return this.estado2;

    }

    public void setEstado2(char estado2) {
        this.estado2 = estado2;
    }

}
