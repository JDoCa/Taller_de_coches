package domenech.jordi.taller.app;

import domenech.jordi.taller.controller.CocheController;
import domenech.jordi.taller.modelo.domain.Coche;
import domenech.jordi.taller.controller.CocheInvalidoException;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        CocheController cocheController = new CocheController();
        try {
            // Tres altas de coches
            cocheController.agregarCoche("BYD4793", "Chevrolet Cruze");
            cocheController.agregarCoche("GWX8458", "Tesla Model3");
            cocheController.agregarCoche("LYD4756", "Volkswagen Golf");
        } catch (CocheInvalidoException e) {
            System.out.println("Error al añadir coche: " + e.getMessage());
            System.exit(0);
        }

        // Mostrar todos los coches
        System.out.println("Estos son los 3 coches:");
        List<Coche> coches = cocheController.obtenerTodosLosCoches();
        cocheController.mostrarCoches(coches);
        System.out.println();

        // Modificar el segundo coche cambiando el modelo
        System.out.println("Vamos a modificar el modelo de uno de los coches:");
        cocheController.actualizarCoche("GWX8456", "Renault Kadjar");

        // Pedir el segundo coche para ver que el cambio se ha realizado
        Coche cocheModificado = cocheController.obtenerTodosLosCoches().get(1);
        System.out.println("Coche modificado: Matrícula: " + cocheModificado.getMatricula() + ", Cambio de Modelo: " + cocheModificado.getModelo());
        System.out.println("El segundo coche es: " + cocheModificado.getMatricula() + " " + cocheModificado.getModelo());
        System.out.println();

        // Eliminar el primer coche
        System.out.println("Eliminamos el primer coche.");
        cocheController.eliminarCoche("BYD4769");
        System.out.println();

        // Mostrar todos los coches
        System.out.println("Estos son los coches que quedan:");
        coches = cocheController.obtenerTodosLosCoches();
        cocheController.mostrarCoches(coches);
    }
}
