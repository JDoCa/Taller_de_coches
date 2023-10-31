package domenech.jordi.taller.modelo.service;

import domenech.jordi.taller.modelo.domain.Coche;
import domenech.jordi.taller.modelo.repository.CocheRepository;

import java.util.List;

public class CocheService {

    private CocheRepository cocheRepository = new CocheRepository();

    public void agregarCoche(Coche coche) {
        cocheRepository.agregarCoche(coche);
    }

    public List<Coche> obtenerTodosLosCoches() {
        return cocheRepository.obtenerTodosLosCoches();
    }

    public void actualizarCoche(String matricula, String nuevoModelo) {
        cocheRepository.actualizarCoche(matricula, nuevoModelo);
    }

    public void eliminarCoche(String matricula) {
        cocheRepository.eliminarCoche(matricula);
    }
}
