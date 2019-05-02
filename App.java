import javax.swing.*;
import java.awt.*;

public class App extends JFrame {
    private PanelIzquierdo izq;
    private PanelDerecho der;

    public App() {

        // IZQ
        izq = new PanelIzquierdo();
        izq.setLayout(new BoxLayout(izq, BoxLayout.Y_AXIS));
        izq.setPreferredSize(new Dimension(290, Integer.MAX_VALUE));
        izq.setBackground(Color.yellow);

        // DER
        der = new PanelDerecho();

        add(BorderLayout.WEST, izq);
        add(BorderLayout.EAST, der);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(840, 555);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
