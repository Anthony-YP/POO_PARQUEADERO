import java.time.LocalTime;

public class Ticket {
    private String nombreUsuario;
    private String placaVehiculo;
    private String tipoVehiculo;
    private LocalTime horaEntrada;
    private LocalTime horaSalida;
    private float valor;

    // Constructor
    public Ticket(String nombreUsuario, String placaVehiculo, String tipoVehiculo, 
                  LocalTime horaEntrada, LocalTime horaSalida, float valor) {
        this.nombreUsuario = nombreUsuario;
        this.placaVehiculo = placaVehiculo;
        this.tipoVehiculo = tipoVehiculo;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.valor = valor;
    }

    // Método para imprimir el ticket
    public void imprimir() {
        System.out.println("==== Ticket ====");
        System.out.println("Usuario: " + nombreUsuario);
        System.out.println("Vehículo: " + tipoVehiculo + " - " + placaVehiculo);
        System.out.println("Hora Entrada: " + horaEntrada);
        System.out.println("Hora Salida: " + horaSalida);
        System.out.println("Valor: " + valor);
    }
}
