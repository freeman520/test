package com.example.app100;

import android.content.Context;
import android.util.Log;

public class AppSetting {
	private static AppSetting as;
	private Context ctx;
	private AppSetting(Context ctx){
		this.ctx=ctx;
		
	}
	public static AppSetting getAppSetting(Context ctx){
		if(as==null)
			as =new AppSetting(ctx);
		Log.i("Msg", "AppSetting as="+as +", ctx="+ctx);			
		return as;
	}
}
