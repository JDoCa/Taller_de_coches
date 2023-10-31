package domenech.jordi.taller.view;

import domenech.jordi.taller.modelo.domain.Coche;

import java.util.List;

public class CocheConsoleView {

    public void mostrarCoches(List<Coche> coches) {
        for (Coche coche : coches) {
            System.out.println("Matrícula: " + coche.getMatricula() + ", Modelo: " + coche.getModelo());
        }
    }
}
