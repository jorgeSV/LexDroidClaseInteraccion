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

public class MainActivity extends Activity implements OnClickListener
{
	Button boton01, boton02;
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
		
		boton01.setOnClickListener(this);
		boton02.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) 
	{
		// TODO Auto-generated method stub
		switch (v.getId()) 
		{
			case R.id.boton01:
				String strEditText = editText.getText().toString();
				
				if(strEditText.length() > 0)
				{
					textView.setText(strEditText);
				}
				else
				{
					Toast toast01 = Toast.makeText(getApplicationContext(), R.string.aviso_nombre_vacio, Toast.LENGTH_LONG);
					toast01.show();
				}
				
				break;
				
			case R.id.boton02:
				
				Toast toast02 = Toast.makeText(getApplicationContext(), R.string.hola_como_estas, Toast.LENGTH_SHORT);
				toast02.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
				toast02.show();
				
				break;

			default:
				break;
		}
	}

	
	
}
