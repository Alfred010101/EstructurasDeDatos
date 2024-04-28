package edd;

/**
 *
 * @author Alfred
 */

public class PrbBicola
{
    public static void main(String[] args)
    {
        String palabra = lecturas.Lecturas.leerCadena("Dame la cadena para ");
        Bicola b = new Bicola(palabra.length());
        b.clasificarCaracteres(palabra);

        while(true)
        {
            Object[] res  = b.eliminar(b.getAtrasUno(), -1, 1);
            b.setAtrasUno(b.getAtrasUno()-1);
            System.out.println(res[0]);
            if((int)res[1] == -1)
            {
                break;
            }
        }
        
        while(true)
        {
            Object[] res  = b.eliminar(b.getAtrasDos(), palabra.length(), -1);
            b.setAtrasDos(b.getAtrasDos() + 1);
            System.out.println(res[0]);
            if((int)res[1] == palabra.length())
            {
                break;
            }
        }
    }
}
