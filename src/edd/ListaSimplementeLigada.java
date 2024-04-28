
package edd;

/**
 *
 * @author Alfred
 */
public class ListaSimplementeLigada
{
    private Nodo raiz;
    /**
     * @return the raiz
     */
    public Nodo getRaiz()
    {
        return raiz;
    }

    /**
     * @param raiz the raiz to set
     */
    public void setRaiz(Nodo raiz)
    {
        this.raiz = raiz;
    }

    public boolean insertar(Nodo nodo)
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
            raiz = nodo;
            return true;
        }

        Nodo aux = raiz;
        while (aux.getSiguiente() != null)
        {
            if (nodo.getEtiqueta().compareTo(aux.getSiguiente().getEtiqueta()) < 0)
            {
                nodo.setSiguiente(aux.getSiguiente());
                aux.setSiguiente(nodo);
                return true;
            }
            aux = aux.getSiguiente();
        }
       
        aux.setSiguiente(nodo);
        return true;
    }
    
    public Nodo eliminar(String etiqueta)
    {
        if(raiz == null)
        {
            System.out.println("La lista se encuentra vacia");
            return null;
        }
        
        Nodo aux = raiz;
        if(raiz.getEtiqueta().equals(etiqueta))
        {
            raiz = raiz.getSiguiente();
            aux.setSiguiente(null);
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
                Nodo nodo = aux.getSiguiente();
                aux.setSiguiente(nodo.getSiguiente());
                nodo.setSiguiente(null);
                return nodo;
            }
            aux = aux.getSiguiente();
        }
        
        System.out.println("No existe el Nodo");
        return null;
    }
    
    public void desplegar()
    {
        Nodo aux = raiz;
        while(aux != null)
        {
            System.out.print(aux.getEtiqueta() + "\t");
            aux = aux.getSiguiente();
        }
        System.out.println("");
    }
}
