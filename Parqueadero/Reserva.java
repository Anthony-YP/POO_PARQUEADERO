import java.time.LocalTime;

public class Reserva {
    private String id;
    private LocalTime tiempoInicio;
    private LocalTime tiempoFinal;

    // Constructor
    public Reserva(String id, LocalTime tiempoInicio, LocalTime tiempoFinal) {
        this.id = id;
        this.tiempoInicio = tiempoInicio;
        this.tiempoFinal = tiempoFinal;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalTime getTiempoInicio() {
        return tiempoInicio;
    }

    public void setTiempoInicio(LocalTime tiempoInicio) {
        this.tiempoInicio = tiempoInicio;
    }

    public LocalTime getTiempoFinal() {
        return tiempoFinal;
    }

    public void setTiempoFinal(LocalTime tiempoFinal) {
        this.tiempoFinal = tiempoFinal;
    }
}
