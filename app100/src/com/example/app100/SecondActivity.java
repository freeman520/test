package com.example.app100;

import java.lang.ref.WeakReference;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class SecondActivity extends Activity {
	private static Info sInfo;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		Log.i("Msg", "Second create");
		if (sInfo == null) {
            sInfo = new Info(this);
            System.out.println(sInfo);
        }
	}
	
	class Info {
		private WeakReference<MainActivity> activityWeakReference;
		
	    public Info(Activity activity) {
	    }
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.i("Msg", "Second destroy");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
		return true;
	}

}
