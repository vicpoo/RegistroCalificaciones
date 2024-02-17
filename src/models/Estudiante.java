package models;

public class Estudiante {

    private int Matricula;

    private String Nombre;

    public Estudiante(int matricula, String nombre) {
        Matricula = matricula;
        Nombre = nombre;
    }

    public int getMatricula() {
        return Matricula;
    }

    public String getNombre(){
        return Nombre;
    }

    @Override
    public String toString(){
        return "Estudiante: " +
                "Matricula: " + Matricula +
                "Nombre : " + Nombre + '\''
                ;
    }
}
