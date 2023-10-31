package domenech.jordi.taller.controller;

import domenech.jordi.taller.modelo.service.CocheService;
import domenech.jordi.taller.view.CocheConsoleView;
import domenech.jordi.taller.modelo.domain.Coche;

import java.util.List;

public class CocheController {

    private CocheService cocheService = new CocheService();
    private CocheConsoleView cocheConsoleView = new CocheConsoleView();

    public void agregarCoche(String matricula, String modelo) throws CocheInvalidoException {
        if (validarMatricula(matricula) && validarModelo(modelo)) {
            Coche coche = new Coche(matricula, modelo);
            cocheService.agregarCoche(coche);
        } else {
            throw new CocheInvalidoException("Matrícula o modelo no válidos.");
        }
    }

    public List<Coche> obtenerTodosLosCoches() {
        return cocheService.obtenerTodosLosCoches();
    }

    public void actualizarCoche(String matricula, String nuevoModelo) {
        cocheService.actualizarCoche(matricula, nuevoModelo);
    }

    public void eliminarCoche(String matricula) {
        cocheService.eliminarCoche(matricula);
    }

    public void mostrarCoches(List<Coche> coches) {
        cocheConsoleView.mostrarCoches(coches);
    }

    private boolean validarMatricula(String matricula) {
        return matricula.length() == 7;
    }

    // Método para validar el modelo
    private boolean validarModelo(String modelo) {
        String[] palabras = modelo.split(" ");
        return palabras.length == 2;
    }
}
