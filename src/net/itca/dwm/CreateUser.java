package net.itca.dwm;

import net.itca.dwm.controller.LoginHomeController;
import net.itca.dwm.core.DineWithMeFacade;
import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class CreateUser extends Activity implements OnClickListener{
	
	DineWithMeFacade facade;
	String username;
	String password;
	String firstname;
	String lastname;
	Button create;	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		
		EditText usernameLabel = (EditText)findViewById(R.id.editText1);
		username = usernameLabel.getText().toString();
		
		EditText passwordLabel = (EditText)findViewById(R.id.editText2);
		password = passwordLabel.getText().toString();
		
		EditText firstLabel = (EditText)findViewById(R.id.editText3);
		firstname = firstLabel.getText().toString();
		
		EditText lastLabel = (EditText)findViewById(R.id.editText4);
		lastname = lastLabel.getText().toString();
		 		
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
		//facade.createUser(username, password, firstname, lastname);
		
/*		switch (v.getId()) {
		case R.id.button1:
					
			if(sucess == true){
				Intent i = new Intent(this, LoginHome.class);
				startActivity(i); 
			}
			
			break;
		
		default:
			break;
		}*/
	}
}
