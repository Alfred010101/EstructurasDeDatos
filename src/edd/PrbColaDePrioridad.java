
package edd;

/**
 *
 * @author Alfred
 */
public class PrbColaDePrioridad
{
    public static void main(String[] args)
    {
        Cola c = new Cola(8);
        
        c.insertar("U");
        c.insertar("D");
        c.insertar("Z");
        c.insertar("O");
        c.insertar("H");
        c.insertar("M");
        c.insertar("N");
        c.insertar("Y");

//        c.insertar("P");
//        c.insertar("S");
//        c.insertar("W");
//        c.insertar("V");
//        c.insertar("L");
//        c.insertar("K");
//        c.insertar("R");
//        c.insertar("Q");

//        c.insertar("G");
//        c.insertar("X");
//        c.insertar("A");
//        c.insertar("T");
//        c.insertar("I");
//        c.insertar("J");
//        c.insertar("F");
//        c.insertar("B");
        
//        c.insertar("C");
//        c.insertar("E");
//        c.insertar("Y");
//        c.insertar("H");
//        c.insertar("U");
//        c.insertar("Z");
//        c.insertar("N");
//        c.insertar("S");
        
//        c.insertar("O");
//        c.insertar("L");
//        c.insertar("D");
//        c.insertar("W");
//        c.insertar("M");
//        c.insertar("P");
//        c.insertar("Q");
//        c.insertar("V");

//        c.insertar("K");
//        c.insertar("X");
//        c.insertar("I");
//        c.insertar("G");
//        c.insertar("B");
//        c.insertar("A");
//        c.insertar("U");
//        c.insertar("A");
        
        c.ordenadoPrioritario();
        
        while(!c.vacia())
        {
            System.out.println(c.eliminar());
        }
    }
}
