import java.util.ArrayList;
import java.util.Scanner;
import models.Asignatura;
import models.ListaCalificacion;
import models.Estudiante;
import models.Calificaciones;

public class Main {
    private static Scanner teclado = new Scanner(System.in);
    private static Asignatura poo = new Asignatura();
    private static Calificaciones cal1 = new Calificaciones();
    private static Calificaciones cal2 = new Calificaciones();
    private static Calificaciones cal3 = new Calificaciones();
    private static ListaCalificacion listaCalificacion= new ListaCalificacion();
    public static void main(String[] args) {

        int opcion;
        do {
            System.out.println("¿Usted es alumno o Maestro?");
            System.out.println("1. Docente");
            System.out.println("2. Alumno");
            System.out.println("3. Salir");
            System.out.print("Opcion: ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    int choose;
                    do {
                        System.out.println("1. Dar de alta al alumno");
                        System.out.println("2. Agregar calificaciones");
                        System.out.println("3. Ver todos los alumnos dados de alta");
                        System.out.println("4. Salir");
                        System.out.print("Opcion: ");
                        choose = teclado.nextInt();
                        switch (choose) {
                            case 1:
                                addEstudiante();
                                break;
                            case 2:
                                int eleccion;
                                do {
                                    System.out.println("1. Calificacion del primer corte");
                                    System.out.println("2. Calificacion del segundo corte");
                                    System.out.println("3. Califcion del tercer corte");
                                    System.out.println("4. Salir");
                                    System.out.print("Opcion: ");
                                    eleccion = teclado.nextInt();
                                    switch (eleccion){
                                        case 1:
                                            addCalificacion1();
                                            break;
                                        case 2:
                                            addCalificacion2();
                                            break;
                                        case 3:
                                            addCalificacion3();
                                            break;
                                        case 4:
                                            break;
                                        default:
                                            System.out.println("Ingrese una opcion valida");
                                            break;
                                    }
                                } while (eleccion != 4); break;
                            case 3:
                                verAlumno();
                                break;
                            case 4:
                                break;
                            default: System.out.println("Ingrese una opcion valida");
                                break;
                        }
                    } while (choose != 4); break;
                case 2:
                    int escoger;
                    do {
                        System.out.println("1. Ver calificacion del primer corte");
                        System.out.println("2. Ver calificacion del segundo corte");
                        System.out.println("3. Ver calificacion del tercer corte");
                        System.out.println("4. Ver promedio");
                        System.out.println("5. salir");
                        System.out.print("Opcion: ");
                        escoger = teclado.nextInt();
                        switch (escoger){
                            case 1:
                                verCalificacion1();
                                break;
                            case 2:
                                verCalificacion2();
                                break;
                            case 3:
                                verCalificacion3();
                                break;
                            case 4:
                                verPromedio();
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("Ingrese una opcion valida");
                                break;
                        }
                    }while (escoger != 5); break;
                case 3:
                    break;
                default: System.out.println("Ingrese una opcion valida");
                    break;
            }
        } while (opcion != 3);
    }

    public static void addEstudiante() {
        int Matricula;
        String Nombre;
        System.out.println("ingrese la Matricula:");
        Matricula = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese el nombre completo del alumno: ");
        Nombre = teclado.nextLine();
        Estudiante estudiante = new Estudiante(Matricula, Nombre);
        if (verificarMatricula(Matricula)) {
            if (poo.addEstudiante(estudiante))
                System.out.println("Se agrego exitosamente.");
            else
                System.out.println("Error al intentar agregar. Intentalo de nuevo");
        } else {
            System.out.println("la matrícula ya está registrada. No se puede agregar al estudiante.");
        }
    }

    public static boolean verificarMatricula(int matricula){
        ArrayList<Estudiante>estudiantes = poo.getEstudiantes();
        for (Estudiante estudiante : estudiantes){
            if (estudiante.getMatricula() == matricula){
                return false;
            }
        }
        return true;
    }

    public static void addCalificacion1() {
        ListaCalificacion calificacion = new ListaCalificacion();
        float calificacion1;
        System.out.println("Ingrese la matricula del estudiante deseado: ");
        int matricula = teclado.nextInt();

        Estudiante estudiante = buscarEstudiante(matricula);
        if (estudiante != null) {
            ListaCalificacion listaCalificacion1 = new ListaCalificacion();
            System.out.println("ingrese la calificacion del primer corte: ");
            calificacion1 = teclado.nextFloat();
            listaCalificacion.setCalificacion1(calificacion1);

            if (cal1.addCalificacion1(calificacion)){
                System.out.println("Registro de la calificacion exitosa");
            }else {
                System.out.println("Error al registrar calificacion. Intentelo de nuevo");
            }
        } else {
            System.out.println("Estudiante no encontrado");
        }
    }


    public static void addCalificacion2(){
        float calificacion2;
        System.out.println("Ingrese la matricula del estudiante: ");
        int matricula = teclado.nextInt();

        Estudiante estudiante = buscarEstudiante(matricula);
        if (estudiante != null){
            ListaCalificacion calificacion = new ListaCalificacion();
            System.out.println("Ingrese la calificación del segundo corte: ");
            calificacion2 = teclado.nextFloat();
            calificacion.setCalificacion2(calificacion2);

            if (cal2.addCalificacion2(calificacion, estudiante)) {
                System.out.println("Registro de la calificación exitosa");
            } else {
                System.out.println("Error al registrar calificación. Intenta de nuevo");
            }
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }

    public static void addCalificacion3(){
        float calificacion3;
        System.out.println("Ingrese la matrícula del estudiante: ");
        int matricula = teclado.nextInt();

        Estudiante estudiante = buscarEstudiante(matricula);
        if (estudiante != null) {
            ListaCalificacion calificacion = new ListaCalificacion();
            System.out.println("Ingrese la calificación del tercer corte: ");
            calificacion3 = teclado.nextFloat();
            calificacion.setCalificacion3(calificacion3);

            if (cal3.addCalificacion3(calificacion, estudiante)) {
                System.out.println("Registro de la calificación exitosa");
            } else {
                System.out.println("Error al registrar calificación. Intenta de nuevo");
            }
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }

    private static Estudiante buscarEstudiante(int matricula){
        ArrayList<Estudiante> estudiantes = poo.getEstudiantes();
        for (Estudiante estudiante : estudiantes){
            if (estudiante.getMatricula() == matricula){
                return estudiante;
            }
        }
        return null;
    }

    public static void verCalificacion1(){
        ArrayList<ListaCalificacion> calf1 = cal1.getCalificaciones1();
        for (int i = 0; i <calf1.size() ; i++) {
            System.out.println(calf1.get(i));
        }
    }

    public static void verCalificacion2(){
        ArrayList<ListaCalificacion> calf2 = cal2.getCalificacion2();
        for (int k = 0; k <calf2.size() ; k++){
            System.out.println(calf2.get(k));
        }
    }

    public static void verCalificacion3(){
        ArrayList<ListaCalificacion> calf3 = cal3.getCalificacion3();
        for (int l = 0; l<calf3.size(); l++){
            System.out.println(calf3.get(l));
        }
    }

    public static void verAlumno(){
        ArrayList<Estudiante> lista;
        lista = poo.getEstudiantes();
        for (int m = 0; m<lista.size(); m++)
            System.out.println(lista.get(m));
    }
    public static void verPromedio(){
        ListaCalificacion promedio = new ListaCalificacion();
        float ss = listaCalificacion.promedio();
        System.out.println(ss);
    }
}