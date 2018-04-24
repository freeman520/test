package com.example.app100;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {
	private static AppSetting as;
	private MyApp ma;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
//		as=AppSetting.getAppSetting(this);
//		Log.i("Msg", "Main as= "+as);
		
		ma= (MyApp) getApplication();
		
		Log.i("Msg", "Main as= "+ma.getAs());
	}

	public void btClick(View v){
		Intent intent =new Intent(this,SecondActivity.class);
		startActivity(intent);
	}

}
