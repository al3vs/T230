import javax.swing.*;
import java.awt.*;

public class DiscoRender extends JPanel implements ListCellRenderer<PanelDisco> {
    private JLabel icon;
    private JLabel name;
    private JLabel capacidad;

    public DiscoRender() {
        setLayout(new BorderLayout(5,5));
        icon = new JLabel();
        name = new JLabel();
        capacidad = new JLabel();

        setBackground(new Color(47,42,56));

        JPanel panelText = new JPanel(new GridLayout(0, 1));
        panelText.add(name);
        panelText.add(capacidad);
        add(icon, BorderLayout.WEST);
        add(panelText, BorderLayout.CENTER);
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends PanelDisco> list, PanelDisco disco, int index, boolean isSelected, boolean cellHasFocus) {
        icon.setIcon(new ImageIcon("imagenes/"+disco.getRuta()));
        name.setText(disco.getName());

        icon.setOpaque(true);
        name.setOpaque(true);
        capacidad.setOpaque(true);

        capacidad.setText(disco.getTotalCapacity());
        name.setForeground(Color.WHITE);
        capacidad.setForeground(Color.WHITE);

        if (isSelected) {
            setBackground(list.getSelectionBackground());
            icon.setBackground(list.getSelectionBackground());
            name.setBackground(list.getSelectionBackground());
            capacidad.setBackground(list.getSelectionBackground());
        } else {
            setBackground(list.getBackground());
            icon.setBackground(list.getBackground());
            name.setBackground(list.getBackground());
            capacidad.setBackground(list.getBackground());
        }

        return this;
    }
}