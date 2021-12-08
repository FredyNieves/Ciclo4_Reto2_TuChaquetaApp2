package usa.sesion1.reto2;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class Fragment_Sucursales extends Fragment {

    Drawable drawable1, drawable2, drawable3;
    ImageView imagen1, imagen2, imagen3;

    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment__sucursales, container, false);
        //-----------------------------------------------------------------------------


        //-------------------------------- CARGUE DE IMAGENES ------------------------------

        Resources res1 = getResources();
        drawable1 = res1.getDrawable(R.drawable.sucursal1, v.getContext().getTheme());

        imagen1 = (ImageView)v.findViewById(R.id.imagen1_f3);
        imagen1.setImageDrawable(drawable1);

        //--------------------------------------------------------

        Resources res2 = getResources();
        drawable2 = res2.getDrawable(R.drawable.sucursal2, v.getContext().getTheme());

        imagen2= (ImageView) v.findViewById(R.id.imagen2_f3);
        imagen2.setImageDrawable(drawable2);

        //--------------------------------------------------------

        Resources res3 = getResources();
        drawable3 = res3.getDrawable(R.drawable.sucursal4, v.getContext().getTheme());

        imagen3= (ImageView) v.findViewById(R.id.imagen3_f3);
        imagen3.setImageDrawable(drawable3);


        //-----------------------------------------------------------------------------
        return v;
    }
}