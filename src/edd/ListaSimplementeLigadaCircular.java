
package edd;

/**
 *
 * @author Alfred
 */
public class ListaSimplementeLigadaCircular
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
            raiz.setSiguiente(raiz);
            return true;
        }
 
        if (nodo.getEtiqueta().compareTo(raiz.getEtiqueta()) > 0)
        {
            nodo.setSiguiente(raiz.getSiguiente());
            raiz.setSiguiente(nodo);
            raiz = nodo;
            return true;
        }else
        {
            Nodo aux = raiz;
            while (aux.getSiguiente() != raiz)
            {
                if (nodo.getEtiqueta().compareTo(aux.getSiguiente().getEtiqueta()) < 0)
                {
                    nodo.setSiguiente(aux.getSiguiente());
                    aux.setSiguiente(nodo);
                    return true;
                }
                aux = aux.getSiguiente();
            }
            return false;
        }
    }
    
    public Nodo eliminar(String etiqueta)
    {
        if(raiz == null)
        {
            System.out.println("La lista se encuentra vacia");
            return null;
        }
        
        Nodo aux = raiz;
        
        while(aux.getSiguiente() != raiz)
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
        
        if(aux.getSiguiente().getEtiqueta().equals(etiqueta))
        {
            if(aux.getSiguiente() == raiz)
            {
                raiz = null;
                return aux;
            }
            Nodo nodo = aux.getSiguiente();
            aux.setSiguiente(nodo.getSiguiente());
            nodo.setSiguiente(null);
            return nodo;
        }
        
        System.out.println("No existe el Nodo");
        return null;
    }
    
    public Nodo eliminar(String etiqueta, boolean t)
    {
        Nodo nodo = null;
        if (raiz != null)
        {
            if(etiqueta.compareTo(raiz.getSiguiente().getEtiqueta()) >= 0 && etiqueta.compareTo(raiz.getEtiqueta()) <= 0)
            {
                if(raiz.getSiguiente().getEtiqueta().equals(etiqueta))
                {
                    nodo = raiz.getSiguiente();
                    raiz.setSiguiente(nodo.getSiguiente());
                    if (raiz == nodo)
                    {
                        raiz = null;
                    }
                }else
                {
                    Nodo aux = raiz.getSiguiente();
                    do
                    {
                        if (aux.getSiguiente().getEtiqueta().equals(etiqueta))
                        {
                            nodo = aux.getSiguiente();
                            aux.setSiguiente(nodo.getSiguiente());
                            if(raiz == nodo)
                            {
                                raiz = aux;
                            }
                        }else
                        {
                            if(aux.getSiguiente().getEtiqueta().compareTo(etiqueta) > 0)
                            {
                                break;
                            }else
                            {
                                aux = aux.getSiguiente();
                            }
                        }
                    } while (aux != raiz.getSiguiente());
                    if(nodo != null)
                    {
                        nodo.setSiguiente(null);
                    }
                }
            }else
            {
                System.out.println("Dato no encontrado");
            }
        }else
        {
            System.out.println("No hay dato");
        }
        return nodo;
    }
    
    public void desplegar()
    {
        if (raiz != null)
        {
            Nodo aux = raiz.getSiguiente();
            do
            {
                System.out.print(aux.getEtiqueta() + "\t");
                aux = aux.getSiguiente();
            }while(aux != raiz.getSiguiente());
            System.out.println("*");
        }       
    }
}
