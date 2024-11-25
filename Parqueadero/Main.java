import java.time.LocalTime;
public class Main {
    public static void main(String[] args) {
        // Creamos un parqueadero
        Parqueadero parqueadero = new Parqueadero("Parqueadero Central", "Calle Principal, Ciudad de Loja");

        // Creamos un vehículo
        Carro carro = new Carro("LBB-3456", "Chevrolet", "Mustang", "Amarillo");

        // Creamos un cliente regular
        ClienteRegular cliente1 = new ClienteRegular("Anthony Yaguana", "Cliente Regular", "Efectivo");

        // Creamos una tarifa
        Tarifa tarifa = new Tarifa("Carro", "Carro", LocalTime.of(8, 0), LocalTime.of(20, 0), 20.0f);

        // Creamos la reserva
        Reserva reserva = new Reserva("0001", LocalTime.of(10, 0), LocalTime.of(12, 0));

        // Simulamos la entrada y salida del vehículo
        LocalTime horaEntrada = LocalTime.of(9, 30);
        LocalTime horaSalida = LocalTime.of(11, 45);
        float valor = tarifa.cobro() * 1; // Cálculo valor a pagar (1 hora)

        // Creamos el ticket
        Ticket ticket = new Ticket(cliente1.getNombre(), carro.getPlaca(), "Carro", horaEntrada, horaSalida, valor);

        // Imprimimos la  información
        System.out.println("--- Información del Parqueadero ---");
        System.out.println("Parqueadero: " + parqueadero.getNombre() + " | Ubicación: " + parqueadero.getUbicacion());

        System.out.println("\n--- Información del Vehículo ---");
        System.out.println("Placa=> " + carro.getPlaca() + " | Modelo=> " + carro.getModelo() + " | Color=> " + carro.getColor());

        System.out.println("\n--- Información del Cliente ---");
        System.out.println("Nombre: " + cliente1.getNombre() + " | Tipo: " + cliente1.getTipo() + " | Método de Pago: " + cliente1.getMetodoPago());

        System.out.println("\n--- Detalles del Ticket ---");
        ticket.imprimir();

        System.out.println("\n--- Información de la Reserva ----");
        System.out.println("ID: " + reserva.getId() + " | Tiempo Inicio: " + reserva.getTiempoInicio() + " | Tiempo Final: " + reserva.getTiempoFinal());
    }
}
