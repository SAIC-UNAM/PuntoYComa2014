package mx.unam.saic.puntoycoma.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by José Ángel García Salinas on 21/09/14.
 * Clase que tiene como objetivo decirnos si nuestro dispositivo tiene conexión a internet
 */
public class ConnectionDetector {

    /**
     * Método estático que nos dice si nuestro dispositivo está conectado a internet
     * @param _context contexto principal de la aplicación
     * @return esta_conectado true si encontró la conexión, false si no encuentra ninguna conexión
     */
    public static boolean isConnectedToInternet(Context _context){
        ConnectivityManager connectivityManager = (ConnectivityManager) _context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if(connectivityManager !=null){
            NetworkInfo[] networkInfo = connectivityManager.getAllNetworkInfo();//se usara para saber el estado de la red

            if(networkInfo!=null){
                for(int i = 0; i<networkInfo.length;i++){
                    if(networkInfo[i].getState() == NetworkInfo.State.CONNECTED ){//si se esta conectado regresara un true
                        return true;
                    }
                }
            }
        }
        return false;//en caso de que no se tenga acceso a la red se regresa un false
    }
}
