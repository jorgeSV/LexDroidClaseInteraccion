package com.sovejo.lexdroidclaseinteraccion;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * @author JorgeSV
 *
 */
public class SegundaActivity extends Activity
{
	String strRecibir;
	TextView textView01;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.segunda_activity);
		
		textView01 = (TextView) findViewById(R.id.textView01);
		
		Bundle extras = getIntent().getExtras();
		if(extras != null)
		{
			strRecibir = extras.getString("strEnviar");
			textView01.setText(strRecibir);
		}
	}

}
