package com.example.masvistas;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MasVistasActivity extends Activity {

	private EditText entrada;
	private TextView salida;
	  
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mas_vistas);
		
		entrada = (EditText) findViewById(R.id.entrada);
		salida = (TextView)  findViewById(R.id.salida);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mas_vistas, menu);
		return true;
	}
	
	public void sePulsa(View view){
		Toast.makeText(this, "Pulsado", Toast.LENGTH_SHORT).show();
	}

	public void sePulsa0(View view){
		entrada.setText(entrada.getText()+(String)view.getTag());
	}
}
