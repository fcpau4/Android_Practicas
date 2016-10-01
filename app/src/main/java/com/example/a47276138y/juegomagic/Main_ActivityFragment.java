package com.example.a47276138y.juegomagic;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A placeholder fragment containing a simple view.
 */
public class Main_ActivityFragment extends Fragment {

    private Button btCenAba;
    private Button btCenArr;

    private Button btPuntoMasU;
    private Button btPuntoMenosU;
    private Button btVidaMasU;
    private Button btVidaMenosU;
    private Button btVidaMasD;
    private Button btVidaMenosD;
    private Button btPuntoMasD;
    private Button btPuntoMenosD;

    public Main_ActivityFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragment = inflater.inflate(R.layout.fragment_main_, container, false);

        //Troba la id per a cada botó
        btCenArr = (Button) fragment.findViewById(R.id.btCentralU);
        btCenAba = (Button) fragment.findViewById(R.id.btCentralD);

        btPuntoMasU = (Button) fragment.findViewById(R.id.btAddP);
        btPuntoMenosU= (Button) fragment.findViewById(R.id.btSubP);
        btVidaMasU = (Button) fragment.findViewById(R.id.btAddL);
        btVidaMenosU=(Button) fragment.findViewById(R.id.btSubL);

        btVidaMasD=(Button) fragment.findViewById(R.id.btAddLD);
        btVidaMenosD=(Button) fragment.findViewById(R.id.btSubLD);
        btPuntoMasD=(Button) fragment.findViewById(R.id.btAddPD);
        btPuntoMenosD=(Button) fragment.findViewById(R.id.btSubPD);

        

        return fragment;
    }
}
