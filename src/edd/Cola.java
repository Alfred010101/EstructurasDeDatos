package edd;

/**
 *
 * @author Alfred
 */
public class Cola implements Machote
{

    private Object[] cola;
    private int atras;

    public Cola(int n)
    {
        cola = new Object[n];
        atras = -1;
    }

    /**
     * @return the cola
     */
    public Object[] getCola()
    {
        return cola;
    }

    /**
     * @param cola the cola to set
     */
    public void setCola(Object[] cola)
    {
        this.cola = cola;
    }

    /**
     * @return the atras
     */
    public int getAtras()
    {
        return atras;
    }

    /**
     * @param atras the atras to set
     */
    public void setAtras(int atras)
    {
        this.atras = atras;
    }

    @Override
    public boolean vacia()
    {
        return atras == -1;
    }

    @Override
    public boolean llena()
    {
        return atras == cola.length - 1;
    }

    @Override
    public void insertar(Object obj)
    {
        if (llena())
        {
            System.out.println("La Cola se encuentra llena.");
        } else
        {
            cola[++atras] = obj;
        }
    }

    @Override
    public Object eliminar()
    {
        if (vacia())
        {
            System.out.println("La Cola se encuentra vacia.");
            return null;
        }
        Object tmp = cola[0];
        int i = 0;
        while (i < atras)
        {
            cola[i] = cola[(i++) + 1];
        }
        atras--;
        return tmp;
    }

    public Object eliminar(String placa)
    {
        Carro tmp = null;
        for (int i = 0; i <= atras + 1; i++)
        {
            if (eliminar() instanceof Carro x)
            {
                if (x.getPlaca().equals(placa))
                {
                    tmp = x;
                } else
                {
                    insertar(x);
                }
            }
        }
        return tmp;
    }

    public void ordenadoPrioritario(boolean a)
    {
        Pila pilaUno = new Pila(cola.length);
        Pila pilaDos = new Pila(cola.length);

        Object obj1 = eliminar();
        Object obj2 = (vacia()) ? null : eliminar();
        while (obj1 != null && obj2 != null)
        {
            if (obj1 instanceof String objUno && obj2 instanceof String objDos)
            {
                if (objDos.compareTo(objUno) < 0)
                {
                    do
                    {
                        pilaDos.insertar(obj1);
                        if (!pilaUno.vacia())
                        {
                            obj1 = pilaUno.eliminar();
                        } else
                        {
                            obj1 = null;
                            break;
                        }
                    } while (((String) obj2).compareTo((String) obj1) < 0);

                    pilaDos.insertar(obj2);

                    if (obj1 != null)
                    {
                        pilaUno.insertar(obj1);
                    }

                    while (!pilaDos.vacia())
                    {
                        pilaUno.insertar(pilaDos.eliminar());
                    }
                } else
                {
                    pilaUno.insertar(obj1);
                    pilaUno.insertar(obj2);
                }
            }
            obj1 = pilaUno.eliminar();
            obj2 = eliminar();
        }
        
        pilaUno.insertar(obj1);

        while (!pilaUno.vacia())
        {
            Object tmp = pilaUno.eliminar();
            if (tmp != null)
            {
                insertar(tmp);
            }
        }
    }
    
    public void ordenadoPrioritario()
    {
        Pila pilaUno = new Pila(cola.length);
        Pila pilaDos = new Pila(cola.length);

        Object obj1 = this.eliminar();
        Object obj2 = null;
        //comprueba si hay mas de un elemento
        if (this.vacia() && obj1 != null)
        {
            pilaUno.insertar(obj1);
        }else
        {
            obj2 = this.eliminar();
        }
        /**si el obj2 es null no hay elementos suficientes para ordenar
        o la cola ya se encuentra vacia**/
        while (obj2 != null)
        {
            if (obj1 instanceof String objUno && obj2 instanceof String objDos)
            {
                if (objUno.compareTo(objDos) < 0 )
                {
                    do
                    {
                        pilaDos.insertar(objDos);
                        objDos = (pilaUno.vacia()) ? null : (String)pilaUno.eliminar();                        
                    } while (objDos != null && objUno.compareTo((String) objDos) < 0);
                    pilaDos.insertar(objUno);
                    if (objDos != null)
                    {
                        pilaDos.insertar(objDos);
                    }
                    //vaciar pilaDos sobre pilaUno
                    while (!pilaDos.vacia())
                    {
                        pilaUno.insertar(pilaDos.eliminar());
                    }
                } else
                {
                    pilaUno.insertar(objDos);
                    pilaUno.insertar(objUno);
                }                
            }            
            obj2 = (this.vacia()) ? null : pilaUno.eliminar(); 
            obj1 = this.eliminar();
        }
        //vaciar pilaUno sobre la Cola
        while (!pilaUno.vacia())
        {
            this.insertar(pilaUno.eliminar());           
        }
    }
}
