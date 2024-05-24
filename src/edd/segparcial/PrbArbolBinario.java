
package edd.segparcial;

/**
 *
 * @author Alfred
 */
public class PrbArbolBinario
{
    public static void main(String[] args)
    {
        ArbolBinario ab = new ArbolBinario();
        NodoArbol n1 = new NodoArbol("E", null);
        NodoArbol n2 = new NodoArbol("C", null);
        NodoArbol n3 = new NodoArbol("H", null);
        NodoArbol n4 = new NodoArbol("B", null);
        NodoArbol n5 = new NodoArbol("D", null);
        NodoArbol n6 = new NodoArbol("G", null);
        NodoArbol n7 = new NodoArbol("I", null);
        NodoArbol n8 = new NodoArbol("A", null);
        NodoArbol n9 = new NodoArbol("C", null);
        NodoArbol n10 = new NodoArbol("X", null);
        
        ab.setR(ab.inserta(ab.getR(), n1));
        ab.setR(ab.inserta(ab.getR(), n2));
        ab.setR(ab.inserta(ab.getR(), n3));
        ab.setR(ab.inserta(ab.getR(), n4));
        ab.setR(ab.inserta(ab.getR(), n5));
        ab.setR(ab.inserta(ab.getR(), n6));
        ab.setR(ab.inserta(ab.getR(), n7));
        ab.setR(ab.inserta(ab.getR(), n8));
        ab.setR(ab.inserta(ab.getR(), n9));
        ab.setR(ab.inserta(ab.getR(), n10));
        
        System.out.println(ab.enOrden(ab.getR()));
        System.out.println(ab.preOrden(ab.getR()));
        System.out.println(ab.posOrden(ab.getR()));
    }
}
