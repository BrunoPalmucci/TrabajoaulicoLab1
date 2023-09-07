/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.trabajoaulicolab1;

/**
 *
 * @author Bruno
 */
public class Empleado 
{
    private int dni;
    private String nombreApellido;
    private String categoria;
    private double sueldo;
    private Empresa empresa;
    
    public Empleado(int dni, String nombreApellido, String categoria, double sueldo, Empresa empresa)
    {
        this.dni = dni;
        this.nombreApellido = nombreApellido;
        this.categoria = categoria;
        this.sueldo = sueldo;
        this.empresa = empresa;
    }

    public int getDni() 
    {
        return dni;
    }

    public String getNombreApellido() 
    {
        return nombreApellido;
    }

    public String getCategoria() 
    {
        return categoria;
    }

    public double getSueldo() 
    {
        return sueldo;
    }

    public Empresa getEmpresa() 
    {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
    
    
    
    
    
}
