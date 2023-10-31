package domenech.jordi.taller.modelo.repository;

import domenech.jordi.taller.modelo.domain.Coche;

import java.util.ArrayList;
import java.util.List;

public class CocheRepository {

    private List<Coche> coches = new ArrayList<>();

    public void agregarCoche(Coche coche) {
        coches.add(coche);
    }

    public List<Coche> obtenerTodosLosCoches() {
        return coches;
    }

    public void actualizarCoche(String matricula, String nuevoModelo) {
        for (Coche coche : coches) {
            if (coche.getMatricula().equals(matricula)) {
                coche.setModelo(nuevoModelo);
                return;
            }
        }
    }

    public void eliminarCoche(String matricula) {
        coches.removeIf(coche -> coche.getMatricula().equals(matricula));
    }
}
