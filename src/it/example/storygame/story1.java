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
import android.widget.TextView;
import android.widget.Toast;

public class story1 extends Activity {
	
	TextView textview;
	Button avanti;
	Button second;
	int obbiettivi_s1=0;
	
	
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
		   			Intent Helpintent = new Intent (story1.this, Help.class);
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
		setContentView(R.layout.story1);
		
		Intent obiettiviIntent = new Intent();
		
		second = (Button)findViewById(R.id.indietro);
		second.setVisibility(View.INVISIBLE);
		
		//inizio
		textview = (TextView) findViewById(R.id.story1);
		//textview.setVerticalScrollBarEnabled(true);
		//textview.setScroller(new Scroller(myContext)); 
		//textview.setMaxLines(100); 
		//textview.setVerticalScrollBarEnabled(true); 
		//textview.setMovementMethod(new ScrollingMovementMethod()); 
		textview.setMovementMethod(new ScrollingMovementMethod());
		textview.setText("Questo è un giorno come tutti gli altri nelle Terre Tormentate. Sono passati 4 mesi ormai da quando \"I Signori delle Tenebre\" hanno dichiarato "
		+"guerra al mio paese. Le prime luci dell'alba iniziano a intravedersi all'orizzonte e tra poco la grande campana d'oro inizierà a emettere un "
		+"suono assordante come fa ogni mattina e indicherà ad ogni guerriero di questo paese che è tempo di addestramento."
		+"Sono passati tre anni da quando sono entrato a fare parte dell' esercito reale, e sono stato promosso come \"Cavaliere\" delle Terre Tormentate, "
		+"quando riuscii a dimostrare, come ogni uomo dovrebbe fare, il mio coraggio nelle tre Arti della Guerra per avere l'onore di farsi "
		+"chiamare \"Guerriero\". Ho imparato l'arte della guerra che molti riconoscono con il nome di \"controllo animale\" grazie alla mia amatissima "
		+"madre che era l'alchimista piu' conosciuta e rispettata di tutto il villaggio. Ora, ogni volta che mi alleno sono capace di comunicare "
		+"con molti animali che mi informano delle posizioni dei nemici e mi danno dei preziosissimi consigli. Ed è stato sempre grazie a " 
		+"lei, che all'eta di 7 anni mi ha  insegnato l'arte della \"Divinazione\", che ora riesco a capire le vere intenzioni della persona che ho di "
		+"fronte e riesco a comunicare telepaticamente con ogni creatura che e' dotata di capacità psichiche. E per il mio dodicesimo compleanno " 
		+"la mia amata madre mi insegno' l'arte della \"Sparizione\".... Questa tecnica mi permette di adattarmi all'ambiente circostante e mi rende capace "
		+"di mascherare l'odore e il calore del mio corpo rendendomi invisibile agli occhi di tutti.");
				
		
		//obbiettivo 1: leggere una storia
		
		//obiettiviIntent.setClassName("story1.this", "Obiettivi.class");
		//obiettiviIntent.putExtra("obiettivi", (int)1);
		//obiettiviIntent.putExtra("LongValue", (int)-80142777);
		final Intent theIntent = new Intent(this, Obiettivi.class);
		theIntent.putExtra("score", 1);  
		startActivity(theIntent);
		
		
		 avanti = (Button)findViewById(R.id.avanti);
		 avanti.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				
				//seconda schermata
				textview = (TextView) findViewById(R.id.story1);
				textview.setText("Mi alzo in piedi per preparare la mia borsa e partire come ogni giorno ormai da tre lunghissimi anni per il" +
						" campo d'addestramento. Guardo fuori dalla finestra e l'atmosfera è stranamente silenziosa, la brina del mattino luccica " +
						"sui merli delle torri, l'aria è pungente. " );
				
