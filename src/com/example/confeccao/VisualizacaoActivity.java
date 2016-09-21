package com.example.confeccao;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;

public class VisualizacaoActivity extends Activity  {

	ImageView btnVisualizacao;

	String s = "";


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.visualizacao);

		btnVisualizacao = (ImageView) findViewById(R.id.btnVisualizacao);
		btnVisualizacao.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
				overridePendingTransition(0, 0);
			}
		});

		
		
		Bundle extras = getIntent().getExtras();
		if (extras != null) {
			s = extras.getString("MODELO");
		}

		if (s.equals("Bermuda Solo")) {
			btnVisualizacao.setImageResource(R.drawable.bermudas);
		} else if (s.equals("Bermuda Cavalera")) {
			btnVisualizacao.setImageResource(R.drawable.bermuda1);
		} else if (s.equals("Camiseta Adidas")) {
			btnVisualizacao.setImageResource(R.drawable.camiseta);
		} else if (s.equals("Camiseta Polo Vince")) {
			btnVisualizacao.setImageResource(R.drawable.polo1);
		} else if (s.equals("Tshirt Fox")) {
			btnVisualizacao.setImageResource(R.drawable.tshirt);
		} else if (s.equals("Tshirt Vince")) {
			btnVisualizacao.setImageResource(R.drawable.tshirt1);
		} else if (s.equals("Tshirt King")) {
			btnVisualizacao.setImageResource(R.drawable.tshirt2);
		} else if (s.equals("Calça Fox")) {
			btnVisualizacao.setImageResource(R.drawable.pants);
		} else if (s.equals("Calça Vince")) {
			btnVisualizacao.setImageResource(R.drawable.pants1);
		}

	}
	
	

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			finish();
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}
	
	
	
	
	
}
