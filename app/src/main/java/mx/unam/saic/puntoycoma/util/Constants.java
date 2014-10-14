package mx.unam.saic.puntoycoma.util;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by José Angel García Salinas on 21/09/14.
 * Clase para controlar las constantes que necesita la aplicación
 */
public class Constants {

    public static final String TAG = "puntoycoma"; //Tag del logcat
    public static final String  ARG_SECTION_NUMBER = "section_number"; //sección escogida en navigation drawer
    public static final String  ARG_DAY = "day_number"; // selección del día
    public static final String[] CEDES = {"Facultad de Ciencias","Facultad de Ingeniería","Posgrado de Ingeniería"}; //constantes utilizadas en dias fragment


    /**
     * Método que establece el nombre guardado al iniciar sesión
     * @param context contexto de la aplicación
     * @param name nombre de la persona
     */
    public static void setName(Context context,String name){
        SharedPreferences.Editor edit =  context.getSharedPreferences(Constants.TAG,Context.MODE_PRIVATE).edit();
        edit.putString("nombre",name);
        edit.apply();
    }

    /**
     * Método que devuelve el nombre del usuario de la aplicación obtenido en el inicio de sesión
     * @param context contexto de la aplicación
     * @return nombre
     */
    public static String getName(Context context){
        return context.getSharedPreferences(Constants.TAG,Context.MODE_PRIVATE).getString("nombre","");
    }
}
