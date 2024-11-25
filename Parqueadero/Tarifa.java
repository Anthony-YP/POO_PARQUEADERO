import java.time.LocalTime;

public class Tarifa {
    private String tipoVehiculo;
    private String tipoTarifa; // Ejemplo: "Diurno", "Nocturno"
    private LocalTime horaEntrada;
    private LocalTime horaSalida;
    private float costoPorHora;

    // Constructor
    public Tarifa(String tipoVehiculo, String tipoTarifa, LocalTime horaEntrada, LocalTime horaSalida, float costoPorHora) {
        this.tipoVehiculo = tipoVehiculo;
        this.tipoTarifa = tipoTarifa;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.costoPorHora = costoPorHora;
    }

    // Getters y Setters
    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getTipoTarifa() {
        return tipoTarifa;
    }

    public void setTipoTarifa(String tipoTarifa) {
        this.tipoTarifa = tipoTarifa;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public float getCostoPorHora() {
        return costoPorHora;
    }

    public void setCostoPorHora(float costoPorHora) {
        this.costoPorHora = costoPorHora;
    }

    // Método para calcular el cobro
    public float cobro() {
        return costoPorHora;
    }
}

