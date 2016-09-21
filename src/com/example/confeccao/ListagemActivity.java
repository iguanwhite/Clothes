package com.example.confeccao;


import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ListagemActivity extends ListActivity {

	final int BERMUDA = 0, CAMISETA = 1, TSHIRT = 2, PANTS = 3;

	String[] bermudas = { "Bermuda Solo", "Bermuda Cavalera" };

	String[] camisetas = { "Camiseta Adidas", "Camiseta Polo Vince" };

	String[] tshirts = { "Tshirt Fox", "Tshirt Vince", "Tshirt King" };

	String[] pants = { "Calça Fox", "Calça Vince" };
	
	int tipo = 0;
	String text = "";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.listagem);
		
		
		Bundle extras = getIntent().getExtras();
		if (extras != null) {
		    tipo = extras.getInt("TIPO");
		}

	

		if (tipo == BERMUDA) {
			this.setListAdapter(new ListAct(this, bermudas));
		}else if (tipo == CAMISETA) {
			this.setListAdapter(new ListAct(this, camisetas));
		}else if (tipo == TSHIRT) {
			this.setListAdapter(new ListAct(this, tshirts));
		}else if (tipo == PANTS) {
			this.setListAdapter(new ListAct(this, pants));
		}

	}

	// Call Back method to get the Message form other Activity
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		// check if the request code is same as what is passed here it is 2
		
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {

		
		 String m = (String) l.getItemAtPosition(position);
		
		acionarVisualizacao(m);

		// TODO Auto-generated method stub
		// super.onListItemClick(l, v, position, id);

		// TODO
		// Captura as mensagens do BD (Todas as mensagens). Para visualização.
		// MessageUtil.getInstance().acicionarMensagemLista(mensagem);

		// Mensagem m = (Mensagem) l.getItemAtPosition(position);
		//
		// LayoutInflater inflater = (LayoutInflater)
		// getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		// View rowView = inflater.inflate(R.layout.rowlayout, null);
		// TextView description = (TextView) rowView.findViewById(R.id.label);
		// description.setBackgroundColor(Color.GREEN);

		// ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
		// R.layout.rowlayout, R.id.label, mensagensTemp);
		//
		// setListAdapter(adapter);

		// mostrarMensagem(m.getData_msg().getHours() + ":"
		// + m.getData_msg().getMinutes() + " - " + m.getTexto_mensagem());
		//

		/*
		 * String selection = l.getItemAtPosition(position).toString();
		 * 
		 * // Codigo Temporario mostrar mensagem inteira
		 * 
		 * mostrarMensagem(completarMensagem(selection));
		 */
	}

	private void acionarVisualizacao(String m) {
		Intent intent = new Intent(getBaseContext(), VisualizacaoActivity.class);
		intent.putExtra("MODELO", m);
		startActivity(intent);
		overridePendingTransition(0,0);
		
		
	//	startActivity(new Intent(this, VisualizacaoActivity.class));
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


 class ListAct extends ArrayAdapter<String> {
	private final Context context;
	private final String[] values;
 
	public ListAct(Context context, String[] values) {
		super(context, R.layout.mylist, values);
		this.context = context;
		this.values = values;
	}
 
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context
			.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
 
		View rowView = inflater.inflate(R.layout.mylist, parent, false);
		TextView textView = (TextView) rowView.findViewById(R.id.Itemname);
		ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
		textView.setText(values[position]);
 
		// Change icon based on name
		String s = values[position];
		
	
 
		System.out.println(s);
		
		if (s.equals("Bermuda Solo")) {
			imageView.setImageResource(R.drawable.bermudas);
		} else if (s.equals("Bermuda Cavalera")) {
			imageView.setImageResource(R.drawable.bermuda1);
		} else if (s.equals("Camiseta Adidas")) {
			imageView.setImageResource(R.drawable.camiseta);
		}else if (s.equals("Camiseta Polo Vince")) {
			imageView.setImageResource(R.drawable.polo1);
		} else if (s.equals("Tshirt Fox")) {
			imageView.setImageResource(R.drawable.tshirt);
		}else if (s.equals("Tshirt Vince")) {
			imageView.setImageResource(R.drawable.tshirt1);
		} else if (s.equals("Tshirt King")) {
			imageView.setImageResource(R.drawable.tshirt2);
		}
		 else if (s.equals("Calça Fox")) {
				imageView.setImageResource(R.drawable.pants);
			} else if (s.equals("Calça Vince")) {
				imageView.setImageResource(R.drawable.pants1);
			}
 
		return rowView;
	}
}