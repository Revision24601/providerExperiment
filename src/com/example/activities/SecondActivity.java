package com.example.activities;

import com.example.sample.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends Activity {
//
//	public static final void newInstance(final Context context) {
//		final Intent intent = new Intent(context, SecondActivity.class);
//		context.startActivity(intent);
//	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second_activity);
		Toast.makeText(this, "MEH", Toast.LENGTH_SHORT).show();
	}
	
	
	

}