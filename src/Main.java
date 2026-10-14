public class Main {
    public static void main(String[] args) {

        try {

            // objetos
            ClasePersonal clase1 = new ClasePersonal("Yoga",1,60,"Camila Rojas",false);
            ClasePersonal clase2 = new ClasePersonal("Pilates",1,50,"Diego Soto",true);
            ClaseSemipersonal clase3 = new ClaseSemipersonal("Yoga",4,60,5);
            ClaseSemipersonal clase4 = new ClaseSemipersonal("Spinning",3,45,2);

            // aplicar metodo de interfaz
            clase1.registrarCancelacion();

            // registrar objetos
            GestorCentro gestor = new GestorCentro();
            gestor.agregar(clase1);
            gestor.agregar(clase2);
            gestor.agregar(clase3);
            gestor.agregar(clase4);

            // buscar
            for (Clase nombreObjeto : gestor.buscador("Yoga")) {
                System.out.println(nombreObjeto.obtenerDetalle());
            }

            // listar
            for (Clase nombreObjeto : gestor.getListaClases()) {
                System.out.println(nombreObjeto);
            }
        } catch (IllegalArgumentException ex) {
            System.out.println("Error" + ex.getMessage());
        }
    }
}
