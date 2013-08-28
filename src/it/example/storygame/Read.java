package it.example.storygame;

import android.os.Bundle;
import android.os.Vibrator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;


public class Read extends Activity {
	Button Indietro;
	Button story1;
	Button guerra;
	ImageView star;
	private RatingBar ratingBar;
	private RatingBar ratingBar2;
	private TextView txtRatingValue;
	private TextView txtRatingValue2;
	private Button btnSubmit;
	private Button btnSubmit2;
	
	   public boolean onOptionsItemSelected(MenuItem item) {
	       // Handle presses on the action bar items
	       switch (item.getItemId()) {
	           case R.id.screenon:
	        	   getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
	        	   Toast.makeText(getApplicationContext(), "Schermo Attivo", Toast.LENGTH_LONG).show();
	        	   Vibrator vb = (Vibrator)   getSystemService(Context.VIBRATOR_SERVICE);
		            vb.vibrate(100);
		            return true;
	         /*  case R.id.settings:
	        	   Toast.makeText(getApplicationContext(), "Impostazioni", Toast.LENGTH_LONG).show();
	        	   Vibrator sp = (Vibrator)   getSystemService(Context.VIBRATOR_SERVICE);
		            sp.vibrate(100);
		            return true;*/
	           default:
	              return true;
	       }
	   }
	  

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.read);
        addListenerOnRatingBar();
        addListenerOnButton();
        addListenerOnRatingBar2();
        addListenerOnButton2();
        //La prima gamestory del cavaliere oscuro
        story1=(Button)findViewById(R.id.story1);
        story1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent storyintent = new Intent(Read.this, story1.class);
				startActivity(storyintent);
				Vibrator vb = (Vibrator)   getSystemService(Context.VIBRATOR_SERVICE);
	            vb.vibrate(100);
				
			}
		});
        //la seconda game story: il continuo del cavaliere oscuro
        guerra=(Button)findViewById(R.id.guerra);
        guerra.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent guerraintent = new Intent(Read.this, Guerra.class);
				startActivity(guerraintent);
				Vibrator vb = (Vibrator)   getSystemService(Context.VIBRATOR_SERVICE);
	            vb.vibrate(100);
			}
		});
        
        /* star=(ImageView)findViewById(R.id.star1);
        star.setImageResource(R.drawable.button_focused);
        star.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				star=(ImageView)findViewById(R.id.star1);
				star.setImageResource(R.drawable.button_normal);
				
			}
		});*/
        Indietro= (Button)findViewById(R.id.Indietroread);
        Indietro.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent indietro = new Intent(Read.this, MainActivity.class);
				startActivity(indietro);
				Vibrator vb = (Vibrator)   getSystemService(Context.VIBRATOR_SERVICE);
	            vb.vibrate(100);
			}
		});
    }


   

    
    
    private void addListenerOnButton2() {
		// TODO Auto-generated method stub
    	ratingBar2 = (RatingBar) findViewById(R.id.ratingstory2);
    	btnSubmit2 = (Button) findViewById(R.id.btnSubmit2);
     
    	//if click on me, then display the current rating value.
    	btnSubmit2.setOnClickListener(new OnClickListener() {
     
    		@Override
    		public void onClick(View v) {
     
    			Toast.makeText(Read.this,
    				String.valueOf(ratingBar2.getRating()),
    					Toast.LENGTH_SHORT).show();
     
    		}
     
    	});
		
	}






	private void addListenerOnRatingBar2() {
		// TODO Auto-generated method stub
		ratingBar2 = (RatingBar) findViewById(R.id.ratingstory2);
    	txtRatingValue2 = (TextView) findViewById(R.id.txtRatingValue2);
     
    	//se cambia il valore della votazione
    	//viene visualizzato il nuovo valore nella textview
    	ratingBar2.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
    		public void onRatingChanged(RatingBar ratingBar, float rating,
    			boolean fromUser) {
     
    			txtRatingValue2.setText(String.valueOf(rating));
     
    		}
    	});
		
	}






	public void addListenerOnRatingBar() {
    	 
    	ratingBar = (RatingBar) findViewById(R.id.ratingstory1);
    	txtRatingValue = (TextView) findViewById(R.id.txtRatingValue);
     
    	//se cambia il valore della votazione
    	//viene visualizzato il nuovo valore nella textview
    	ratingBar.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
    		public void onRatingChanged(RatingBar ratingBar, float rating,
    			boolean fromUser) {
     
    			txtRatingValue.setText(String.valueOf(rating));
     
    		}
    	});
      }
     
      public void addListenerOnButton() {
     
    	ratingBar = (RatingBar) findViewById(R.id.ratingstory1);
    	btnSubmit = (Button) findViewById(R.id.btnSubmit);
     
    	//if click on me, then display the current rating value.
    	btnSubmit.setOnClickListener(new OnClickListener() {
     
    		@Override
    		public void onClick(View v) {
     
    			Toast.makeText(Read.this,
    				String.valueOf(ratingBar.getRating()),
    					Toast.LENGTH_SHORT).show();
     
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
