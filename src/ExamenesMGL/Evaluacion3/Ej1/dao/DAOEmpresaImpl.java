/*
package ExamenesMGL.Evaluacion3.Ej1.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAOEmpresaImpl implements DAOEmpresaInf {
    @Override
    public String obtenerRepresentante(String NIF) {
        String nombre = "";
        try {
            PreparedStatement ps = conexion.prepareStatement("SELECT * FROM BDPRUEBA1.empresas WHERE NIF=?");
            ps.setString(1, NIF);
            ResultSet nombreAux = ps.executeQuery();
            if (nombreAux.next()) {
                nombre = nombreAux.getString("representante");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return nombre;
        }
        return nombre;
    }

    @Override
    public int obtenerNumAlumnosAcogidos(String NIF) {
        int numero = 0;
        try {
            PreparedStatement ps = conexion.prepareStatement("SELECT * FROM BDPRUEBA1.empresas WHERE NIF=?");
            ps.setString(1, NIF);
            ResultSet numeroAux = ps.executeQuery();
            if (numeroAux.next()) {
                numero = Integer.parseInt(numeroAux.getString("numAlumnosAcogidos"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return numero;
        }
        return numero;
    }
}*/
