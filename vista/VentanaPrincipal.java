package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    public PanelResultados miPanelResultados;
    public PanelEntradaDatos miPanelEntradaDatos;

    public VentanaPrincipal()
    {
        //Definición del contenedor de la ventana
        setLayout(null);
        
        
        //Creación y adición del PanelEntradaDatos
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,560,190);
        add(miPanelEntradaDatos);

        //Creación y adición del PanelResultados
        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(10, 210, 560, 190);
        add(miPanelResultados);


        //Caracteristicas de la ventana
        setTitle("Plan Telefónico");
        setSize(600,450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
}
