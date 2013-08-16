package it.example.storygame;

import android.os.Bundle;
import android.os.Vibrator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class Read extends Activity {
	Button Indietro;
	Button story1;
	Button guerra;
	ImageView star;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.read);
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


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
