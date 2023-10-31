package domenech.jordi.taller.modelo.domain;

public class Coche {

    private String matricula;
    private String letrasMatricula;
    private String numerosMatricula;
    private String modelo;

    public Coche(String matricula, String modelo) {
        this.matricula = matricula;
        this.modelo = modelo;
        separarMatricula();
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public String getLetrasMatricula() {
        return letrasMatricula;
    }

    public String getNumerosMatricula() {
        return numerosMatricula;
    }

    // Método para separar las letras y números de la matrícula
    private void separarMatricula() {
        String[] partesMatricula = matricula.split(" ");
        if (partesMatricula.length == 2) {
            letrasMatricula = partesMatricula[0];
            numerosMatricula = partesMatricula[1];
        } else {
            letrasMatricula = "";
            numerosMatricula = "";
        }
    }

    public void setModelo(String nuevoModelo) {
        this.modelo = nuevoModelo;
    }

}
