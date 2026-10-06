package K.K0;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data //getters, setters, equals, hashCode y toString
@AllArgsConstructor //constructor con todos los argumentos en orden de aparición
public class Persona {
    String nombre;
    int edad;

    @Override
    public String toString() {
        return nombre + ", " + edad;
    }
}