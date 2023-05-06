package ejecutable;

import controlador.Controlador;
import modelo.Plan;
import vista.VentanaPrincipal;

public class Test 
{
    public static void main(String[] args) 
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Plan miPlan = new Plan();
        Controlador miControlador = new Controlador(miVentana, miPlan);
    }
}
