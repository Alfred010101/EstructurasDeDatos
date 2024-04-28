package edd;

/**
 *
 * @author Alfred
 */
public class Libro
{
    private String cve;
    private String titulo;
    private String autor;
    private int paginas;

    public Libro(String cve, String titulo, String autor, int paginas)
    {
        this.cve = cve;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    /**
     * @return the cve
     */
    public String getCve()
    {
        return cve;
    }

    /**
     * @param cve the cve to set
     */
    public void setCve(String cve)
    {
        this.cve = cve;
    }

    /**
     * @return the titulo
     */
    public String getTitulo()
    {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor()
    {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor)
    {
        this.autor = autor;
    }

    /**
     * @return the paginas
     */
    public int getPaginas()
    {
        return paginas;
    }

    /**
     * @param paginas the paginas to set
     */
    public void setPaginas(int paginas)
    {
        this.paginas = paginas;
    }   
}
