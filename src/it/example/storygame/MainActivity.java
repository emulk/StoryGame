package it.example.storygame;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	Button Help;
	Button Read;
	Button About;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Help = (Button)findViewById(R.id.helpButton);
        Help.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent Helpintent = new Intent (MainActivity.this, Help.class);
				startActivity(Helpintent);
				
			}
		});
    
        
        Read= (Button)findViewById(R.id.readButton);
        Read.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent Readintent = new Intent(MainActivity.this, Read.class);
				startActivity(Readintent);
			}
		});
        
        
        
        About= (Button)findViewById(R.id.aboutButton);
        About.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent Aboutintent = new Intent(MainActivity.this, About.class);
				startActivity(Aboutintent);
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