				//1 prima scelta
				avanti.setText("Ritorna a dormire");
				avanti.setOnClickListener(new View.OnClickListener() {
						
						@Override
						public void onClick(View v) {
							
							
							
							textview = (TextView) findViewById(R.id.story1);
							textview.setText("Dopo tre ore di sonno vengo svegliato dal rumore assordante che la porta produce cadendo per terra e " +
									"frantumandosi in mille pezzi. In controluce appare la faccia di un assassino, era li per derubarmi." +
									" A 40 centimetri alla destra del letto c'era la finestra aperta che da sul lago, mentre sopra la sedia " +
									"sulla mia sinistra luccicava l'argento della spada che avevo ereditato dal mio defunto padre. " );
							
							avanti.setText("Buttati dalla finestra!");
							avanti.setOnClickListener(new View.OnClickListener() {
								
								@Override
								public void onClick(View v) {
									
									// TODO Auto-generated method stub
									
									textview.setBackgroundResource(R.drawable.death);
									
									textview = (TextView) findViewById(R.id.story1);
									textview.setText("Mi alzo di colpo e mi lancio nel vuoto attraverso la finestra. Cado per tre metri e cado in piedi " +
											"per poi sbattere violentemente il ginochio destro per terra e procurarmi una ferita che iniziò a" +
											" sanguinare. Mi rialzo, senza pensare alla ferita e inizio a correre all'impazata, l'assasino mi" +
											" corre dietro con un coltello in mano. All'orizzonte vedo una guardia reale in servizio e inizio a gridare " +
											"con tutto il fiato che mi era rimasto. La guardia si accorge di me e inizia a corrermi incontro, tira fuori" +
											" il suo arco e scocca una freccia con la quale trapassa il cranio dell'assassino. Io vengo ricorso e" +
											" tranquillizzato ma poche ore dopo vengo raggiunto dal mio comandante il quale mi da la brutta notizia che" +
											" a causa del mio disonore per la cavalleria ero stato escluso dall'esercito. Torno a casa e inizio a pensare " +
											" al disonore che avevo causato alla mia famiglia. Mi rendo conto che tutto quel disonore era troppo " +
											"grande da sopportare, prendo una corda e decido di impiccarmi.");
									
									//obbiettivo 2: morire almeno una volta
									theIntent.putExtra("score", 2);
									startActivity(theIntent);
									avanti.setText("Fine!");
									avanti.setOnClickListener(new View.OnClickListener() {
										
										@Override
										public void onClick(View v) {
											// TODO Auto-generated method stub
											finish();
											
										}
									});
									second.setVisibility(View.INVISIBLE);
									
									
									
								}
							});
							
							second.setVisibility(View.VISIBLE);
							second.setText("Afferra la spada!");
							second.setOnClickListener(new View.OnClickListener() {
								
								@Override
								public void onClick(View v) {
									// TODO Auto-generated method stub
									
									textview = (TextView) findViewById(R.id.story1);
									textview.setText("Affero la spada e tiro un primo fendente all'assassino staccandogli la testa dal corpo, il sangue schizza" +
											" dappertutto e quattro corone d'oro cadono dalle tasche dell'assasino rotolando per terra.");
									//obbiettivo 3: trova la spada
									theIntent.putExtra("score", 3); 
									startActivity(theIntent);
								avanti.setText("Sbarazzati del corpo!");
								avanti.setOnClickListener(new View.OnClickListener() {
									
									@Override
									public void onClick(View v) {
										
										textview = (TextView)findViewById(R.id.story1);
										textview.setText("Scendo nella stalla e afferro un sacco, all' interno del quale ci inserisco il cadavere dell'assassino.");
										
										
										avanti.setText("Butta il cadavere nel lago!");
										avanti.setOnClickListener(new View.OnClickListener() {
											
											@Override
											public void onClick(View v) {
												// TODO Auto-generated method stub
												
												textview=(TextView)findViewById(R.id.story1);
												textview.setText("Carico il cadavere sulle spalle e lo porto fino alla riva del lago per poi buttarlo all' interno. " +
														"Rimango in piedi a fissarlo per più di 10 minuti finchè il sacco sparisce sott'acqua e decido di ritornare nell'appartamento.");
												
												avanti.setText("Pulisci la stanza!");
												avanti.setOnClickListener(new View.OnClickListener() {
													
													@Override
													public void onClick(View v) {
														// TODO Vai al 6
														textview=(TextView)findViewById(R.id.story1);
														textview.setText("Scendo al lago sottostante e riempio un barilotto con l'acqua limpida" +
																" che si trova al suo interno, ritono nella mia camera e inizio a pulire il sangue che aveva macchiato ogni cosa." +
																" Una volta finito la stanza splendeva come non mai, ma davanti alla porta giaceva per terra il cadavere freddo e" +
																" senza vita dell'assassino e come se non bastasse sono di parecchie ore in ritardo per l'addestramento.");
														
														
														second.setText("Parti per l'addestramento!");
														second.setOnClickListener(new View.OnClickListener() {
															
															@Override
															public void onClick(View v) {
																// TODO an other activity
																Intent second = new Intent (story1.this, partenzza.class);
																startActivity(second);
															}
														});
													}
												});
												
												avanti.setVisibility(View.INVISIBLE);
												second.setText("Parti per l'addestramento!");
												theIntent.putExtra("score", 4);
												startActivity(theIntent);
												second.setOnClickListener(new View.OnClickListener() {
													
													//obbiettivo 4:la vita continua
													
													@Override
													public void onClick(View v) {
														// TODO an other activity
														Intent second = new Intent (story1.this, partenzza.class);
														startActivity(second);
													}
												});
											}
										});
										
										second.setText("Porta il cadavere nel bosco per sotterrarlo!");
										second.setOnClickListener(new View.OnClickListener() {
											
											@Override
											public void onClick(View v) {
												// TODO Auto-generated method stub
												textview=(TextView)findViewById(R.id.story1);
												textview.setText("Afferro il sacco con forza e lo carico sopra il cavallo, salgo in groppa e parto in direzzione del bosco." +
														" Scendo a cavallo per il ripido sentiero che si inoltra nella foresta di Freylund, mi inoltro al suo interno e " +
														" in prossimità di un dirupo mi fermo per poi buttare al suo interno il sacco");
												//obbiettivo 5: assassino
												theIntent.putExtra("score", 5);
												startActivity(theIntent);
												avanti.setVisibility(View.INVISIBLE);
												second.setText("Parti per l'addestramento!");
												second.setOnClickListener(new View.OnClickListener() {
													
													@Override
													public void onClick(View v) {
														// TODO an other activity
														Intent second = new Intent (story1.this, partenzza.class);
														startActivity(second);
													}
												});
												
											}
										});
										
									}
								});
								
								second.setText("Parti per l'addestramento!");
								second.setOnClickListener(new View.OnClickListener() {
									
									@Override
									public void onClick(View v) {
										// TODO an other activity
										Intent second = new Intent (story1.this, partenzza.class);
										startActivity(second);
									}
								});
								
								}
							});
							
							
							
						}
					});
				second.setVisibility(View.VISIBLE);
				second.setText("Preparati per partire!");
				theIntent.putExtra("score", 6);
				startActivity(theIntent);
				second.setOnClickListener(new View.OnClickListener() {
					
					//obbiettivo 4:la vita continua
					 
					@Override
					public void onClick(View v) {
						// TODO an other activity
						Intent secondintent = new Intent (story1.this, partenzza.class);
						startActivity(secondintent);
						
						
						
					}
				});
				
				
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
