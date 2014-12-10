package net.itca.dwm;


import net.itca.dwm.core.DineWithMeFacade;
import net.itca.dwm.data.Database;
import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Login extends Activity implements OnClickListener{

	DineWithMeFacade facade;
	Database database;
	String username;
	String password;
	Button login;	
	Button register;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login_panel);
		
		EditText usernameLabel = (EditText)findViewById(R.id.editText1); 
		username = usernameLabel.getText().toString();
		
		EditText passwordLabel = (EditText)findViewById(R.id.editText2);
		password = passwordLabel.getText().toString();
		
		login = (Button)findViewById(R.id.button1);
		register = (Button)findViewById(R.id.button2);
		login.setOnClickListener(this);
		register.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login_panel, menu);
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
			
			boolean sucess  = facade.login(username, facade.encrypt(password));
			
			if(sucess == true){
				Intent i = new Intent(this, LoginHome.class);
				startActivity(i); 
			}
			
			break;
		case R.id.button2:
			
			Intent i = new Intent(this, CreateUser.class);
			startActivity(i);
		
		default:
			break;
		}
	}
}
