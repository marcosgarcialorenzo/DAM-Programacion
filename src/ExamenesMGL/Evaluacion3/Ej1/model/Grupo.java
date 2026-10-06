package ExamenesMGL.Evaluacion3.Ej1.model;

import java.util.ArrayList;
import java.util.Map;

public class Grupo {
    Map<String,Alumno> clases;//la clave es el dni

    public ArrayList<Alumno> buscarAlumnos(String[] dnis) {
        ArrayList<Alumno> alumnosLista = new ArrayList<>();
        for (int i = 0; i < clases.size(); i++) {
            for (int j = 0; j < dnis.length; j++) {
                if (clases.equals(dnis[i])) {//mira si el dni es igual al que esta aqui en grupo
                    alumnosLista.add((Alumno) clases); //añade el que coincide el dni a una lista
                }
            }
        }
        return alumnosLista;
    }
}