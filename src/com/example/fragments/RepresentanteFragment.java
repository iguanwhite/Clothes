package com.example.fragments;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.confeccao.MapaActivity;
import com.example.confeccao.ModaActivity;
import com.example.confeccao.R;

@SuppressLint("NewApi")
public class RepresentanteFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater
				.inflate(R.layout.representante_fra, container, false);
		
		

		 Intent intent = new Intent(getActivity(), MapaActivity.class);
        startActivity(intent);


		return rootView;
	}

}