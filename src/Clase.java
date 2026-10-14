public abstract class Clase {

    // atributos
    protected String nombre;
    protected int cupoMaximo;
    protected int duracion;

    // constructor sin parametros
    public Clase() {
    }

    // constructor con parametros
    public Clase(String nombre, int cupoMaximo, int duracion) {
        this.setNombre(nombre);
        this.setCupoMaximo(cupoMaximo);
        this.setDuracion(duracion);
    }

    // getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("Error, el nombre ni puede estar vacío ni ser nulo.");
        }
        this.nombre = nombre;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(int cupoMaximo) {
        if (cupoMaximo < 1 || cupoMaximo > 30) {
            throw new IllegalArgumentException("Error, el cupo debe estar entre 1 y 30.");
        }
        this.cupoMaximo = cupoMaximo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        if (duracion <= 0) {
            throw new IllegalArgumentException("Error, la duración debe ser mayor que cero.");
        }
        this.duracion = duracion;
    }

    // tostring
    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Cupo: " + cupoMaximo;
    }

    // metodo funcional
    public abstract double calcularCosto();

    // metodo obtener detalle
    public abstract String obtenerDetalle();

}
