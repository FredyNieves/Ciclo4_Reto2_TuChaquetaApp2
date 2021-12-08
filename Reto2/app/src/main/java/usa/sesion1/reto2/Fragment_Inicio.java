package usa.sesion1.reto2;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Fragment_Inicio extends Fragment {
    Drawable drawable01, drawable02, drawable03;
    Button boton1;
    TextView texto1;
    FragmentTransaction intercambio;

    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment__inicio, container, false);
        //__________________________________________________________________________________________




        Resources res = getResources();
        drawable01 = res.getDrawable(R.drawable.storeunik, view.getContext().getTheme());

        ImageView imagen01 = (ImageView) view.findViewById(R.id.imageLogo);
        imagen01.setImageDrawable(drawable01)  ;



        //__________________________________________________________________________________________
        return view;
    }
}