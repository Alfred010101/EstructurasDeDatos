
package edd.segparcial;

/**
 *
 * @author Alfred
 */

public class PrbMultilista
{
    public static void main(String[] args)
    {
        Multilista m = new Multilista();
        Nodo n1 = new Nodo("A", null);
        Nodo n2 = new Nodo("B", null);
        Nodo n3 = new Nodo("C", null);
        Nodo n4 = new Nodo("A1", null);
        Nodo n5 = new Nodo("A2", null);
        Nodo n6 = new Nodo("A3", null);
        Nodo n7 = new Nodo("A11", null);
        Nodo n8 = new Nodo("A22", null);
        Nodo n9 = new Nodo("A33", null);
 
        String ets[] =
        {
            "A"
        };
 
        m.setR(m.inserta(m.getR(), n1, ets, 0));
        m.setR(m.inserta(m.getR(), n2, ets, 0));
        m.setR(m.inserta(m.getR(), n3, ets, 0));
 
        //System.out.println(m.desp(m.getR(),  ""));
        
        String ets2[] =
        {
            "A", "A1"
        };
 
        m.setR(m.inserta(m.getR(), n4, ets2, 0));
        m.setR(m.inserta(m.getR(), n5, ets2, 0));
        m.setR(m.inserta(m.getR(), n6, ets2, 0));
 
        String ets3[] =
        {
            "A", "A1", "A11"
        };
 
        m.setR(m.inserta(m.getR(), n7, ets3, 0));
        m.setR(m.inserta(m.getR(), n8, ets3, 0));
        m.setR(m.inserta(m.getR(), n9, ets3, 0));
//        System.out.println(m.desp(m.getR(),  ""));
        
      //  m.setR(m.eliminar(m.getR(), ets3, 0));
        //System.out.println("");
        //m.setR(m.eliminar(m.getR(), ets2, 0));
        System.out.println("");
 
        
        String ets4[]= 
        {
            "A", "A1", "A33"
        };
        
        m.setR(m.eliminar(m.getR(), ets4, 0));
        
        ets4= new String[]
        {
            "A", "A1", "A11"
        };
        m.setR(m.eliminar(m.getR(), ets4, 0));
        ets4= new String[]
        {
            "A", "A1", "A22"
        };
        m.setR(m.eliminar(m.getR(), ets4, 0));
        System.out.println(m.desp(m.getR(),  ""));
    }
    
}
