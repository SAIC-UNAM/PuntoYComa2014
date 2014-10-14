package mx.unam.saic.puntoycoma.objetos;

/**
 * Created by José Ángel García Salinas on 06/09/14.
 */
public class Lugar {
    private int id;
    private String nombre;
    private double latitud;
    private double longitud;

    /**
     * Constructor que crea un nuevo objeto lugar
     * @param id id del lugar
     * @param nombre nombre del lugar
     * @param latitud latitud del lugar
     * @param longitud longitud del lugar
     */
    public Lugar(int id, String nombre, double latitud, double longitud) {
        this.id = id;
        this.nombre = nombre;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    /**
     * Devuelve el id del lugar
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Devuelve el nombre del lugar
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve la atitud del lugar
     * @return latitud
     */
    public double getLatitud() {
        return latitud;
    }

    /**
     * Devuelve la longitud del lugar
     * @return longitud
     */
    public double getLongitud() {
        return longitud;
    }

}
