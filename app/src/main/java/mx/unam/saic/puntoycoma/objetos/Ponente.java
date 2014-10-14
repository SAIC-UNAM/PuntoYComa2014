package mx.unam.saic.puntoycoma.objetos;

/**
 * Created by José Ángel García Salinas on 06/09/14.
 */
public class Ponente {

    private int id;
    private String nombre;
    private String fb;
    private String tw;
    private int empresa_id;

    /**
     * Constructor que crea un nuevo objeto ponente, esto para identificar su tw y su fb, así como a la empresa o grupo
     * a la que pertenece el ponente
     * @param id id del ponente
     * @param nombre nombre del ponente
     * @param fb facebook del ponente
     * @param tw twitter del ponente
     * @param empresa_id id de la empresa a la que pertenece el ponente
     */
    public Ponente(int id, String nombre, String fb, String tw, int empresa_id) {
        this.id = id;
        this.nombre = nombre;
        this.fb = fb;
        this.tw = tw;
        this.empresa_id = empresa_id;
    }

    /**
     * Obtiene el id de la empresa del ponente.
     * @return empresa_id
     */
    public int getEmpresa_id() {
        return empresa_id;
    }

    /**
     * Obtiene el id del ponente
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el id del ponente
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del ponente
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el Facebook del ponente
     * @return fb
     */
    public String getFb() {
        return fb;
    }

    /**
     * Obtiene el tuiter del ponente.
     * @return tw
     */
    public String getTw() {
        return tw;
    }

}
