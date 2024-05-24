package edd.segparcial;

/**
 *
 * @author Alfred
 */
public class ArbolBinario
{

    private NodoArbol r = null;

    /**
     * @return the r
     */
    public NodoArbol getR()
    {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(NodoArbol r)
    {
        this.r = r;
    }

    public NodoArbol inserta(NodoArbol r, NodoArbol n)
    {
        if (r == null)
        {
            return n;
        } else
        {
            if (r.getEtq().compareTo(n.getEtq()) > 0)
            {
                r.setIzq(inserta(r.getIzq(), n));
            } else
            {
                r.setDer(inserta(r.getDer(), n));
            }
            return r;
        }
    }

    public void elimina(NodoArbol raiz, String etq, NodoArbol[] arr)
    {
        if (raiz == null)
        {
            arr[0] = null;
            arr[1] = raiz;
        } else
        {
            if (raiz.getEtq().equals(etq))                          //dato a eliminar encontrado
            {
                arr[0] = raiz;
                if (raiz.getDer() == null && raiz.getIzq() == null)         //no tiene hijos
                {
                    arr[1] = null;
                } else
                {
                    if (!(raiz.getDer() != null && raiz.getIzq() != null))  //tiene un solo hijo
                    {
                        if (raiz.getDer() != null)
                        {
                            arr[1] = raiz.getDer();
                        } else
                        {
                            arr[1] = raiz.getIzq();
                        }
                    } else                                                  //tiene dos hijos
                    {
                        if (raiz.getDer().getIzq() == null)
                        {
//                            NodoArbol sucesor = raiz.getDer();
//                            sucesor.setIzq(raiz.getIzq());
//                            raiz.setDer(null);
//                            raiz.setIzq(null);
//                            arr[1] = sucesor;                              
                            arr[1] = raiz.getDer();
                            raiz.getDer().setIzq(raiz.getIzq());
                        } else
                        {
                            NodoArbol aux = sucesorEnOrden(raiz.getDer());
                            NodoArbol sucesor = aux.getIzq();
                            aux.setIzq(sucesor.getDer());
                            sucesor.setDer(raiz.getDer());
                            sucesor.setIzq(raiz.getIzq());
                            arr[1] = sucesor;
//                            NodoArbol sucesor = sucesorEnOrden(raiz.getDer());
//                            arr[1] = sucesor.getIzq();
//                            sucesor.setIzq(arr[1].getDer());
//                            arr[1].setDer(raiz.getDer());
//                            arr[1].setIzq(raiz.getIzq());
                        }
                        raiz.setIzq(null);
                        raiz.setDer(null);
                    }
                }
            } else
            {
                if (raiz.getEtq().compareTo(etq) > 0)
                {
                    elimina(raiz.getIzq(), etq, arr);
                    raiz.setIzq(arr[1]);
                } else
                {
                    elimina(raiz.getDer(), etq, arr);
                    raiz.setDer(arr[1]);
                }
                arr[1] = raiz;
            }
        }
    }

    public String enOrden(NodoArbol r)
    {
        String s = "";
        if (r != null)
        {
            s += enOrden(r.getIzq());
            s += r.getEtq();
            s += enOrden(r.getDer());
        }
        return s;
    }

    public String preOrden(NodoArbol r)
    {
        String s = "";
        if (r != null)
        {
            s += r.getEtq();
            s += preOrden(r.getIzq());
            s += preOrden(r.getDer());
        }
        return s;
    }

    public String posOrden(NodoArbol r)
    {
        String s = "";
        if (r != null)
        {
            s += posOrden(r.getIzq());
            s += posOrden(r.getDer());
            s += r.getEtq();
        }
        return s;
    }

    private NodoArbol sucesorEnOrden(NodoArbol raiz)
    {
        if (raiz.getIzq().getIzq() != null)
        {
            return sucesorEnOrden(raiz.getIzq());
        } else
        {
            return raiz;
        }
    }
}
