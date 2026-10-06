package E.E3;

public class Persona {
    char estadocivil; //'c'=casado, 's'=soltero, 'v'=viudo
    double sueldo;
    boolean mujer;
    private int antiguedad;  // años que lleva en la empresa

    public Persona(char estadocivil, double sueldo, boolean mujer, int antiguedad) {
        this.estadocivil = estadocivil;
        this.sueldo = sueldo;
        this.mujer = mujer;
        this.antiguedad = antiguedad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }
}