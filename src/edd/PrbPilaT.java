package edd;

/**
 *
 * @author Alfred
 */

public class PrbPilaT
{
    public static void main(String[] args)
    {
        Carro[] arr = new Carro[5];
        PilaT <Carro>obj = new PilaT(arr);
        
        Carro c1 = new Carro("NISSAN", "EFED", 2019, 4);
        Carro c2 = new Carro("BMW", "EFED", 2019, 4);
        Carro c3 = new Carro("FORD", "EFED", 2019, 4);
        
        obj.insertar(c1);
        obj.insertar(c2);
        obj.insertar(c3);
        
        c1 = obj.eliminar();
        if (c1 != null)
        {
            System.out.println(c1.toString());
        }
    }
}
