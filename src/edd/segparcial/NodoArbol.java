
package edd.segparcial;

/**
 *
 * @author Alfred
 * @param <T>
 */
public class NodoArbol <T>
{
    private String etq;
    private T obj;
    
    private NodoArbol<T> izq = null;
    private NodoArbol<T> der = null;
    
    public NodoArbol(String etq, T obj)
    {
        this.etq = etq;
        this.obj = obj;
    }

    /**
     * @return the etq
     */
    public String getEtq()
    {
        return etq;
    }

    /**
     * @param etq the etq to set
     */
    public void setEtq(String etq)
    {
        this.etq = etq;
    }

    /**
     * @return the obj
     */
    public T getObj()
    {
        return obj;
    }

    /**
     * @param obj the obj to set
     */
    public void setObj(T obj)
    {
        this.obj = obj;
    }

    /**
     * @return the izq
     */
    public NodoArbol<T> getIzq()
    {
        return izq;
    }

    /**
     * @param izq the izq to set
     */
    public void setIzq(NodoArbol<T> izq)
    {
        this.izq = izq;
    }

    /**
     * @return the der
     */
    public NodoArbol<T> getDer()
    {
        return der;
    }

    /**
     * @param der the der to set
     */
    public void setDer(NodoArbol<T> der)
    {
        this.der = der;
    }
}
