package edd;

/**
 *
 * @author Alfred
 */
public class Bicola
{
    private Object[] bicola;
    private int atrasUno;
    private int atrasDos;
    
    public Bicola(int n)
    {
        bicola = new Object[n];
        atrasUno = -1;
        atrasDos = n;
    }

    /**
     * @return the bicola
     */
    public Object[] getBicola()
    {
        return bicola;
    }

    /**
     * @param bicola the bicola to set
     */
    public void setBicola(Object[] bicola)
    {
        this.bicola = bicola;
    }

    /**
     * @return the atrasUno
     */
    public int getAtrasUno()
    {
        return atrasUno;
    }

    /**
     * @param atrasUno the atrasUno to set
     */
    public void setAtrasUno(int atrasUno)
    {
        this.atrasUno = atrasUno;
    }

    /**
     * @return the atrasDos
     */
    public int getAtrasDos()
    {
        return atrasDos;
    }

    /**
     * @param atrasDos the atrasDos to set
     */
    public void setAtrasDos(int atrasDos)
    {
        this.atrasDos = atrasDos;
    }
    
    public boolean vacia()
    {
        return atrasUno == -1 && atrasDos == bicola.length;
    }

    public boolean llena()
    {
        return atrasUno + bicola.length - atrasUno < bicola.length - 1;
    }
    
    public int insertar(Object obj, int a, int lim, int factor)
    {
        if(a + factor != lim)
        {
            bicola[a + factor] = obj;
            return a + factor;
        }
            System.out.println("Bicola llena");
        return a;
    }
    
    public Object[] eliminar(int a, int lim, int factor)
    {
        Object[] e = new Object[2];
        if(a != lim)
        {
            e[0] = bicola[lim + factor];
            for (int i = lim + factor; i != a; i += factor)
            {
                bicola[i] = bicola[i + factor];
            }
            e[1] = a - factor;
        }else
        {
            System.out.println("Bicola vacia");
            e[1] = a;
        }
        return e;
    }
    
    public void clasificarCaracteres(String s)
    {
        char[] cadena = s.toCharArray();
        for (int i = 0; i < cadena.length && !llena(); i++)
        {
            switch((int)cadena[i])
            {
                case 65:
                case 69:
                case 73:
                case 79:
                case 85:
                case 97:
                case 101:
                case 105:
                case 111:
                case 117:
                    insertar(cadena[i], getAtrasDos(), getAtrasUno(), -1);
                    atrasDos--;
                    break;
                    
                default:
                    insertar(cadena[i],  getAtrasUno(), getAtrasDos(),1);
                    atrasUno++;
                    break;
            }
        }
    }
    
    
}
