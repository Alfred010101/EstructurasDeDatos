
package edd;

/**
 *
 * @author Alfred
 */
public class PilaT <T>
{
    
    private T[] pila;
    private int tope;
    
    public PilaT(T[] arr)
    {
        pila = arr;
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
    public void setPila(T[] pila)
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
    
    public boolean vacia()
    {
        return tope == -1;
    }
    
    public boolean llena()
    {
        return tope == pila.length - 1;
    }
    
    public void insertar(T obj)
    {
        if (llena())
        {
            System.out.println("La Pila se encuentra llena.");            
        }else
        {
            pila[++tope] = obj;
        }
    }
    
    public T eliminar()
    {
        if (vacia())
        {
            System.out.println("La Pila se encuentra vacia.");
            return null;
        }
        return pila[tope--];
    }
}