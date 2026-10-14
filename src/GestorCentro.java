import java.util.ArrayList;

public class GestorCentro {

    private ArrayList<Clase> listaClases;

    // constructor lista
    public GestorCentro() {
        listaClases = new ArrayList<>();
    }

    // agregar a lista
    public void agregar(Clase nombreObjeto) {
        listaClases.add(nombreObjeto);
        System.out.println(nombreObjeto.getNombre() + nombreObjeto.getClass().getSimpleName() + "registrado correctamente");
    }

    // getter
    public ArrayList<Clase> getListaClases() {
        return listaClases;
    }

    // buscador
    public ArrayList<Clase> buscador(String nombre) {
        ArrayList<Clase> encontrados = new ArrayList<>();
        for (Clase nombreObjeto : listaClases) {
            if (nombreObjeto.getNombre().equalsIgnoreCase(nombre)) {
                encontrados.add(nombreObjeto);
            }
        }
        return encontrados;
    }

}
