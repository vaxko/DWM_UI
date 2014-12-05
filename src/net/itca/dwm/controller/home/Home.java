package net.itca.dwm.controller.home;

import net.itca.dwm.controller.Menu.FlyOutContainer;
import net.itca.dwm.controller.events.Events;
import net.itca.dwm.controller.friends.Friends;
import net.itca.dwm.controller.login.MainActivity;
import net.itca.dwm.controller.recipes.Recipes;
import net.itca.dwm.controller.register.Register;
import net.itca.dwm.controller.shoppinglist.ShoppingList;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import app.dine.login.R;
import app.dine.login.R.id;
import app.dine.login.R.layout;
import app.dine.login.R.menu;

public class Home extends Activity implements OnClickListener {

	FlyOutContainer root;
	Button home;
	Button friends;
	Button shopL;
	Button event;
	Button recipes;
	Button logout;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		this.root = (FlyOutContainer) this.getLayoutInflater().inflate(R.layout.activity_home, null);
		
		this.setContentView(root);
		
		home = (Button)findViewById(R.id.home);
		home.setOnClickListener(this);
		
		friends = (Button)findViewById(R.id.friends);
		friends.setOnClickListener(this);
		
		shopL = (Button)findViewById(R.id.shopL);
		shopL.setOnClickListener(this);
		
		event = (Button)findViewById(R.id.event);
		event.setOnClickListener(this);
		
		recipes = (Button)findViewById(R.id.recipes);
		recipes.setOnClickListener(this);
		
		logout = (Button)findViewById(R.id.logout);
		logout.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
		return true;
	}
	
	public void toggleMenu(View v){
		this.root.toggleMenu();
	}
	
/*	@Override
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
*/

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.home:
				Intent home = new Intent(this, Home.class);
				startActivity(home); 
			
			break;
		case R.id.friends:			
			Intent friends = new Intent(this, Friends.class);
			startActivity(friends);
			
			break;
		case R.id.shopL:
			Intent shopL = new Intent(this, ShoppingList.class);
			startActivity(shopL);
			
			break;
			
		case R.id.event:
			Intent event = new Intent(this, Events.class);
			startActivity(event);
			
			break;
			
		case R.id.recipes:
			Intent recipes = new Intent(this, Recipes.class);
			startActivity(recipes);
			
			break;
		case R.id.logout:
			Intent logout = new Intent(this, MainActivity.class);
			startActivity(logout);
	
			
		default:
			break;
		}
	}


}
