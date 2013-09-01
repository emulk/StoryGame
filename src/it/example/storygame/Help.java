package it.example.storygame;


import android.os.Bundle;

import android.os.Vibrator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import android.widget.TextView;

public class Help extends Activity {
	Button Indietro;
	TextView textview;
	
	   public boolean onOptionsItemSelected(MenuItem item) {
	       // Handle presses on the action bar items
	       switch (item.getItemId()) {
	           case R.id.screenon:
	        	   getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
	        	   Toast.makeText(getApplicationContext(), "Schermo Attivo", Toast.LENGTH_LONG).show();
	        	   Vibrator vb = (Vibrator)   getSystemService(Context.VIBRATOR_SERVICE);
		            vb.vibrate(100);
	           case R.id.help:
		   			Intent Helpintent = new Intent (Help.this, Help.class);
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
        setContentView(R.layout.help);
        
        
        
   
		textview=(TextView)findViewById(R.id.helpstory);
		textview.setMovementMethod(new ScrollingMovementMethod());
		textview.setText("Un librogame o anche o libro-gioco è un'opera narrativa che invece di essere letta linearmente dall'inizio alla fine" +
				" presenta alcune possibili alternative mediante l'uso di paragrafi o pagine numerate." +
				"\n Lettori diversi (o la stessa persona in occasione di una rilettura) potranno compiere scelte diverse e ciò condizionerà lo svolgimento e la fine della trama." +
				"\nNormalmente un librogame si presenta come un libro diviso in sezioni numerate che terminano con una serie di opzioni che presentano le scelte che il lettore può prendere in quel punto; " +
				"ad ogni opzione corrisponde il numero del paragrafo con cui si dovrà proseguire la lettura. Il lettore raggiunge infine un paragrafo conclusivo che porta a termine la storia. Nella" +
				" maggior parte dei librogame solo uno dei paragrafi si conclude con il \"successo\" del giocatore, mentre negli altri si conclude con un \"fallimento\"");
        
        Indietro = (Button)findViewById(R.id.read);
        Indietro.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
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
