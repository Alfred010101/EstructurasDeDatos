
package edd.segparcial;

import java.util.Date;

/**
 *
 * @author Alfred
 */
public class Archivo
{
    private String nombre;
    private String creador;
    private double peso;
    private boolean tipo;
    private Date fecha;

    public Archivo(String nombre, String creador, double peso, boolean tipo, Date fecha)
    {
        this.nombre = nombre;
        this.creador = creador;
        this.peso = peso;
        this.tipo = tipo;
        this.fecha = fecha;
    }

    /**
     * @return the nombre
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * @return the creador
     */
    public String getCreador()
    {
        return creador;
    }

    /**
     * @param creador the creador to set
     */
    public void setCreador(String creador)
    {
        this.creador = creador;
    }

    /**
     * @return the peso
     */
    public double getPeso()
    {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso)
    {
        this.peso = peso;
    }

    /**
     * @return the tipo
     */
    public boolean isTipo()
    {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(boolean tipo)
    {
        this.tipo = tipo;
    }

    /**
     * @return the fecha
     */
    public Date getFecha()
    {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha)
    {
        this.fecha = fecha;
    }
    
    
}
