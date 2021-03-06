package com.example.martiportatil.negocis6icons.restaurants;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.example.martiportatil.negocis6icons.R;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link VegetariaFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class VegetariaFragment extends Fragment implements View.OnClickListener {

    public TextView restaurantNom1;
    public TextView restaurantNom2;
    public TextView restaurantNom3;
    public TextView telefon1;
    public TextView telefon2;
    public TextView telefon3;

    public VegetariaFragment() {


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v=inflater.inflate(R.layout.fragment_vegetaria, container, false);

        restaurantNom1=(TextView) v.findViewById(R.id.restaurantdo);
        restaurantNom1.setOnClickListener(this);

        restaurantNom2=(TextView) v.findViewById(R.id.vinyam);
        restaurantNom2.setOnClickListener(this);

        restaurantNom3=(TextView) v.findViewById(R.id.wagaya);
        restaurantNom3.setOnClickListener(this);

        telefon1=(TextView) v.findViewById(R.id.restaurantdotelefon);
        telefon1.setOnClickListener(this);

        telefon2=(TextView) v.findViewById(R.id.vinyamtelefon);
        telefon2.setOnClickListener(this);

        telefon3=(TextView) v.findViewById(R.id.wagayatelefon);
        telefon3.setOnClickListener(this);

        return v;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onClick(View v) {

        if (v==restaurantNom1)
        {
            Uri uri = Uri.parse("http://www.restaurantedo.com/");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }
        else if (v==restaurantNom2)
        {
            Uri uri = Uri.parse("http://www.vinyam.es/");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }
        else if (v==restaurantNom3)
        {
            Uri uri = Uri.parse("https://www.wagaya.com.au/");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }
        else if (v==telefon1)
        {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:112"));
            startActivity(intent);
        }
        else if (v==telefon2)
        {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:112"));
            startActivity(intent);
        }
        else if (v==telefon3)
        {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:112"));
            startActivity(intent);
        }

    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
