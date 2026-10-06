// AUTOR MARCOS GRACIA LORENZO
package ExamenesMGL.Evaluacion1.Ej2;

public class Punto {
    double x;
    double y;

    Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double calcularDistancia(Punto p) {
        double distancia = Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
        return distancia;
    }
}