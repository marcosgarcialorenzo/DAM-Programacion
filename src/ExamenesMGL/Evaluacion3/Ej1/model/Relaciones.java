package ExamenesMGL.Evaluacion3.Ej1.model;

import java.util.ArrayList;

public class Relaciones {
    String NIF;
    String nombreRepre;
    ArrayList<Alumno> alumnos;
    int FechaInicio;
    int FechaFin;

    public Relaciones(String NIF, String nombreRepre, ArrayList<Alumno> alumnos,int FechaIncio, int FechaFin) {
        this.NIF = NIF;
        this.nombreRepre = nombreRepre;
        this.alumnos = new ArrayList<>();
        this.FechaInicio = FechaIncio;
        this.FechaFin = FechaFin;
    }
}