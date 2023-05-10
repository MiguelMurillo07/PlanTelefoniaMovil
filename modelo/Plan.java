package modelo;

public class Plan 
{
    //Atributos
    private int numeroCelular;
    private String operador;
    private int cantidadMinutos;
    private double valorMinuto;
    private double valorPlan;

    public Plan(int pNumeroCelular, String pOperador, int pCantidadMinutos, double pValorMinuto)
    {
        this.numeroCelular = pNumeroCelular;
        this.operador = pOperador;
        this.cantidadMinutos = pCantidadMinutos;
        this.valorMinuto = pValorMinuto;
    }

    public Plan()
    {
        
    }

    public int getNumeroCelular()
    {
        return numeroCelular;
    }

    public String getOperador()
    {
        return operador;
    }

    public int getCantidadMinutos()
    {
        return cantidadMinutos;
    }

    public double getValorMinuto()
    {
        return valorMinuto;
    }  

    public void setNumeroCelular(int pNumeroCelular)
    {
        numeroCelular = pNumeroCelular;
    }

    public void setOperador(String pOperador)
    {
        operador = pOperador;
    }

    public void setCantidadMinutos(int pCantidadMinutos)
    {
        cantidadMinutos = pCantidadMinutos;
    }

    public void setValorMinuto(double pValorMinuto)
    {
        valorMinuto = pValorMinuto;
    }

    


    public double calcularValorPlan(int pCantidadMinutos, double pValorMinuto)
    {
        return pCantidadMinutos * pValorMinuto;
    }

    public void obtenerTotal(int cantidadMinutos, double valorMinuto)
    {
        double total = valorMinuto * cantidadMinutos;
        if (operador.equals("Wom"))
        {
            valorPlan = total*0.5;
        }
        else 
        {
            valorPlan = total;
        }
    }

    public double getObtenerTotal()
    {
        return valorPlan;
    }

}
