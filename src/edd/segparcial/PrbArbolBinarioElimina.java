
package edd.segparcial;

/**
 *
 * @author Alfred
 */
public class PrbArbolBinarioElimina
{
    public static void main(String[] args)
    {
        ArbolBinario ab = new ArbolBinario();
        NodoArbol n0 = new NodoArbol("L", null);
        NodoArbol n1 = new NodoArbol("G", null);
        NodoArbol n2 = new NodoArbol("C", null);
        NodoArbol n3 = new NodoArbol("O", null);
        NodoArbol n4 = new NodoArbol("B", null);
        NodoArbol n5 = new NodoArbol("F", null);
        NodoArbol n6 = new NodoArbol("M", null);
        NodoArbol n7 = new NodoArbol("P", null);
//        NodoArbol n8 = new NodoArbol("A", null); //
        NodoArbol n9 = new NodoArbol("D", null);
        NodoArbol n10 = new NodoArbol("L", null);
        NodoArbol n11 = new NodoArbol("N", null); //
        NodoArbol n12 = new NodoArbol("Q", null);
        NodoArbol n13 = new NodoArbol("E", null);
        NodoArbol n14 = new NodoArbol("K", null);
        NodoArbol n15 = new NodoArbol("H", null);
        NodoArbol n16 = new NodoArbol("I", null);
        NodoArbol n17 = new NodoArbol("J", null);
        
//        ab.setR(ab.inserta(ab.getR(), n0));
        ab.setR(ab.inserta(ab.getR(), n1));
        ab.setR(ab.inserta(ab.getR(), n2));
        ab.setR(ab.inserta(ab.getR(), n3));
        ab.setR(ab.inserta(ab.getR(), n4));
        ab.setR(ab.inserta(ab.getR(), n5));
        ab.setR(ab.inserta(ab.getR(), n6));
        ab.setR(ab.inserta(ab.getR(), n7));
//        ab.setR(ab.inserta(ab.getR(), n8));
        ab.setR(ab.inserta(ab.getR(), n9));
        ab.setR(ab.inserta(ab.getR(), n10));
        ab.setR(ab.inserta(ab.getR(), n11));
        ab.setR(ab.inserta(ab.getR(), n12));
        ab.setR(ab.inserta(ab.getR(), n13));
        ab.setR(ab.inserta(ab.getR(), n14));
        ab.setR(ab.inserta(ab.getR(), n15));
        ab.setR(ab.inserta(ab.getR(), n16));
        ab.setR(ab.inserta(ab.getR(), n17));
        
        System.out.println(ab.enOrden(ab.getR()));
//        System.out.println(ab.preOrden(ab.getR()));
//        System.out.println(ab.posOrden(ab.getR()));
        
        NodoArbol arr[] = new NodoArbol[2];
//        ab.elimina(ab.getR(), "A", arr);
//        ab.setR(arr[1]);
//        System.out.println("\n" + ab.enOrden(ab.getR()));
        ab.elimina(ab.getR(), "A", arr);
        ab.setR(arr[1]);
        System.out.println("\n" + ab.enOrden(ab.getR()));
//        ab.elimina(ab.getR(), "G", arr);
//        ab.setR(arr[1]);
//        System.out.println("\n" + ab.enOrden(ab.getR()));
    }
}
