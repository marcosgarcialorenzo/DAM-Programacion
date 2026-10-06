/*package ExamenesMGL.Evaluacion3.Ej1.ui;

import ExamenesMGL.Evaluacion3.Ej1.dao.DAOEmpresaImpl;
import ExamenesMGL.Evaluacion3.Ej1.model.Alumno;
import ExamenesMGL.Evaluacion3.Ej1.model.Grupo;
import ExamenesMGL.Evaluacion3.Ej1.model.IES;
import ExamenesMGL.Evaluacion3.Ej1.service.PracticasServicio;

import java.util.ArrayList;
import java.util.Scanner;

public class PracticasUI {
    private PracticasServicio servicio;
    private Scanner sc = new Scanner(System.in);

    public PracticasUI(PracticasServicio servicio) {
        this.servicio = servicio;
    }

    public void crearRelacion() {
        PracticasServicio Ps = new PracticasServicio();
        try {
            System.out.print("NIF Empresa: ");
            String nif = sc.nextLine();
            System.out.print("DNI de alumnos (separados por coma): ");
            String[] dnis = sc.nextLine().split(",");
            System.out.print("Día inicio (1-365): ");
            int inicio = Integer.parseInt(sc.nextLine());
            System.out.print("Día fin (1-365): ");
            int fin = Integer.parseInt(sc.nextLine());
            Grupo g = new Grupo();
            ArrayList<Alumno> alumnos = g.buscarAlumnos(dnis);
            for (int i = 0; i< alumnos.toArray().length; i++) {
                if(alumnos.promocionan) {Ps.crearRelacion(nif,dnis,inicio, fin);}
            }



        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void mostrarNumRelacionesEmpresa(String nif) {
        DAOEmpresaImpl dao = new DAOEmpresaImpl();
        System.out.println(dao.obtenerNumAlumnosAcogidos(nif));

    }

    private void menu() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("1. Crear nueva relación de prácticas");
            System.out.println("2. Consultar relaciones de una empresa");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            try {
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion) {
                    case 1 -> crearRelacion();
                    case 2 -> {
                        System.out.print("Introduzca el NIF de la empresa: ");
                        String nif = sc.nextLine();
                        mostrarNumRelacionesEmpresa(nif);
                    }
                    case 0 -> System.out.println("Cerrando aplicación...");
                    default -> System.out.println("Opción no válida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Por favor, introduzca un número válido.");
            } catch (Exception e) {
                System.out.println("Ocurrió un error inesperado: " + e.getMessage());
            }
        } while (opcion != 0);
        sc.close();
    }

    public static void main(String[] args) {
        IES miIES = new IES();
        // Inyección de dependencias (Estructura UI-Servicio-DAO)
        PracticasServicio servicio = new PracticasServicio(miIES);
        PracticasUI ui = new PracticasUI(servicio);
        ui.menu();
    }
}*/