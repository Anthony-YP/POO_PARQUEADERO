public class Piso {
    private int numeroPiso;
    private int capacidadVehiculos;

    // Constructor
    public Piso(int numeroPiso, int capacidadVehiculos) {
        this.numeroPiso = numeroPiso;
        this.capacidadVehiculos = capacidadVehiculos;
    }

    // Getters y Setters
    public int getNumeroPiso() {
        return numeroPiso;
    }

    public void setNumeroPiso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
    }

    public int getCapacidadVehiculos() {
        return capacidadVehiculos;
    }

    public void setCapacidadVehiculos(int capacidadVehiculos) {
        this.capacidadVehiculos = capacidadVehiculos;
    }
}
