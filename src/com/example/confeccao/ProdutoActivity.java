package com.example.confeccao;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;

public class ProdutoActivity extends Activity {
	
	ImageView btnBermudas, btnCamiseta, btnTshirt, btnCalca;
	
	final int BERMUDA = 0, CAMISETA = 1, TSHIRT = 2, PANTS = 3; 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.produto);
		
		btnBermudas = (ImageView) findViewById(R.id.btnBermudas);
		btnBermudas.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				acionarTelaListagem(BERMUDA);
			}
		});
		
		
		btnCamiseta = (ImageView) findViewById(R.id.btnCamiseta);
		btnCamiseta.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				acionarTelaListagem(CAMISETA);
			}
		});
		
		
		btnTshirt = (ImageView) findViewById(R.id.btnTshirt);
		btnTshirt.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				acionarTelaListagem(TSHIRT);
			}
		});
		
		
		btnCalca = (ImageView) findViewById(R.id.btnCalca);
		btnCalca.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				acionarTelaListagem(PANTS);
			}
		});
		
	}
	
	
	
	
	private void acionarTelaListagem(int btn) {
		
		Intent intent = new Intent(getBaseContext(), ListagemActivity.class);
		intent.putExtra("TIPO", btn);
		startActivity(intent);
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
