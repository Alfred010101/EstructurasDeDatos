
package edd;

/**
 *
 * @author Alfred
 */
public class PrbListaSimplementeLigadaCircular
{
    public static void main(String[] args)
    {
        ListaSimplementeLigadaCircular lslc = new ListaSimplementeLigadaCircular();
        
        lslc.desplegar();
        lslc.insertar(new Nodo("B", null));
        /*lslc.desplegar();
        lslc.insertar(new Nodo("T", null));
        lslc.desplegar();
        lslc.insertar(new Nodo("X", null));
        lslc.desplegar();
        lslc.insertar(new Nodo("C", null));
        lslc.desplegar();
        lslc.insertar(new Nodo("Y", null));
        lslc.desplegar();
        lslc.insertar(new Nodo("A", null));
        lslc.desplegar();*/
        lslc.eliminar("B", true);
        lslc.eliminar("B", true);        
        //lslc.eliminar("T", true);
        lslc.desplegar();
    }
}
