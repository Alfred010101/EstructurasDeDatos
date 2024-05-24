
package edd.segparcial;

import java.util.Date;

/**
 *
 * @author Alfred
 */
public class PrbArchivos
{
    public static void main(String[] args)
    {
        Multilista multilista = new Multilista();
        //Nodo nodo = new Nodo<>("Documetos", new Archivo("Documentos", "Alfredo", 45, false, new Date(2024, 5, 32)));
        Nodo nodo1 = new Nodo<>("Documentos", null);
        Nodo nodo2 = new Nodo<>("Escritorio", null);
        Nodo nodo3 = new Nodo<>("Descargas", null);
        Nodo nodo4 = new Nodo<>("Imagenes", null);
        multilista.setR(multilista.inserta(multilista.getR(),nodo1, new String[]{"Documentos"}, 0));
        multilista.setR(multilista.inserta(multilista.getR(),nodo2, new String[]{"Documentos"}, 0));
        multilista.setR(multilista.inserta(multilista.getR(),nodo3, new String[]{"Documentos"}, 0));
        multilista.setR(multilista.inserta(multilista.getR(),nodo4, new String[]{"Documentos"}, 0));
        
        //multilista.setR(multilista.eliminar(multilista.getR(), new String[]{"Documentos"}, 0));
        System.out.println(multilista.desp(multilista.getR(), ""));
    }
}
