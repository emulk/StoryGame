package it.example.storygame;

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

public class MainActivity extends Activity {
	Button Help;
	Button Read;
	Button About;
	Button screen;
	//Button screenon;
	
	
	
	
	   
	   
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
        setContentView(R.layout.activity_main);
        //getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        /*
        screenon = (Button)findViewById(R.id.screenon);
        screenon.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
			}
		});
        */
        
        
        Help = (Button)findViewById(R.id.helpButton);
        Help.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent Helpintent = new Intent (MainActivity.this, Help.class);
				startActivity(Helpintent);
				 Vibrator vb = (Vibrator)   getSystemService(Context.VIBRATOR_SERVICE);
		            vb.vibrate(100);
		            //Toast.makeText(getApplicationContext(), "Help", Toast.LENGTH_LONG).show();
				
			}
		});
    
        
        Read= (Button)findViewById(R.id.readButton);
        Read.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent Readintent = new Intent(MainActivity.this, Read.class);
				startActivity(Readintent);
				Vibrator vb = (Vibrator)   getSystemService(Context.VIBRATOR_SERVICE);
	            vb.vibrate(100);
			}
		});
        
        
        
        About= (Button)findViewById(R.id.aboutButton);
        About.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent Aboutintent = new Intent(MainActivity.this, About.class);
				startActivity(Aboutintent);
				Vibrator vb = (Vibrator)   getSystemService(Context.VIBRATOR_SERVICE);
	            vb.vibrate(100);
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

