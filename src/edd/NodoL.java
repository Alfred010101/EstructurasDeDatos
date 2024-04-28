package edd;

/**
 *
 * @author Alfred
 * @param <T>
 */

public class NodoL <T>
{    
    private String etiqueta;
    private T obj;
    private NodoL siguiente;
    private NodoL anterior;
    
    public NodoL(String etiqueta, T obj)
    {
        this.etiqueta = etiqueta;
        this.obj = obj;
    }

    /**
     * @return the etiqueta
     */
    public String getEtiqueta()
    {
        return etiqueta;
    }

    /**
     * @param etiqueta the etiqueta to set
     */
    public void setEtiqueta(String etiqueta)
    {
        this.etiqueta = etiqueta;
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
     * @return the siguiente
     */
    public NodoL getSiguiente()
    {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoL siguiente)
    {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public NodoL getAnterior()
    {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoL anterior)
    {
        this.anterior = anterior;
    }    
}
