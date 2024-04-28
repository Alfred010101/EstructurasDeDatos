
package edd;

/**
 *
 * @author Alfred
 */
public class ColaDinamica
{
    private Nodo frente = null;
    private Nodo atras = null;

    /**
     * @return the frente
     */
    public Nodo getFrente()
    {
        return frente;
    }

    /**
     * @param frente the frente to set
     */
    public void setFrente(Nodo frente)
    {
        this.frente = frente;
    }

    /**
     * @return the atras
     */
    public Nodo getAtras()
    {
        return atras;
    }

    /**
     * @param atras the atras to set
     */
    public void setAtras(Nodo atras)
    {
        this.atras = atras;
    }

    public void insertar(Nodo nodo)
    {
        if (this.frente == null)
        {
            this.frente = this.atras = nodo;
        } else
        {
            this.atras.setSiguiente(nodo);
            atras = nodo;
        }
    }

    /*public Nodo eliminar()
    {
        if(this.frente == null && this.atras == null)
        {
            System.out.println("Cola vacia");
            return null;
        }else
        {
            if(this.frente == this.atras)
            {
                Nodo nodo = this.frente;
                this.frente = this.atras = null;
                return nodo;
            }else
            {
                Nodo nodo = this.frente;
                this.frente = this.frente.getSiguiente();
                nodo.setSiguiente(null);
                return nodo;
            }
        }
    }*/
    
    public Nodo eliminar()
    {
        if (this.frente == null)
        {
            System.out.println("Cola vacia");
            return null;
        }

        Nodo nodo = this.frente;
        if (this.frente == this.atras)
        {
            this.frente = this.atras = null;
        } else
        {
            this.frente = this.frente.getSiguiente();
            nodo.setSiguiente(null);
        }
        return nodo;
    }
}
