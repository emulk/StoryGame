package it.example.storygame;

import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;


public class About extends Activity {
	Button Indietro;
	Button Sito;
	
	
	   public boolean onOptionsItemSelected(MenuItem item) {
	       // Handle presses on the action bar items
	       switch (item.getItemId()) {
	           case R.id.screenon:
	        	   getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
	        	   Toast.makeText(getApplicationContext(), "Schermo Attivo", Toast.LENGTH_LONG).show();
	        	   Vibrator vb = (Vibrator)   getSystemService(Context.VIBRATOR_SERVICE);
		            vb.vibrate(100);
		            return true;
	           case R.id.settings:
	        	   Toast.makeText(getApplicationContext(), "Impostazioni", Toast.LENGTH_LONG).show();
	        	   Vibrator sp = (Vibrator)   getSystemService(Context.VIBRATOR_SERVICE);
		            sp.vibrate(100);
		            return true;
	           default:
	              return true;
	       }
	   }
	  
	
	
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
