package modelo;

public class Plan 
{
    //Atributos
    private int numeroCelular;
    private String operador;
    private int cantidadMinutos;
    private double valorMinuto;

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
        return this.numeroCelular;
    }

    public String getOperador()
    {
        return this.operador;
    }

    public int getCantidadMinutos()
    {
        return this.cantidadMinutos;
    }

    public double getValorMinuto()
    {
        return this.valorMinuto;
    }  

    public double calcularValorPlan()
    {
        return this.cantidadMinutos * this.valorMinuto;
    }

    public double calcularValorPlan(int pCantidadMinutos)
    {
        return pCantidadMinutos * this.valorMinuto;
    }

    public double calcularValorPlan(double pValorMinuto)
    {
        return this.cantidadMinutos * pValorMinuto;
    }

    public double calcularValorPlan(int pCantidadMinutos, double pValorMinuto)
    {
        return pCantidadMinutos * pValorMinuto;
    }


}
