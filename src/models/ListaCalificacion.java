package models;

public class ListaCalificacion {

    private float Calificacion1;

    private float Calificacion2;

    private float Calificacion3;

    public float promedio(){
        float promedio;
        promedio = (Calificacion1 + Calificacion2 + Calificacion3)/3;
        return promedio;

    }

    public float getCalificacion1() {
        return Calificacion1;
    }

    public boolean setCalificacion1(float calificacion1) {
        Calificacion1 = calificacion1;
        return false;
    }

    public float getCalificacion2() {
        return Calificacion2;
    }

    public boolean setCalificacion2(float calificacion2) {
        Calificacion2 = calificacion2;
        return false;
    }

    public float getCalificacion3() {
        return Calificacion3;
    }

    public boolean setCalificacion3(float calificacion3) {
        Calificacion3 = calificacion3;
        return false;
    }


    @Override
    public String toString() {
        return "Calificacion{" +
                "Calificacion1=" + Calificacion1 +
                ", Calificacion2=" + Calificacion2 +
                ", Calificacion3=" + Calificacion3 +
                '}';
    }



}
