package vista;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    private JLabel lbOperador;
    private JComboBox cbOperador;
    private JLabel lbNumero;
    private JTextField tfNumero;
    private JLabel lbCantidadMinutos;
    private JTextField tfCantidadMinutos;
    private JLabel lbValorMinuto;
    private JTextField tfValorMinuto;

    public PanelEntradaDatos()
    {
        setLayout(null);

        lbOperador = new JLabel("Operador");
        lbOperador.setBounds(160,65,90,30);
        this.add(lbOperador);
        
        cbOperador = new JComboBox();
        cbOperador.setBounds(230,70,200,20);
        this.add(cbOperador);

        lbNumero = new JLabel("Número");
        lbNumero.setBounds(10,25,90,30);
        this.add(lbNumero);

        tfNumero = new JTextField();
        tfNumero.setBounds(70,30,120,20);
        this.add(tfNumero);

        lbCantidadMinutos = new JLabel("Cantidad de minutos");
        lbCantidadMinutos.setBounds(10,105,150,30);
        this.add(lbCantidadMinutos);

        tfCantidadMinutos = new JTextField();
        tfCantidadMinutos.setBounds(150,110,120,20);
        this.add(tfCantidadMinutos);

        lbValorMinuto = new JLabel("Valor del minuto");
        lbValorMinuto.setBounds(10,145,150,30);
        this.add(lbValorMinuto);

        tfValorMinuto = new JTextField();
        tfValorMinuto.setBounds(150,150,120,20);
        this.add(tfValorMinuto);

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }


}