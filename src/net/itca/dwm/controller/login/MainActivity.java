package net.itca.dwm.controller.login;

import net.itca.dwm.controller.home.Home;
import net.itca.dwm.controller.register.Register;
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

public class MainActivity extends Activity implements OnClickListener{
	
	Database database;
	String name;
	String pass;
	Button login;	
	Button register;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		database = new Database();
		
		EditText nameT = (EditText)findViewById(R.id.editText1); 
		name = nameT.getText().toString();
		
		EditText passT = (EditText)findViewById(R.id.editText2);
		pass = passT.getText().toString();
		
		login = (Button)findViewById(R.id.button1);
		register = (Button)findViewById(R.id.button2);
		login.setOnClickListener(this);
		register.setOnClickListener(this);
			
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
				
		switch (v.getId()) {
		case R.id.button1:
			
			//boolean succes  = facade.login(username, encrypt(pass));
			if(database.Login(name, pass)){
				Intent i = new Intent(this, Home.class);
				startActivity(i); 
			}
			
			break;
		case R.id.button2:
			
			Intent i = new Intent(this, Register.class);
			startActivity(i);
		
		default:
			break;
		}
	}
	
	
}
