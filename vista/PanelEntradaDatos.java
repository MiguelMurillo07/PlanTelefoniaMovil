package vista;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.event.ActionListener;

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
    private JButton btCalcular;
    private JButton btBorrar;
    private JButton btSalir;

    public PanelEntradaDatos()
    {
        setLayout(null);

        lbOperador = new JLabel("Operador: ");
        lbOperador.setBounds(40,140,90,30);
        this.add(lbOperador);
        
        cbOperador = new JComboBox<>();
        cbOperador.setBounds(150,145,180,20);
        cbOperador.addItem("Elige un Operador");
        cbOperador.addItem("Tigo");
        cbOperador.addItem("Movistar");
        cbOperador.addItem("Wom");
        cbOperador.addItem("Claro");
        this.add(cbOperador);

        lbNumero = new JLabel("Número: ");
        lbNumero.setBounds(45,25,90,30);
        this.add(lbNumero);

        tfNumero = new JTextField();
        tfNumero.setBounds(150,30,120,20);
        this.add(tfNumero);

        lbCantidadMinutos = new JLabel("Cantidad de minutos: ");
        lbCantidadMinutos.setBounds(20,63,150,30);
        this.add(lbCantidadMinutos);

        tfCantidadMinutos = new JTextField();
        tfCantidadMinutos.setBounds(150,70,120,20);
        this.add(tfCantidadMinutos);

        lbValorMinuto = new JLabel("Valor del minuto: ");
        lbValorMinuto.setBounds(30,100,150,30);
        this.add(lbValorMinuto);

        tfValorMinuto = new JTextField();
        tfValorMinuto.setBounds(150,105,120,20);
        this.add(tfValorMinuto);

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);

        btCalcular = new JButton("Calcular");
        btCalcular.setBounds(420,20,100,25);
        btCalcular.setActionCommand("calcular");
        this.add(btCalcular);

        btBorrar = new JButton("Borrar");
        btBorrar.setBounds(425,76,90,25);
        btBorrar.setActionCommand("borrar");
        this.add(btBorrar);

        btSalir = new JButton("Salir");
        btSalir.setBounds(420,130,100,25);
        btSalir.setActionCommand("salir");
        this.add(btSalir);

    }


    public void agregarOyentesBotones(ActionListener pAl)
    {
        btCalcular.addActionListener(pAl);
        btBorrar.addActionListener(pAl);
        btSalir.addActionListener(pAl);
    }



    public void borrar()
    {
        cbOperador.removeAllItems();
    }

}