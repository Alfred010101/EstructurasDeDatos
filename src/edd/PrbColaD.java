package edd;

/**
 *
 * @author Alfred
 */

public class PrbColaD
{
    public static void main(String[] args)
    {
        ColaDinamica colaD = new ColaDinamica();
        
        colaD.insertar(new Nodo("", new Libro("Alguno","Desconocido", "", 9)));
        colaD.insertar(new Nodo("", new Libro("Algun Otro","Desconocido", "" , 2)));
        colaD.insertar(new Nodo("", new Libro("Otro Mas","Desconocido", "", 3)));
        
        System.out.println(colaD.eliminar().getObj().toString());
        
        colaD.insertar(new Nodo("", new Libro("Mas...","Desconocido", "", 4)));
        
        System.out.println(colaD.eliminar().getObj().toString());
        System.out.println(" >>> " + colaD.getFrente().getObj().toString());
        System.out.println(" >>> " + colaD.getAtras().getObj().toString());
        System.out.println(colaD.eliminar().getObj().toString());
        System.out.println(" >>> " + colaD.getFrente().getObj().toString());
        System.out.println(" >>> " + colaD.getAtras().getObj().toString());
        System.out.println(colaD.eliminar().getObj().toString());
        System.out.println(" >>> " + colaD.getFrente());
        System.out.println(" >>> " + colaD.getAtras());
        if (colaD.eliminar() == null)
        {
            System.out.println("empty");
        }
        System.out.println(" >>> " + colaD.getFrente());
        System.out.println(" >>> " + colaD.getAtras());

    }
}
