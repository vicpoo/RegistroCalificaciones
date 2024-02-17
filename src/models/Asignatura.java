package models;

import java.util.ArrayList;

public class Asignatura {
    private int Id;

    private String Nombre;

    private ArrayList<Estudiante> estudiantes = new java.util.ArrayList<>();

public boolean addEstudiante(Estudiante estudiante){
boolean status;
status =estudiantes.add(estudiante);
return status;
}

public ArrayList<Estudiante> getEstudiantes(){
return estudiantes;
}
}
