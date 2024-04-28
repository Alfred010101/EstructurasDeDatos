package edd;

/**
 *
 * @author Alfred
 */
public class PrbColaDinamicaCircular
{
    public static void main(String[] args)
    {
        ColaDinamicaCircular cdc = new ColaDinamicaCircular();
        cdc.insertar(new Nodo("", new Carro("FORD", "SEFWF", 2111, 241)));
        cdc.insertar(new Nodo("", new Carro("RAM", "SEFWF", 2111, 241)));
        cdc.insertar(new Nodo("", new Carro("FERRARI", "SEFWF", 2111, 241)));
        cdc.insertar(new Nodo("", new Carro("NISSAN", "SEFWF", 2111, 241)));
        //cdc.eliminar();
//        
        System.out.println(cdc.eliminar().getObj().toString());
        System.out.println(cdc.eliminar().getObj().toString());
        System.out.println(cdc.eliminar().getObj().toString());
        System.out.println(cdc.eliminar().getObj().toString());
        System.out.println(cdc.eliminar().getObj().toString());
//        System.out.println(cdc.eliminar());
//        System.out.println(cdc.eliminar());
//        System.out.println(cdc.eliminar());
//        System.out.println(cdc.eliminar());
    }
}
