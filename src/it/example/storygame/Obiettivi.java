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


public class Obiettivi extends Activity {
	Button Indietro;
	Button Obiettivo1;
	Button Obiettivo2;
	Button Obiettivo3;
	Button Obiettivo4;
	Button Obiettivo5;
	Button Obiettivo6;
	Button Obiettivo7;
	Button Obiettivo8;
	Button Obiettivo9;
	Button Obiettivo10;
	Button Obiettivo11;
	int obi=5;
	
	
	   public boolean onOptionsItemSelected(MenuItem item) {
	       // Handle presses on the action bar items
	       switch (item.getItemId()) {
	           case R.id.screenon:
	        	   getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
	        	   Toast.makeText(getApplicationContext(), "Schermo Attivo", Toast.LENGTH_LONG).show();
	        	   Vibrator vb = (Vibrator)   getSystemService(Context.VIBRATOR_SERVICE);
		            vb.vibrate(100);
		            return true;
		            
	           case R.id.help:
	   			Intent Helpintent = new Intent (Obiettivi.this, Help.class);
				startActivity(Helpintent);           
			   Toast.makeText(getApplicationContext(), "Aiuto", Toast.LENGTH_LONG).show();
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
        setContentView(R.layout.obiettivi);
        
       
       /*
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
        */
        
        Obiettivo1=(Button)findViewById(R.id.obiettivo1);
        Obiettivo2=(Button)findViewById(R.id.obiettivo2);
        Obiettivo3=(Button)findViewById(R.id.obiettivo3);
        Obiettivo4=(Button)findViewById(R.id.obiettivo4);
        Obiettivo5=(Button)findViewById(R.id.obiettivo5);
        Obiettivo6=(Button)findViewById(R.id.obiettivo6);
        Obiettivo7=(Button)findViewById(R.id.obiettivo7);
        Obiettivo8=(Button)findViewById(R.id.obiettivo8);
        Obiettivo9=(Button)findViewById(R.id.obiettivo9);
        Obiettivo10=(Button)findViewById(R.id.obiettivo10);
        Obiettivo11=(Button)findViewById(R.id.obiettivo11);
        Obiettivo1.setVisibility(View.INVISIBLE);
        Obiettivo2.setVisibility(View.INVISIBLE);
        Obiettivo3.setVisibility(View.INVISIBLE);
        Obiettivo4.setVisibility(View.INVISIBLE);
        Obiettivo5.setVisibility(View.INVISIBLE);
        Obiettivo6.setVisibility(View.INVISIBLE);
        Obiettivo7.setVisibility(View.INVISIBLE);
        Obiettivo8.setVisibility(View.INVISIBLE);
        Obiettivo9.setVisibility(View.INVISIBLE);
        Obiettivo10.setVisibility(View.INVISIBLE);
        Obiettivo11.setVisibility(View.INVISIBLE);
        if(obi>0){
			Obiettivo1.setVisibility(View.VISIBLE);
		} 
        if(obi>1){
			Obiettivo2.setVisibility(View.VISIBLE);
		}
        if(obi>2){
			Obiettivo3.setVisibility(View.VISIBLE);
		}
        if(obi>3){
			Obiettivo4.setVisibility(View.VISIBLE);
		}
        if(obi>4){
			Obiettivo5.setVisibility(View.VISIBLE);
		}
        if(obi>5){
			Obiettivo6.setVisibility(View.VISIBLE);
		}
        if(obi>6){
			Obiettivo7.setVisibility(View.VISIBLE);
		}
        if(obi>7){
			Obiettivo8.setVisibility(View.VISIBLE);
		}
        if(obi>8){
			Obiettivo9.setVisibility(View.VISIBLE);
		}
        if(obi>9){
			Obiettivo10.setVisibility(View.VISIBLE);
		}
        if(obi>10){
			Obiettivo11.setVisibility(View.VISIBLE);
		}
       
        
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
     
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
