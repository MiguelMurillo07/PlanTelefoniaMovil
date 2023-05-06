package vista;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    private JLabel lbOperador;
    private JComboBox cbOperador;

    public PanelEntradaDatos()
    {
        setLayout(null);

        lbOperador = new JLabel("Operador");
        lbOperador.setBounds(90,65,90,30);
        this.add(lbOperador);
        
        cbOperador = new JComboBox();
        cbOperador.setBounds(150,70,300,20);
        this.add(cbOperador);

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }


}