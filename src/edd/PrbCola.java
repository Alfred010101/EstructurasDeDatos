
package edd;

/**
 *
 * @author Alfred
 */

public class PrbCola
{
    public static void main(String[] args)
    {
        Cola c = new Cola(7);
        c.insertar(new Carro("BMW","NRS-32", 2019, 298000.90));
        c.insertar(new Carro("HONDA","N-SSS", 2015, 187000.90));
        c.insertar(new Carro("NISSAN","S3", 2022, 627000.00));
        c.insertar(new Carro("CHEVROLET","593", 2022, 627000.00));
        c.insertar(new Carro("FORD","333", 2022, 627000.00));
        
        c.eliminar("S3");
        
        while(!c.vacia())
        {
            if(c.eliminar() instanceof Carro x)
            {
                System.out.println(x.getMarca());
            }
        }
    }
}
