package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel
{
    private JTextArea taResultado;
    private JScrollPane spResultado;

    public PanelResultados()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion del area de texto
        taResultado = new JTextArea();
        spResultado = new JScrollPane(taResultado);
        spResultado.setBounds(10,20, 540, 160);
        add(spResultado);
       
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Resultados");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }


    public void mostrarResultado(String msj)
    {
        taResultado.setText(msj);
    }

    public void borrar()
    {
        taResultado.setText("");
        
    }
}
