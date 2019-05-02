import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Activar extends JFrame {
    private JLabel label;
    private JPanel panel;
    private JTextArea area;
    private JButton enviar;
    private PanelIzquierdo panelIzquierdo;

    public Activar() {
        panel = new JPanel();
        label = new JLabel("Introduzca su clave");
        enviar = new JButton("Activar");
        area = new JTextArea();
        panelIzquierdo = new PanelIzquierdo();

        add(label, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        add(enviar, BorderLayout.SOUTH);
        area.setPreferredSize(new Dimension(200, 50));
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel.add(area);

        enviar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                panelIzquierdo.getCaduca().setText("AA");
            }
        });

        setLocationRelativeTo(null);
        setResizable(false);
        setSize(200,80);
        setVisible(true);
    }
}
