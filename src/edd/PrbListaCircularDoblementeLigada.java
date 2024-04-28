package edd;

/**
 *
 * @author Alfred
 */
public class PrbListaCircularDoblementeLigada
{
    public static void main(String[] args)
    {
        ListaDoblementeLigadaCircular lcdl = new ListaDoblementeLigadaCircular();
        
        System.out.println(lcdl.eliminar("D") + " no hay elementos");
        lcdl.desplegarSig();
        lcdl.desplegarRA();
        lcdl.desplegarRS();
        lcdl.insertar(new NodoL("R", null)); //primer elemento
        lcdl.desplegarSig();
        System.out.println("Elemento eliminado: " + lcdl.eliminar("R").getEtiqueta()); //elimiar unico elemento
        lcdl.desplegarSig();
        lcdl.insertar(new NodoL("T", null)); //al final de la lista //primer elemento
        lcdl.desplegarSig();
        lcdl.insertar(new NodoL("C", null)); //al principio de la lista
        lcdl.desplegarSig();
        //lcdl.desplegarRA();
        //lcdl.desplegarAnt();
        lcdl.desplegarRS();
        System.out.println("******");
        lcdl.insertar(new NodoL("F", null)); //en medio de la lista
        lcdl.insertar(new NodoL("H", null)); //en medio de la lista
        System.out.println("Elemento eliminado: " + lcdl.eliminar("C").getEtiqueta()); //eliminar el primer elemento
        System.out.println("Elemento eliminado: " + lcdl.eliminar("T").getEtiqueta()); //eliminar el ultimo elemento
        lcdl.desplegarSig();
        lcdl.desplegarRA();
        lcdl.desplegarAnt();
        lcdl.desplegarRS();
        System.out.println("******");
        lcdl.insertar(new NodoL("E", null)); //en medio de la lista
        lcdl.insertar(new NodoL("Y", null)); //al final de la lista
        lcdl.insertar(new NodoL("B", null)); //al principio de la lista
        lcdl.desplegarSig();
        lcdl.desplegarRA();
        lcdl.desplegarAnt();
        lcdl.desplegarRS();
        lcdl.insertar(new NodoL("Z", null)); //al final de la lista
        lcdl.insertar(new NodoL("A", null)); //al principio de la lista
        System.out.println("******");
        lcdl.desplegarSig();
        lcdl.desplegarRA();
        lcdl.desplegarAnt();
        lcdl.desplegarRS();
        System.out.println("Elemento eliminado: " + lcdl.eliminar("D")); //eliminar elemento no existente:detener busqueda:controlar error null
        System.out.println("Elemento eliminado: " + lcdl.eliminar("A").getEtiqueta()); //eliminar el primer elemento
        System.out.println("Elemento eliminado: " + lcdl.eliminar("Z").getEtiqueta()); //eliminar el ultimo elemento
        System.out.println("******");
        lcdl.desplegarSig();
        lcdl.desplegarRA();
        lcdl.desplegarAnt();
        lcdl.desplegarRS();
        System.out.println("Elemento eliminado: " + lcdl.eliminar("F").getEtiqueta()); //eliminar elemento de enmedio
        System.out.println("Elemento eliminado: " + lcdl.eliminar("H").getEtiqueta()); //eliminar elemento de enmedio
        lcdl.insertar(new NodoL("A", null)); //al principio de la lista
        System.out.println("******");
        lcdl.desplegarSig();
        lcdl.desplegarRA();
        lcdl.desplegarAnt();
        lcdl.desplegarRS();
        System.out.println("Elemento eliminado: " + lcdl.eliminar("E").getEtiqueta()); //enmedio
        System.out.println("Elemento eliminado: " + lcdl.eliminar("Y").getEtiqueta());// final
        System.out.println("Elemento eliminado: " + lcdl.eliminar("A").getEtiqueta()); //principio
        System.out.println("$$$$$");
        lcdl.desplegarSig();
        lcdl.desplegarRA();
        lcdl.desplegarAnt();
        lcdl.desplegarRS();
        System.out.println("Elemento eliminado: " + lcdl.eliminar("B").getEtiqueta()); //ultimos
        System.out.println(lcdl.eliminar("D") + " no hay elementos"); //vaalidar para el retorno null
        System.out.println("$$$$$");
        lcdl.desplegarSig();
        lcdl.desplegarRA();
        lcdl.desplegarAnt();
        lcdl.desplegarRS();
    }
}
