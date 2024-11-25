public class Usuario {
    private String nombre;
    private String tipo;
    private String metodoPago;

    // Constructor
    public Usuario(String nombre, String tipo, String metodoPago) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.metodoPago = metodoPago;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
}