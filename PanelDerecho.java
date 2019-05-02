import javax.swing.*;
import java.awt.*;

public class PanelDerecho extends JPanel {
    private JPanel topder;
    private JPanel botder;
    private Color cTopDer;
    private Color cBotDer;
    private JButton desmontar;
    private JButton verificar;
    private JButton borrar;
    private Font font;
    private JLabel icono;

    private JPanel info;

    public PanelDerecho() {
        topder = new JPanel();
        botder = new JPanel();
        cTopDer = new Color(255, 255, 255);
        cBotDer = new Color(236, 223, 210);
        desmontar = new JButton("Desmontar", new ImageIcon("imagenes/umount.png"));
        verificar = new JButton("Verificar", new ImageIcon("imagenes/verificar.png"));
        borrar = new JButton("Borrar", new ImageIcon("imagenes/borrar.png"));
        font = new Font("Dialong", Font.BOLD, 10);
        icono = new JLabel();
        info = new JPanel();

        icono.setIcon(new ImageIcon("imagenes/hdd2.png"));

        desmontar.setVerticalTextPosition(SwingConstants.BOTTOM);
        desmontar.setHorizontalTextPosition(SwingConstants.CENTER);
        verificar.setVerticalTextPosition(SwingConstants.BOTTOM);
        verificar.setHorizontalTextPosition(SwingConstants.CENTER);
        borrar.setVerticalTextPosition(SwingConstants.BOTTOM);
        borrar.setHorizontalTextPosition(SwingConstants.CENTER);

        desmontar.setFont(font);
        desmontar.setBorderPainted(false);
        desmontar.setBackground(cTopDer);
        desmontar.setPreferredSize(new Dimension(100, 60));

        verificar.setFont(font);
        verificar.setBorderPainted(false);
        verificar.setBackground(cTopDer);
        verificar.setPreferredSize(new Dimension(100, 60));
        borrar.setFont(font);
        borrar.setBorderPainted(false);
        borrar.setBackground(cTopDer);
        borrar.setPreferredSize(new Dimension(100, 60));

        topder.setPreferredSize(new Dimension(650, 60));
        botder.setPreferredSize(new Dimension(650, 495));

        topder.setBackground(cTopDer);
        botder.setBackground(cBotDer);

        desmontar.setAlignmentX(Component.CENTER_ALIGNMENT);
        verificar.setAlignmentX(Component.CENTER_ALIGNMENT);
        borrar.setAlignmentX(Component.CENTER_ALIGNMENT);

        setLayout(new BorderLayout());

        topder.setLayout(new GridBagLayout());

        add(BorderLayout.NORTH, topder);
        add(BorderLayout.SOUTH, botder);
        // topder.add(Box.createHorizontalStrut(80));

        GridBagConstraints gc = new GridBagConstraints();

        gc.gridx = 0;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.CENTER;
        gc.insets = new Insets(0,100,0,0);
        topder.add(desmontar,gc);

        gc.gridx = 1;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.CENTER;
        gc.insets = new Insets(0,0,0,0);
        topder.add(verificar,gc);

        gc.gridx = 2;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.CENTER;
        gc.insets = new Insets(0,0,0,0);
        topder.add(borrar,gc);

        botder.setLayout(new GridBagLayout());

        gc.gridx = 0;
        gc.gridy = 0;
        icono.setOpaque(true);
        icono.setBackground(Color.blue);
        gc.insets = new Insets(0,90,0,50);
        icono.setPreferredSize(new Dimension(110,130));
        botder.add(icono,gc);

        gc.gridx = 1;
        gc.gridy = 0;
        gc.insets = new Insets(0,0,0,0);
        info.setBackground(Color.yellow);
        info.setPreferredSize(new Dimension(300,130));
        botder.add(info, gc);


        // JLabel pruebaLabel = new JLabel()
        // borrar.setVerticalTextPosition(SwingConstants.BOTTOM);
        // borrar.setHorizontalTextPosition(SwingConstants.CENTER);
        // JPanel prueba = new JPanel();
        // info.setLayout(new BorderLayout());
        // prueba.setBackground(Color.blue);
        // prueba.setPreferredSize(new Dimension(100,100));
        // info.add(new JLabel(new PanelIzquierdo().getDisco1().getName()), BorderLayout.NORTH);
        // info.add(prueba, BorderLayout.SOUTH);


        setVisible(true);
    }
}
