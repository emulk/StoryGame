package it.example.storygame;

import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import android.view.Menu;
import android.view.View;
import android.widget.Button;


public class About extends Activity {
	Button Indietro;
	Button Sito;
	
	

	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        
       
       
        Indietro= (Button)findViewById(R.id.indietro);
        Indietro.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Vibrator vb = (Vibrator)   getSystemService(Context.VIBRATOR_SERVICE);
	            vb.vibrate(100);
				finish();
			}
		});
        
     
        Sito= (Button)findViewById(R.id.sito);
        Sito.setOnClickListener(new View.OnClickListener() {
       
       // String uri="http://shehaj.altervista.org/chisono/chisono.html";
		Intent sitointent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://shehaj.altervista.org/chisono/chisono.html"));
		//Uri.parse("[url=http://www.google.com]Google[/url]")
		
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Vibrator vb = (Vibrator)   getSystemService(Context.VIBRATOR_SERVICE);
	            vb.vibrate(100);
				 startActivity( sitointent );
				
			}
		});
       
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
