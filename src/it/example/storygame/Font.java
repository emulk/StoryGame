package it.example.storygame;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;

import android.widget.TextView;

public class Font extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(R.layout.about);
		TextView tv = (TextView) findViewById(R.id.creato);
		/*Typeface face = Typeface.createFromAsset(getAssets(),"fonts/CHOCD.otf");
		tv.setTypeface(face);
		tv = (TextView) findViewById(R.id.myfontfile2);
		face = Typeface.createFromAsset(getAssets(),"fonts/ABADDON.TTF");
		tv.setTypeface(face);
		tv = (TextView) findViewById(R.id.myfontfile3);
		face = Typeface.createFromAsset(getAssets(),"fonts/ANGEL.otf");
		tv.setTypeface(face);
		tv = (TextView) findViewById(R.id.myfontfile4);
		face = Typeface.createFromAsset(getAssets(),"fonts/NorthernTerritories.ttf");
		tv.setTypeface(face);
		tv = (TextView) findViewById(R.id.myfontfile5);*/
		Typeface face = Typeface.createFromAsset(getAssets(),"fonts/WoodWud.ttf");
		tv.setTypeface(face);
	}
}