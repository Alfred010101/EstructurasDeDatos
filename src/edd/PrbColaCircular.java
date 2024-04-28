
package edd;

/**
 *
 * @author Alfred
 */

public class PrbColaCircular
{
    public static void main(String[] args)
    {
        ColaCircular cc = new ColaCircular(5);
        cc.insertar("Uno");
        cc.insertar("Dos");
        cc.insertar("Tres");
        cc.insertar("Cuatro");
        cc.insertar("Cinco");
        cc.insertar("Seis");
        
        System.out.println(cc.eliminar());
        System.out.println(cc.eliminar());
        System.out.println(cc.eliminar());
        System.out.println(cc.eliminar());
        System.out.println(cc.eliminar());
        System.out.println(cc.eliminar());
        System.out.println(cc.eliminar());
        System.out.println(cc.eliminar()); 
    }
}
