package com.example.fragments;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.confeccao.ModaActivity;
import com.example.confeccao.R;

@SuppressLint("NewApi")
public class CatalogoFragment extends Fragment {


	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater
				.inflate(R.layout.catalogo_fra, container, false);
		

		
		
		
		
		 Intent intent = new Intent(getActivity(), ModaActivity.class);
         startActivity(intent);

		return rootView;
	}

}