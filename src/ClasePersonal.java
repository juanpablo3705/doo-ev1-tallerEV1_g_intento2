public class ClasePersonal extends Clase implements Cancelable {

    // atributos
    private String nombreInstructor;
    private boolean tieneEvaluacion;
    private boolean tieneCancelacion;

    // constructor sin parametros
    public ClasePersonal() {
    }

    // constructor con parametros
    public ClasePersonal(String nombre, int cupoMaximo, int duracion, String nombreInstructor, boolean tieneEvaluacion) {
        super(nombre, cupoMaximo, duracion);
        this.setNombreInstructor(nombreInstructor);
        this.setTieneEvaluacion(tieneEvaluacion);
        this.setTieneCancelacion(false);
    }

    // getters y setters
    public String getNombreInstructor() {
        return nombreInstructor;
    }

    public void setNombreInstructor(String nombreInstructor) {
        this.nombreInstructor = nombreInstructor;
    }

    public boolean isTieneEvaluacion() {
        return tieneEvaluacion;
    }

    public void setTieneEvaluacion(boolean tieneEvaluacion) {
        this.tieneEvaluacion = tieneEvaluacion;
    }

    public boolean isTieneCancelacion() {
        return tieneCancelacion;
    }

    public void setTieneCancelacion(boolean tieneCancelacion) {
        this.tieneCancelacion = tieneCancelacion;
    }

    // metodos implementados desde superclase
    @Override
    public double calcularCosto() {
        double costoBase = 35000;
        if (!tieneEvaluacion) {
            costoBase = costoBase * 1.20;
        }
        return costoBase;
    }

    @Override
    public String obtenerDetalle() {
        return "Nombre: " + nombre + " | Cupo Máximo: " + cupoMaximo + " | Duración: " + duracion + " | Nombre instructor: " + nombreInstructor + " | Tiene evaluación: " + (tieneEvaluacion ? "Si" : "No") + " | Tiene cancelacion: " + (tieneCancelacion ? "Si" : "No") + " | Costo final: " + Math.round(calcularCosto());
    }

    // metodos desde interfaz
    @Override
    public boolean hayCancelacion() {
        return tieneCancelacion;
    }

    @Override
    public void registrarCancelacion() {
        this.setTieneCancelacion(true);
    }
}
