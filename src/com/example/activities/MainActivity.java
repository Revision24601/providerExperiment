package com.example.activities;

import com.example.sample.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button mysteryButton = (Button) findViewById(R.id.button);

		mysteryButton.setOnClickListener(new Button.OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
//				Toast.makeText(getBaseContext(), "SILLEH", Toast.LENGTH_LONG)
//						.show();

				// SecondActivity.class.newInstance();
//				SecondActivity.newInstance(getBaseContext());
				Intent intent = new Intent(getBaseContext(),
						SecondActivity.class);
				startActivity(intent);
				// SecondActivit

			}
		});

		mysteryButton.setOnHoverListener(new View.OnHoverListener() {
			@Override
			public boolean onHover(View v, MotionEvent event) {
				Toast.makeText(getBaseContext(), "NO WAIT", Toast.LENGTH_SHORT)
						.show();
				switch (event.getAction()) {
				case MotionEvent.ACTION_HOVER_ENTER:
					Toast.makeText(getBaseContext(), "NO WAIT",
							Toast.LENGTH_SHORT).show();
					break;
				case MotionEvent.ACTION_HOVER_MOVE:
					Toast.makeText(getBaseContext(), "NO WAIT",
							Toast.LENGTH_SHORT).show();
					break;

				case MotionEvent.ACTION_HOVER_EXIT:
					Toast.makeText(getBaseContext(), "NO WAIT",
							Toast.LENGTH_SHORT).show();
					break;
				}
				return false;
			}
		});
	}

	// @Override
	// public void onClick(DialogInterface dialog, int which) {
	// // TODO Auto-generated method stub
	// Toast.makeText(this, "SILLEH", Toast.LENGTH_LONG).show();
	//
	// }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
