package models;

import java.util.ArrayList;

public class Calificaciones {


    private ArrayList<ListaCalificacion> calificaciones1 = new ArrayList<>();

    public boolean addCalificacion1(ListaCalificacion calificacion){
        boolean status;
        status =calificaciones1.add(calificacion);
        return status;
    }

    private ArrayList<ListaCalificacion> calificacion2 = new ArrayList<>();
    public boolean addCalificacion2(ListaCalificacion calificacion){
        boolean status;
        status = calificacion2.add(calificacion);
        return status;
    }

    private ArrayList<ListaCalificacion> calificacion3 = new ArrayList<>();
    public boolean addCalificacion3(ListaCalificacion calificacion){
        boolean status;
        status = calificacion3.add(calificacion);
        return status;
    }

    public ArrayList<ListaCalificacion> getCalificaciones1() {
        return calificaciones1;
    }

    public ArrayList<ListaCalificacion> getCalificacion2() {
        return calificacion2;
    }

    public ArrayList<ListaCalificacion> getCalificacion3() {
        return calificacion3;
    }
}
