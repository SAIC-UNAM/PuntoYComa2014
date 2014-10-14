package mx.unam.saic.puntoycoma.objetos;

import com.parse.ParseClassName;
import com.parse.ParseObject;
import com.parse.ParseUser;

/**
 * Created by José Ángel García Salinas on 28/08/14.
 * Clase que define al objeto Registro alumno, el cual contiene metodos para capturar la información
 * solicitada en la actividad registro de la aplicación.
 */

@ParseClassName("RegistroAlumno")
public class RegistroAlumno extends ParseObject {

    public RegistroAlumno(){}

    /**
     * Método para establecer cual es la escuela.
     * @param escuela nombre de la escuela
     */
    public void setEscuela(String escuela){
        put("escuela",escuela);
    }

    /**
     * Método para establecer cual es la carrera.
     * @param carrera nombre de la carrera
     */
    public void setCarrera(String carrera){
        put("carrera",carrera);
    }

    /**
     * Método para establecer el nombre del alumno.
     * @param nombre nombre del alumno
     */
    public void setNombre(String nombre){
        put("nombre",nombre);
    }

}
