
package edd.segparcial;

/**
 *
 * @author Alfred
 */

public class ListaDoblementeLigadaCircular
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
            System.out.println("No se pueden insertar nodos nulos");
            return false;
        }
        
        if (raiz == null)
        {
            raiz = nodo;
            raiz.setSiguiente(raiz);
            raiz.setAnterior(raiz);
            return true;
        }
        
        if(nodo.getEtiqueta().compareTo(raiz.getSiguiente().getEtiqueta()) < 0)
        {
            nodo.setSiguiente(raiz.getSiguiente());
            nodo.setAnterior(raiz);
            raiz.getSiguiente().setAnterior(nodo);
            raiz.setSiguiente(nodo);
            return true;
        }
        
        if(nodo.getEtiqueta().compareTo(raiz.getEtiqueta()) > 0)
        {
            nodo.setSiguiente(raiz.getSiguiente());
            nodo.setAnterior(raiz);
            raiz.getSiguiente().setAnterior(nodo);
            raiz.setSiguiente(nodo);
            raiz = nodo;
            return true;
        }
        
        Nodo aux = raiz.getSiguiente();
        while(aux != raiz)
        {
            if(nodo.getEtiqueta().compareTo(aux.getSiguiente().getEtiqueta()) < 0)
            {
                nodo.setSiguiente(aux.getSiguiente());
                nodo.setAnterior(aux);
                aux.getSiguiente().setAnterior(nodo);
                aux.setSiguiente(nodo);
                return true;
            }
            aux = aux.getSiguiente();
        }
        return false;        
    }
    
    public Nodo eliminar(String etiqueta)
    {
        if(raiz == null)
        {
            return null;
        }
        
        Nodo aux = raiz;
        if(raiz.getEtiqueta().equals(etiqueta) && raiz.getSiguiente() == raiz && raiz.getAnterior() == raiz)
        {
            raiz = null;
            return aux;
        }
        
        if(raiz.getSiguiente().getEtiqueta().equals(etiqueta))
        {
            aux = raiz.getSiguiente();
            raiz.setSiguiente(aux.getSiguiente());
            raiz.getSiguiente().setAnterior(raiz);
            aux.setSiguiente(null);
            aux.setAnterior(null);
            return aux;
        }
        
        if(raiz.getEtiqueta().equals(etiqueta))
        {
            raiz = aux.getAnterior();
            raiz.setSiguiente(aux.getSiguiente());
            raiz.getSiguiente().setAnterior(raiz);
            aux.setSiguiente(null);
            aux.setAnterior(null);
            return aux;
        }
        
        aux = aux.getSiguiente().getSiguiente();
        while(aux != raiz)
        {              
            if(aux.getEtiqueta().compareTo(etiqueta)>0)
            {
                System.out.print("No encontrado ");
                return null;
            }
            if(aux.getEtiqueta().equals(etiqueta))
            {
                aux.getAnterior().setSiguiente(aux.getSiguiente());
                aux.getSiguiente().setAnterior(aux.getAnterior());
                aux.setSiguiente(null);
                aux.setAnterior(null);
                return aux;
            }
            aux = aux.getSiguiente();
        }
        return null;
    }
    
    public void desplegarSig()
    {
        if (raiz != null)
        {
            Nodo aux = raiz.getSiguiente();
            do
            {
                System.out.print(aux.getEtiqueta() + "\t");
                aux = aux.getSiguiente();
            }while(aux != raiz.getSiguiente());
            System.out.println("");
        }else
        {
            System.out.println("Lista vacia");
        }        
    }
    
    public void desplegarRA()
    {
        if (raiz != null)
        {
            desplegarRecursivoAtras(raiz);
            System.out.println("");
        }else
        {
            System.out.println("Lista vacia");
        }    
    }
    
    private void desplegarRecursivoAtras(Nodo nodo)
    {
        if(nodo != raiz.getSiguiente())
        {
            desplegarRecursivoAtras(nodo.getAnterior());
        }
        System.out.print(nodo.getEtiqueta() + "\t");
    }
    
    public void desplegarAnt()
    {
        if (raiz != null)
        {
            Nodo aux = raiz;
            do
            {
                System.out.print(aux.getEtiqueta() + "\t");
                aux = aux.getAnterior();
            }while(aux != raiz);
            System.out.println("");
        }else
        {
            System.out.println("Lista vacia");
        }        
    }
    
    public void desplegarRS()
    {
        if (raiz != null)
        {
            desplegarRecursivoSiguiente(raiz.getSiguiente());
            System.out.println("");
        }else
        {
            System.out.println("Lista vacia");
        }    
    }
    
    private void desplegarRecursivoSiguiente(Nodo nodo)
    {
        if(nodo != raiz)
        {
            desplegarRecursivoSiguiente(nodo.getSiguiente());
        }
        System.out.print(nodo.getEtiqueta() + "\t");
    }
    /*
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
            raiz.setAnterior(raiz);
            return true;
        }
 
        if (nodo.getEtiqueta().compareTo(raiz.getEtiqueta()) > 0)
        {
            nodo.setSiguiente(raiz.getSiguiente());
            nodo.setAnterior(raiz);
            raiz.getSiguiente().setAnterior(nodo);
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
                    nodo.setAnterior(aux);
                    aux.setSiguiente(nodo);
                    nodo.getSiguiente().setSiguiente(nodo);
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
    }*/
}
