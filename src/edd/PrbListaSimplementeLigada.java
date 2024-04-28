
package edd;

/**
 *
 * @author Alfred
 */

public class PrbListaSimplementeLigada
{
    public static void main(String[] args)
    {
        ListaSimplementeLigada lsm = new ListaSimplementeLigada();
        //System.out.println("5".compareTo("4"));
        lsm.eliminar("5");
        lsm.insertar(new Nodo("5",null));
        lsm.eliminar("6");
        lsm.desplegar();
        lsm.eliminar("5");
        lsm.eliminar("8");
        lsm.desplegar();
        lsm.insertar(new Nodo("6", null));
        lsm.insertar(new Nodo("8", null));
        lsm.insertar(new Nodo("3", null));
        lsm.insertar(new Nodo("7", null));
        lsm.insertar(new Nodo("9", null));
        lsm.insertar(new Nodo("1", null));
        lsm.eliminar("4");
        lsm.desplegar();
        //lsm.eliminar("6");
        lsm.eliminar("8");
        lsm.desplegar();
        lsm.eliminar("9");
        lsm.desplegar();
        lsm.eliminar("1");
        lsm.desplegar();
        lsm.insertar(new Nodo("9", null));
        lsm.insertar(new Nodo("5", null));
        lsm.insertar(new Nodo("0", null));
        lsm.desplegar();
        lsm.eliminar("9");
        lsm.desplegar();
        lsm.eliminar("7");
        lsm.desplegar();
        lsm.eliminar("6");
        lsm.desplegar();
        lsm.eliminar("5");
        lsm.desplegar();
        lsm.eliminar("3");
        lsm.desplegar();
        lsm.eliminar("0");
        lsm.desplegar();
        lsm.eliminar("0");
        lsm.desplegar();
    }
}
