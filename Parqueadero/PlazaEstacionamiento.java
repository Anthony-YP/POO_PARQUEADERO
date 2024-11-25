public class PlazaEstacionamiento {
    private int numero;
    private boolean ocupado;

    // Constructor
    public PlazaEstacionamiento(int numero, boolean ocupado) {
        this.numero = numero;
        this.ocupado = ocupado;
    }

    // Getters y Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
}
