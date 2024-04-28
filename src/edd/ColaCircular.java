
package edd;

/**
 *
 * @author Alfred
 */
public class ColaCircular implements Machote
{
    private Object[] colacircular;
    private int atras;
    private int frente;

    public ColaCircular(int n)
    {
        colacircular = new Object[n];
        atras = -1;
        frente = -1;
    }

    /**
     * @return the colacircular
     */
    public Object[] getColacircular()
    {
        return colacircular;
    }

    /**
     * @param colacircular the colacircular to set
     */
    public void setColacircular(Object[] colacircular)
    {
        this.colacircular = colacircular;
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
    
    
    /**
     * @return the frente
     */
    public int getFrente()
    {
        return frente;
    }

    /**
     * @param frente the frente to set
     */
    public void setFrente(int frente)
    {
        this.frente = frente;
    }

    @Override
    public boolean vacia()
    {
        return atras == -1;
    }

    @Override
    public boolean llena()
    {
        return atras + 1 == frente || (atras == colacircular.length-1 && frente == 0);
    }

    @Override
    public void insertar(Object obj)
    {
        if(llena())
        {
            System.out.println("La ColaCircular ya se encuentra llena.");   
        }else
        {
            if (atras == -1)
            {
                atras = frente = 0;
            }else
            {
                if (atras == colacircular.length-1)
                {
                    atras = 0;
                }else
                {
                    atras++;
                }
            }
            colacircular[atras] = obj;
        }
    }

    @Override
    public Object eliminar()
    {
        if(vacia())
        {
            System.out.println("La ColaCircular ya se encuentra vacia.");
            return null;
        }
        
        Object o = colacircular[frente];
        if (frente == atras)
        {
            frente = atras = -1;
        }else
        {
            if (frente == colacircular.length-1)
            {
                frente = 0;
            }else
            {
                frente++;
            }
        }
        return o;
    }    
    
    public Object eliminar(String placa)
    {
        Carro tmp = null;
        for (int i = 0; i <= atras + 1; i++)
        {
            if(eliminar() instanceof Carro x)
            {            
                if(x.getPlaca().equals(placa))
                {
                    tmp = x;
                }else
                {
                    insertar(x);
                }
            }
        }        
        return tmp;
    }

}
