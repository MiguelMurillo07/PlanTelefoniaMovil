package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Plan;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener
{

    private Plan miPlan;
    private VentanaPrincipal miVentana;

    public Controlador(VentanaPrincipal pMiVentana, Plan pMiPlan) 
    {
        this.miPlan = pMiPlan;
        this.miVentana = pMiVentana;
        this.miVentana.miPanelEntradaDatos.agregarOyentesBotones(this);
        this.miVentana.miPanelResultados.mostrarResultado("Bienvenido, por favor llena los datos de las casillas de arriba para continuar.");
    }
    
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        String cmd  = ae.getActionCommand();

        if (cmd.equals("calcular"))
        {
            int numero = Integer.parseInt(miVentana.miPanelEntradaDatos.getNumero());
            String operador = miVentana.miPanelEntradaDatos.getOperador();
            int minutos = Integer.parseInt(miVentana.miPanelEntradaDatos.getCantidadMinutos());
            double valorMinuto = Double.parseDouble(miVentana.miPanelEntradaDatos.getValorMinuto());
            Plan planTlf = new Plan(numero, operador, minutos, valorMinuto);
            planTlf.obtenerTotal(minutos, valorMinuto);

            miVentana.miPanelResultados.mostrarResultado("Información detallada del Plan Telefónico: \n\nNúmero del plan: "+numero+"\nOperador elegido: "+operador+"\nTotal de minutos:"+minutos+"\nValor de cada minuto: "+valorMinuto+"\n\nCosto total a pagar por el Plan telefónico es: "+planTlf.getObtenerTotal());
        }

        if(cmd.equals("salir"))
        {
            System.exit(0);
        }


        if (cmd.equals("borrar"))
        {
            this.miVentana.miPanelEntradaDatos.borrar();
            this.miVentana.miPanelResultados.borrar();
            this.miVentana.miPanelResultados.mostrarResultado("Los datos han sido parcialmente borrados.");
        }
    }
}
