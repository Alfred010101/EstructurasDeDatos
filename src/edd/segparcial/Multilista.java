
package edd.segparcial;

/**
 *
 * @author Alfred
 */

public class Multilista
{
 
    private Nodo r = null;

    /**
     * @return the r
     */
    public Nodo getR()
    {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(Nodo r)
    {
        this.r = r;
    }
 
    public Nodo inserta(Nodo nodoRaiz, Nodo nodoInsertar, String ets[], int nivel)
    {
        if (nivel == ets.length - 1)
        {
            ListaDoblementeLigadaCircular lista = new ListaDoblementeLigadaCircular();
            lista.setRaiz(nodoRaiz);
            lista.insertar(nodoInsertar);
            return lista.getRaiz();
        }else
        {
            Nodo aux = busca(nodoRaiz, ets[nivel]);
            if (aux != null)
            {
                aux.setAbajo(inserta(aux.getAbajo(), nodoInsertar, ets, nivel + 1));
            }else
            {
                System.out.println("No se encontro " + ets[nivel]);
            }
            return nodoRaiz;
        }
    }
 
    public Nodo busca(Nodo r, String s)
    {
        if (r != null)
        {
            Nodo aux = r.getSiguiente();
            do
            {
                if (aux.getEtiqueta().equals(s))
                {
                    return aux;
                }
                aux = aux.getSiguiente();
            } while (aux != r.getSiguiente());
        }
        return null;
    }
    
    public String desp(Nodo r, String saltos)
    {
        String s= "";
        if (r != null)
        {
            Nodo aux = r.getSiguiente();
            do
            {
                s += saltos + aux.getEtiqueta() + "\n" + desp(aux.getAbajo(),  saltos + "\t");
                aux = aux.getSiguiente();
            } while (aux != r.getSiguiente());
        }
        return s;
    }
    
    public Nodo eliminar(Nodo nodoRaiz, String ets[], int nivel)
    {    
        if (nodoRaiz != null)
        {
            Nodo aux = busca(nodoRaiz, ets[nivel]);   
            if(aux != null)
            {
                if (nivel == ets.length - 1)
                {
                    ListaDoblementeLigadaCircular lista = new ListaDoblementeLigadaCircular();
                    lista.setRaiz(nodoRaiz);
                    lista.eliminar(ets[nivel]);
                    return lista.getRaiz();
                }else
                {
                    aux.setAbajo(eliminar(aux.getAbajo(), ets, nivel + 1));
                    return nodoRaiz;
                }                
            }else
            {       
                System.out.println("No se encontro B");
                return nodoRaiz;
            }
        }else
        {
            System.out.println("No se encontro A");
            return null;
        }
    }
}