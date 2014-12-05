package net.itca.dwm.controller.register;

import net.itca.dwm.controller.home.Home;
import net.itca.dwm.data.Database;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import app.dine.login.R;
import app.dine.login.R.id;
import app.dine.login.R.layout;
import app.dine.login.R.menu;

public class Register extends Activity implements OnClickListener{
	
	String username;
	String pass;
	String firstname;
	String lastname;
	Button create;	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		EditText user = (EditText)findViewById(R.id.editText1);
		username = user.getText().toString();
		
		EditText password = (EditText)findViewById(R.id.editText2);
		pass = password.getText().toString();
		
		EditText firstN = (EditText)findViewById(R.id.editText3);
		firstname = firstN.getText().toString();
		
		EditText lastN = (EditText)findViewById(R.id.editText4);
		lastname = lastN.getText().toString();
		 		
		create = (Button)findViewById(R.id.button1);
		create.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.register, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		//boolean succes  = facade.login(username, encrypt(pass));
		switch (v.getId()) {
		case R.id.button1:
			 
			
			if(username.equals("a") && pass.equals("a")){
				Intent i = new Intent(this, Home.class);
				startActivity(i); 
			}
			
			break;
		
		default:
			break;
		}
	}
}
