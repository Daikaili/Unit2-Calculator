package com.example.jisuanqi;

import com.example.jisuanqi.R;
import com.example.jisuanqi.R.id;
import com.example.jisuanqi.R.layout;
import com.example.jisuanqi.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class WelcomeActivity extends Activity {
	
	private static String TAG="WelcomActivity";
	
    Button btnWelcome;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);
		
		btnWelcome=(Button)this.findViewById(R.id.btnWelcome);
		btnWelcome.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(getApplicationContext(),WelcomeActivity.class);
				startActivity(intent);
				Log.d(TAG,"Æô¶¯activityµ½------WelcomeActivity");
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.welcome, menu);
		return true;
	}

}
