package com.example.app100;

import android.app.Application;

public class MyApp extends Application {
	private static AppSetting as;

	public AppSetting getAs() {
		return as;
	}

	public void setAs(AppSetting as) {
		this.as = as;
	}
	
	
}
