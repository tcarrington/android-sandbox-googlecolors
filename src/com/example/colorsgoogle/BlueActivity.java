package com.example.colorsgoogle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class BlueActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_blue);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.blue, menu);
		return true;
	}
	public void bluepage(View view){
		Intent intent = new Intent(this, BlueActivity.class);
		startActivity(intent);
	}
	public void redpage(View view){
		Intent intent = new Intent(this, RedActivity.class);
		startActivity(intent);
	}
	public void greenpage(View view){
		Intent intent = new Intent(this, GreenActivity.class);
		startActivity(intent);
	}
	public void yellowpage(View view){
		Intent intent = new Intent(this, YellowActivity.class);
		startActivity(intent);
	}
	public void homepage(View view){
		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);
	}
}
