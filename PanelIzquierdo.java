import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class PanelIzquierdo extends JPanel {
    private Color cTopIzq;
    private Color cLabelIzq;
    private Color cHDDIzq;
    private JPanel izq1;
    private JPanel izq2;
    private JList<PanelDisco> izq3;
    private JPanel izq5;
    private JList<PanelDisco> izq4;
    private JPanel izq6;
    private JLabel volntfs;
    private JLabel otrosvol;
    private JButton inicio;
    private DefaultListModel modelNTFS;
    private DefaultListModel modelOther;

    private JPanel panelCaduca;
    private JPanel botonesCaduca;
    private JLabel caduca;

    private JButton activar;
    private JButton comprar;

    private PanelDisco disco1 = (new PanelDisco("hdd.png", "INTERNOWIN", "200,98 GB",
            true,"/dev/disk2s2","Sistema de archivos de Windows NT",
            "973,85 GB","3,03 TB"));

    private PanelDisco disco2 = new PanelDisco("hdd.png", "EDU4TERAS", "4 TB");

    private PanelDisco disco3 = new PanelDisco("hdd.png", "INTERNOMAC", "799 GB");

    private PanelDisco disco4 = new PanelDisco("hdd.png", "EXTERNO", "499,25 GB");

    public PanelIzquierdo() {
        modelNTFS = new DefaultListModel();
        modelOther = new DefaultListModel();
        cTopIzq = new Color(49, 50, 77);
        cLabelIzq = new Color(39, 36, 47);
        cHDDIzq = new Color(47, 42, 56);
        izq1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        izq2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        izq3 = new JList(modelNTFS);
        izq4 = new JList(modelOther);
        izq5 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        izq6 = new JPanel();
        volntfs = new JLabel("Volúmenes de NTFS");
        otrosvol = new JLabel("Otros volúmenes");
        inicio = new JButton("Iniciar Sesión", new ImageIcon("imagenes/user.png"));
        panelCaduca = new JPanel();
        caduca = new JLabel("Caduca dentro de 10 días.");
        botonesCaduca = new JPanel();
        activar = new JButton();
        comprar = new JButton();

        caduca.setForeground(Color.CYAN);

        botonesCaduca.setBackground(cLabelIzq);

        activar.setPreferredSize(new Dimension(120,20));
        activar.setText("Activar...");
        activar.setBackground(Color.cyan);

        comprar.setPreferredSize(new Dimension(120,20));
        comprar.setText("Comprar...");
        comprar.setBackground(new Color(0, 233, 156));


        activar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new Activar();
            }
        });

        inicio.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URL("https://my.paragon-software.com/#/login").toURI());
                } catch (URISyntaxException | IOException l) {
                    System.err.println(l.getMessage());
                }
            }
        });

        comprar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URL("https://www.paragon-software.com/es/macbox-offer-site/").toURI());
                } catch (URISyntaxException | IOException l) {
                    System.err.println(l.getMessage());
                }
            }
        });

        izq4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                izq3.removeSelectionInterval(0, 1);
            }
        });

        izq3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                izq4.removeSelectionInterval(0, 1);
            }
        });

        izq3.setFixedCellWidth(Integer.MAX_VALUE);
        izq3.setFixedCellHeight(50);
        izq3.setCellRenderer(new DiscoRender());
        izq3.setSelectionBackground(new Color(0, 94, 255));

        izq4.setFixedCellWidth(Integer.MAX_VALUE);
        izq4.setFixedCellHeight(50);
        izq4.setCellRenderer(new DiscoRender());
        izq4.setSelectionBackground(new Color(0, 94, 255));


        modelNTFS.addElement(disco1);
        modelNTFS.addElement(disco2);
        modelOther.addElement(disco3);
        modelOther.addElement(disco4);


        inicio.setBorderPainted(false);
        inicio.setBackground(null);
        inicio.setPreferredSize(new Dimension(150, 50));
        inicio.setHorizontalTextPosition(SwingConstants.RIGHT);
        inicio.setMargin(new Insets(0, 0, 0, 0));
        inicio.setForeground(Color.WHITE);

        volntfs.setForeground(Color.gray);
        izq2.add(volntfs);
        otrosvol.setForeground(Color.gray);
        izq5.add(otrosvol);

        izq1.setMaximumSize(new Dimension(Integer.MAX_VALUE, 60));
        izq2.setMaximumSize(new Dimension(Integer.MAX_VALUE, 20));
        izq3.setMaximumSize(new Dimension(Integer.MAX_VALUE, 100));
        izq4.setMaximumSize(new Dimension(Integer.MAX_VALUE, 265));
        izq5.setMaximumSize(new Dimension(Integer.MAX_VALUE, 20));
        izq6.setMaximumSize(new Dimension(Integer.MAX_VALUE, 70));

        izq1.setBackground(cTopIzq);

        izq2.setOpaque(true);
        izq2.setBackground(cLabelIzq);
        izq2.setForeground(Color.LIGHT_GRAY);

        izq3.setBackground(cHDDIzq);

        izq4.setBackground(cHDDIzq);

        izq5.setOpaque(true);
        izq5.setBackground(cLabelIzq);
        izq5.setForeground(Color.LIGHT_GRAY);

        izq6.setBackground(cLabelIzq);

        add(izq1);
        add(izq2);
        add(izq3);
        add(izq5);
        add(izq4);
        add(izq6);

        izq6.setLayout(new BoxLayout(izq6, BoxLayout.Y_AXIS));
        botonesCaduca.setLayout(new FlowLayout());
        panelCaduca.setMaximumSize(new Dimension(Integer.MAX_VALUE, 20));
        panelCaduca.setBackground(cLabelIzq);
        panelCaduca.add(Box.createVerticalStrut(5));
        panelCaduca.add(caduca);
        izq6.add(panelCaduca);
        izq6.add(botonesCaduca);
        botonesCaduca.add(activar);
        botonesCaduca.add(comprar);

        izq1.add(inicio);

    }

    public JPanel getIzq6() {
        return izq6;
    }

    public void setIzq6(JPanel izq6) {
        this.izq6 = izq6;
    }

    public JLabel getCaduca() {
        return caduca;
    }

    public PanelDisco getDisco1() {
        return disco1;
    }

    public PanelDisco getDisco2() {
        return disco2;
    }

    public PanelDisco getDisco3() {
        return disco3;
    }

    public PanelDisco getDisco4() {
        return disco4;
    }
}
