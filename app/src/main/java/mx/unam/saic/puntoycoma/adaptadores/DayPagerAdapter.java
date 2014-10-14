package mx.unam.saic.puntoycoma.adaptadores;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

import mx.unam.saic.puntoycoma.fragments.EventoFragment;
import mx.unam.saic.puntoycoma.util.Constants;

/**
 * Created by José Ángel García Salinas on 13/09/14.
 * Clase que define el adaptador a utilizar en el view pager del fragment de los días
 */
public class DayPagerAdapter extends FragmentStatePagerAdapter {

    /**
     * Constructor donde iniciamos nuestro adaptador de páginas del view pager
     *
     * @param fm fragment manager utilizado en la app
     */
    public DayPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    /**
     * Método que devuelve un fragment Evento dependiendo de la posición
     *
     * @param i posición
     * @return EventoFragment de acuerdo al día escodigo
     */
    @Override
    public Fragment getItem(int i) {
        Log.d(Constants.TAG, "Entra get item del pager");
        return EventoFragment.newInstanceOf(i);
    }

    /**
     * Método que define cuantos fragments tendrá nuestro view pager
     *
     * @return 3 Pues son 3 fragments (3 días)
     */
    @Override
    public int getCount() {
        return 3;
    }

    /**
     * Método que devuelve el título de la página del view pager de acuerdo a la posición
     *
     * @param position posición del view pager
     * @return titulo de la página.
     */
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "17 Sept";
            case 1:
                return "18 Sept";
            case 2:
                return "19 Sept";
        }
        return null;
    }
}
