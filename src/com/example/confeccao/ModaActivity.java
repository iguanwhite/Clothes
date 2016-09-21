package com.example.confeccao;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;



public class ModaActivity extends FragmentActivity {
	
	ImageView btnMasculino, btnFeminino;
	



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.moda);
		
		
		btnMasculino = (ImageView) findViewById(R.id.buttonMasc);
		btnMasculino.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				acionarTelaProduto();
			}
		});
		
		btnFeminino = (ImageView) findViewById(R.id.buttonFem);
		btnFeminino.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				acionarTelaProduto();
			}
		});
		
		
		
		
		
		
		
	}
	
	
	
	private void acionarTelaProduto() {
		startActivity(new Intent(this, ProdutoActivity.class));
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
