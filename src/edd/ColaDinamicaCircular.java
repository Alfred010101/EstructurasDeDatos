/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author Alfred
 */
public class ColaDinamicaCircular
{
    private Nodo atras;

    /**
     * @return the atras
     */
    public Nodo getAtras()
    {
        return atras;
    }

    /**
     * @param atras the atras to set
     */
    public void setAtras(Nodo atras)
    {
        this.atras = atras;
    }
//    
//    public void insertar(Nodo nodo)
//    {
//        if(atras == null)
//        {
//            atras =  nodo;
//            atras.setSiguiente(atras);
//            //nodo.setSiguiente(null);
//        }else
//        {
//            nodo.setSiguiente(atras.getSiguiente());
//            atras.setSiguiente(nodo);
//            atras = nodo;
//        }        
//    }
    public void insertar(Nodo nodo)
    {
        if(atras == null)
        {
            
            nodo.setSiguiente(nodo);
            //nodo.setSiguiente(null);
        }else
        {
            nodo.setSiguiente(atras.getSiguiente());
            atras.setSiguiente(nodo);
        }   
        atras =  nodo;
        //nodo = null;
    }
    
    public Nodo eliminar()
    {
        if (atras == null)
        {
            System.out.println("Pila vacia");
            return null;
        }
        //System.out.println("*** " +atras.getSiguiente().getObj().toString() + " \n");
        Nodo nodo = atras.getSiguiente();
        //System.out.println(nodo.getSiguiente().getObj().toString());
        if(atras == nodo)
        {
            atras = null;
        }else
        {
            atras.setSiguiente(nodo.getSiguiente());
        }
        nodo.setSiguiente(null);
        return nodo;
    }
    
}





















