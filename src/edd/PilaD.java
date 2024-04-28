package edd;

/**
 *
 * @author Alfred
 */

public class PilaD
{
    private Nodo tope;

    /**
     * @return the tope
     */
    public Nodo getTope()
    {
        return tope;
    }

    /**
     * @param tope the tope to set
     */
    public void setTope(Nodo tope)
    {
        this.tope = tope;
    }
    
    public void inertar(Nodo n)
    {
        if (n != null)
        {
            tope.setSiguiente(n);
            tope = n;
        }else
        {
            System.out.println("Pila llena");
        }
    }
    
    public Nodo elimar()
    {
        Nodo n = null;
        if (tope != null)
        {
            //            if (this.tope == null)
//            {
//                this.tope = nodo;
//            }else
//            {
                n.setSiguiente(this.tope);
                this.tope = n;
//            }
        }else
        {
            System.out.println("Pila vacia");
        }
        return n;
    }
}
