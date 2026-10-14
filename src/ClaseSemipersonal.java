public class ClaseSemipersonal extends Clase {

    // atributos
    private int cantidadParticipantes;

    // constructor sin parametros
    public ClaseSemipersonal() {
    }

    // constructor con parametros
    public ClaseSemipersonal(String nombre, int cupoMaximo, int duracion, int cantidadParticipantes) {
        super(nombre, cupoMaximo, duracion);
        this.setCantidadParticipantes(cantidadParticipantes);
    }

    // getters y setters
    public int getCantidadParticipantes() {
        return cantidadParticipantes;
    }

    public void setCantidadParticipantes(int cantidadParticipantes) {
        this.cantidadParticipantes = cantidadParticipantes;
    }

    // metodos implementados de superclase
    @Override
    public double calcularCosto() {
        double costoBase = 18000;
        if (cantidadParticipantes > 3) {
            costoBase = costoBase * 1.10;
        }
        return costoBase;
    }

    @Override
    public String obtenerDetalle() {
        return "Nombre: " + nombre + " | Cupo Máximo: " + cupoMaximo + " | Duración: " + duracion + " | Cantidad participantes: " + cantidadParticipantes + " | Costo final: " + Math.round(calcularCosto());
    }
}
