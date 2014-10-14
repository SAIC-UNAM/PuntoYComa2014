package mx.unam.saic.puntoycoma.objetos;

/**
 * Created by José Ángel García Salinas on 06/09/14.
 */
public class Evento {

    private int id;
    private String nombre;
    private String hora_inicio;
    private String hora_final;
    private String fecha;
    private int id_ponente;
    private int id_lugar;
    private int drawable;
    /**
     * Constructror que crea un nuevo objeto Evento, el cual será proyectado el la actividad Punto y Coma
     * en el fragment dias.
     * @param id id del evento
     * @param nombre nombre del evento
     * @param hora_inicio hora de inicio del evento
     * @param hora_final hora final del evento
     * @param id_ponente id del ponente del evento
     * @param id_lugar id del lugar del evento
     * @param drawable recurso drawable a mostrar en la vista del evento
     * @param fecha fecha en la cual se realizará el evento (0 miercoles, 1 jueves, 2 viernes)
     */
    public Evento(int id, String nombre, String hora_inicio, String hora_final, int id_ponente, int id_lugar, int drawable,String fecha) {
        this.id = id;
        this.nombre = nombre;
        this.hora_inicio = hora_inicio;
        this.hora_final = hora_final;
        this.id_ponente = id_ponente;
        this.id_lugar = id_lugar;
        this.drawable = drawable;
        this.fecha = fecha;
    }

    /**
     * Obtiene el día en el cual se realizará el evento
     * @return fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Obtiene la imagen que se mostrará en la vista del evento
     * @return drawable
     */
    public int getDrawable() {
        return drawable;
    }

    /**
     * Especifica que recurso drawable se mostrará en la vista.
     * @param drawable
     */
    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }

    /**
     * Obtiene el id del evento
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Especifíca el id del evento
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del evento
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la hora de inicio del evento
     * @return hora_inicio
     */
    public String getHora_inicio() {
        return hora_inicio;
    }

    /**
     * Obtiene la hora final del evento
     * @return hora_final
     */
    public String getHora_final() {
        return hora_final;
    }

    /**
     * Obtiene el id del ponente del evento
     * @return id_ponente
     */
    public int getId_ponente() {
        return id_ponente;
    }

    /**
     * Obtiene el id del lugar del evento
     * @return
     */
    public int getId_lugar() {
        return id_lugar;
    }

    /**
     * Sobre escribe el metodo toString del objeto devolviendo el nombre del evento
     * @return nombre
     */
    @Override
    public String toString() {
        return this.getNombre();
    }
}
