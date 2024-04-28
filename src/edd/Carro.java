
package edd;

/**
 *
 * @author Alfred
 */
public class Carro
{
    private String marca;
    private String placa;
    private int year;
    private double precio;

    public Carro(String marca, String placa, int year, double precio)
    {
        this.marca = marca;
        this.placa = placa;
        this.year = year;
        this.precio = precio;
    }

    /**
     * @return the marca
     */
    public String getMarca()
    {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    /**
     * @return the placa
     */
    public String getPlaca()
    {
        return placa;
    }

    /**
     * @param placa the modelo to set
     */
    public void setPlaca(String placa)
    {
        this.placa = placa;
    }

    /**
     * @return the year
     */
    public int getYear()
    {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year)
    {
        this.year = year;
    }

    /**
     * @return the precio
     */
    public double getPrecio()
    {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio)
    {
        this.precio = precio;
    }

    @Override
    public String toString()
    {
        return "Carro{" + "marca=" + marca + ", placa=" + placa + ", year=" + year + ", precio=" + precio + '}';
    }  
}
