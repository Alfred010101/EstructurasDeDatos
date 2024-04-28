package edd;

/**
 *
 * @author Alfred
 */
public class ListaDoblementeLigada
{
    private NodoL raiz;
    /**
     * @return the raiz
     */
    public NodoL getRaiz()
    {
        return raiz;
    }

    /**
     * @param raiz the raiz to set
     */
    public void setRaiz(NodoL raiz)
    {
        this.raiz = raiz;
    }

    public boolean insertar(NodoL nodo)
    {
        if (nodo == null)
        {
            System.out.println("No se puede insertar un Nodo NULO");
            return false;
        }

        if (raiz == null)
        {
            raiz = nodo;
            return true;
        }

        if (nodo.getEtiqueta().compareTo(raiz.getEtiqueta()) < 0)
        {
            nodo.setSiguiente(raiz);
            raiz.setAnterior(nodo);
            raiz = nodo;
            return true;
        }

        NodoL aux = raiz;
        while (aux.getSiguiente() != null)
        {
            if (nodo.getEtiqueta().compareTo(aux.getSiguiente().getEtiqueta()) < 0)
            {
                nodo.setSiguiente(aux.getSiguiente());
                nodo.setAnterior(aux);
                aux.setSiguiente(nodo);
                nodo.getSiguiente().setAnterior(nodo);
                return true;
            }
            aux = aux.getSiguiente();
        }
       
        aux.setSiguiente(nodo);
        nodo.setAnterior(aux);
        return true;
    }
    
    public NodoL eliminar(String etiqueta)
    {
        if(raiz == null)
        {
            System.out.println("La lista se encuentra vacia");
            return null;
        }
        
        NodoL aux = raiz;
        if(raiz.getEtiqueta().equals(etiqueta))
        {
            raiz = raiz.getSiguiente();
            if(raiz != null)
            {
                raiz.setAnterior(null);
                aux.setSiguiente(null);
            }
            return aux;
        }
        
        while(aux.getSiguiente() != null)
        {
            if(aux.getSiguiente().getEtiqueta().compareTo(etiqueta) > 0)
            {
                System.out.println("No se continua busqueda");
                return null;
            }
            if(aux.getSiguiente().getEtiqueta().equals(etiqueta))
            {
                NodoL nodo = aux.getSiguiente();
                aux.setSiguiente(nodo.getSiguiente()); //null
                if(nodo.getSiguiente() != null)
                {
                    nodo.getSiguiente().setAnterior(aux);    
                }                
                nodo.setSiguiente(null);
                nodo.setAnterior(null);
                return nodo;
            }
            aux = aux.getSiguiente();
        }
        
        System.out.println("No existe el Nodo");
        return null;
    }
    
    public void desplegar()
    {
        NodoL aux = raiz;
        while(aux != null)
        {
            System.out.print(aux.getEtiqueta() + "\t");
            aux = aux.getSiguiente();
        }
        System.out.println("");
    }
    
    public void desplegarReversa(boolean nodo)
    {
        NodoL aux = raiz;
        while(aux != null && aux.getSiguiente() != null)
        {
            aux = aux.getSiguiente();
        }
        
        while(aux != null)
        {
            System.out.print(aux.getEtiqueta() + "\t");
            aux = aux.getAnterior();
        }
        System.out.println("");
    }
    
    public void desplegarReversa()
    {
        desplegarReversa(raiz);
        System.out.println("");
    }
    
    private void desplegarReversa(NodoL nodo)
    {
        if (nodo != null)
        {
            if(nodo.getSiguiente() != null)
            {
                nodo = nodo.getSiguiente();
                desplegarReversa(nodo);
                System.out.print(nodo.getAnterior().getEtiqueta() + "\t");
            }else
            {
                System.out.print(nodo.getEtiqueta() + "\t");
            }
        }
    }
}
