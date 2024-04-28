
package edd;

/**
 *
 * @author Alfred
 */
public class Pila implements Machote
{
    
    private Object[] pila;
    private int tope;
    
    public Pila(int n)
    {
        pila = new Object[n];
        tope = -1;
    }

    /**
     * @return the pila
     */
    public Object[] getPila()
    {
        return pila;
    }

    /**
     * @param pila the pila to set
     */
    public void setPila(Object[] pila)
    {
        this.pila = pila;
    }

    /**
     * @return the tope
     */
    public int getTope()
    {
        return tope;
    }

    /**
     * @param tope the tope to set
     */
    public void setTope(int tope)
    {
        this.tope = tope;
    }
    
    @Override
    public boolean vacia()
    {
        return tope == -1;
    }
    
    @Override
    public boolean llena()
    {
        return tope == pila.length - 1;
    }
    
    @Override
    public void insertar(Object obj)
    {
        if (llena())
        {
            System.out.println("La Pila se encuentra llena.");            
        }else
        {
            pila[++tope] = obj;
        }
    }
    
    @Override
    public Object eliminar()
    {
        if (vacia())
        {
            System.out.println("La Pila se encuentra vacia.");
            return null;
        }
        return pila[tope--];
    }
}