package models;

public class Estudiante {

    private int Matricula;

    private String Nombre;
    private ListaCalificacion calificaciones;

    public Estudiante(int matricula, String nombre) {
        this.Matricula = matricula;
        this.Nombre = nombre;
        this.calificaciones = new ListaCalificacion();
    }

    public int getMatricula() {
            return Matricula;
    }

    public String getNombre(){
        return Nombre;
    }

    public ListaCalificacion getCalificaciones() {
        return calificaciones;
    }

    @Override
    public String toString(){
        return "Estudiante: " +
          "Matricula: " + Matricula +
           "Nombre : " + Nombre + '\''
                ;
    }



}
