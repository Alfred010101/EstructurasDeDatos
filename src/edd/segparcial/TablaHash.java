
package edd.segparcial;

/**
 *
 * @author Alfred
 */

public class TablaHash
{
    ArbolBinario[] tabla = new ArbolBinario[26];

    public TablaHash()
    {
        for (int i = 0; i < 16; i++)
        {
            tabla[i] = new ArbolBinario();
        }
    }
    
    
    
}
