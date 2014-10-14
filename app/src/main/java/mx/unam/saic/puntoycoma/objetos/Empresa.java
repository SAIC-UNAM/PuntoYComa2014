package mx.unam.saic.puntoycoma.objetos;

/**
 * Created by José Ángel García Salinas on 06/09/14.
 */
public class Empresa {


    private int id;
    private String nombre;
    private String fb;
    private String tw;

    /**
     * Constructor que crea un nuevo objeto empresa.
     * @param id id de la empresa
     * @param nombre nombre de la empresa
     * @param fb usuario de facebook de la empresa
     * @param tw usuario de twitter de la empresa
     */
    public Empresa(int id, String nombre, String fb, String tw) {
        this.id = id;
        this.nombre = nombre;
        this.fb = fb;
        this.tw = tw;
    }

    /**
     * Obtiene el id de la empresa
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * establece el id de la empresa
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre de la empresa
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la empresa
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el usuario de fb de la empresa
     * @return fb
     */
    public String getFb() {
        return fb;
    }

    /**
     * Establece el usuario de facebook de la empresa
     * @param fb
     */
    public void setFb(String fb) {
        this.fb = fb;
    }

    /**
     * Obtiene el usuario de twitter de la empresa
     * @return tw
     */
    public String getTw() {
        return tw;
    }

    /**
     * Establece el usuario de twitter de la empresa
     * @param tw
     */
    public void setTw(String tw) {
        this.tw = tw;
    }

    /*
     * Notas.
     * Por razones de tiempo no se implemento el perfil de facebook
     */
}
