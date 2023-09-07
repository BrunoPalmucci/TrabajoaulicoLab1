/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.trabajoaulicolab1;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Bruno
 */
public class Empresa 
    {
    private String razonSocial;
    private int cuit;
    private ArrayList<Empleado> empleados;
    
    public Empresa(String razonSocial, int cuit)
    {
        this.razonSocial=razonSocial;
        this.cuit = cuit;
        this.empleados = new ArrayList<Empleado>();
    }
    
    public void agregarEmpleado(Empleado e)
    {
        this.empleados.add(e);
    }

    public String getRazonSocial() 
    {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) 
    {
        this.razonSocial = razonSocial;
    }

    public int getCuit() 
    {
        return cuit;
    }

    public void setCuit(int cuit) 
    {
        this.cuit = cuit;
    }

    public ArrayList<Empleado> getEmpleados() 
    {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) 
    {
        this.empleados = empleados;
    }
    
    public void mostrarEmpleados()
    {
        for (Empleado e:empleados)
        {
            System.out.println(e); 
        }
    }

    @Override
    public String toString() {
        return  razonSocial;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empresa other = (Empresa) obj;
        return Objects.equals(this.razonSocial, other.razonSocial);
    }
    
    
    
    
    }
    

