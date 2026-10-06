package ExamenesMGL.Evaluacion3.Ej2;

import javax.swing.*;
import java.awt.*;

public class Ej2 extends JFrame {
    int x, y = 0;
    JLabel posicion = new JLabel("Posicion: x:" + x + ", y:" + y);

    public Ej2() {
        super("Ejercicio Entorno grafico");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout(8, 8));
        JButton Barriba = new JButton("Arriba");
        JButton Babajo = new JButton("Abajo");
        JButton Bizquierda = new JButton("Izquierda");
        JButton Bderecha = new JButton("Derecha");
        Barriba.addActionListener(e -> manejarBoton("Arriba"));
        Babajo.addActionListener(e -> manejarBoton("Abajo"));
        Bizquierda.addActionListener(e -> manejarBoton("Izquierda"));
        Bderecha.addActionListener(e -> manejarBoton("Derecha"));
        getContentPane().add(Barriba, BorderLayout.NORTH);
        getContentPane().add(Babajo, BorderLayout.SOUTH);
        getContentPane().add(Bizquierda, BorderLayout.WEST);
        getContentPane().add(Bderecha, BorderLayout.EAST);
        getContentPane().add(posicion, BorderLayout.CENTER);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Ej2::new); // se puede poner (() -> new CalculadoraBinaria())
    }

    private void manejarBoton(String texto) {
        try {
            switch (texto) {
                case "Arriba" -> {
                    y = y + 1;
                    if (y > 10) {
                        y = 0;
                    }
                    posicion.setText("Posicion: x:" + x + ", y:" + y);
                    pack();
                }
                case "Abajo" -> {
                    y = y - 1;
                    if (y < 0) {
                        y = 10;
                    }
                    posicion.setText("Posicion: x:" + x + ", y:" + y);
                    pack();
                }
                case "Derecha" -> {
                    x = x + 1;
                    if (x > 10) {
                        x = 0;
                    }
                    posicion.setText("Posicion: x:" + x + ", y:" + y);
                    pack();
                }
                case "Izquierda" -> {
                    {
                        x = x - 1;
                        if (x < 0) {
                            x = 10;
                        }
                    }
                    posicion.setText("Posicion: x:" + x + ", y:" + y);
                    pack();
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}