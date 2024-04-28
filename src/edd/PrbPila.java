package edd;

/**
 *
 * @author Alfred
 */

public class PrbPila
{
    public static void main(String[] args)
    {
        Pila p = new Pila(5);
        p.insertar(new Libro("21", "Algoritmica", "Desconocido", 678));
        p.insertar(new Libro("FGR", "Programacion", "Desconocido", 508));
        p.insertar(new Libro("WR", "POO", "Desconocido", 780));
        
        if(p.eliminar() instanceof Libro x)
        {
            System.out.println(x.getTitulo() + "\n");
        }
        
        while(!p.vacia())
        {
            if(p.eliminar() instanceof Libro x)
            {
                System.out.println(x.getTitulo());
            }
        }
    }
}
