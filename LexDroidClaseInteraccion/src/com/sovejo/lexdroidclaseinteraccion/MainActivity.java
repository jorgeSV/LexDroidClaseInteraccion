package com.sovejo.lexdroidclaseinteraccion;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity implements OnClickListener
{
	Button boton01, boton02, boton03;
	TextView textView;
	EditText editText;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		boton01 = (Button) findViewById(R.id.boton01);
		textView = (TextView) findViewById(R.id.textView02);
		editText = (EditText) findViewById(R.id.editText01);
		boton02 = (Button) findViewById(R.id.boton02);
		boton03 = (Button) findViewById(R.id.boton03);
		
		boton01.setOnClickListener(this);
		boton02.setOnClickListener(this);
		boton03.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) 
	{
		// TODO Auto-generated method stub
		String strEditText = editText.getText().toString();
		
		switch (v.getId()) 
		{		
			case R.id.boton01:
				
				if(strEditText.length() > 0)
				{
					textView.setText(strEditText);
				}
				else
				{
					this.lanzaAviso();
				}
				
				break;
				
			case R.id.boton02:
				
				Toast toast02 = Toast.makeText(getApplicationContext(), R.string.hola_como_estas, Toast.LENGTH_SHORT);
				toast02.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
				toast02.show();
				
				break;

			case R.id.boton03:
				
				if(strEditText.length() > 0)
				{
					String strEnviar = editText.getText().toString();
					Intent intent01 = new Intent("android.intent.action.SEGUNDAACTIVIDAD"); //Se copia del manifest
					intent01.putExtra("strEnviar", strEnviar);
					startActivity(intent01);
				}
				else
				{
					this.lanzaAviso();
				}
				
				break;
				
			default:
				break;
		}
	}

	public void lanzaAviso()
	{
		Toast toast01 = Toast.makeText(getApplicationContext(), R.string.aviso_nombre_vacio, Toast.LENGTH_LONG);
		toast01.show();
	}
	
}
