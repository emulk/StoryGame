package it.example.storygame;




import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.View;

import android.widget.Button;
import android.widget.TextView;

public class Guerra extends Activity {
	
	TextView textview;
	Button avanti;
	Button second;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.guerra);
		
		second = (Button)findViewById(R.id.indietrog);
		second.setVisibility(View.INVISIBLE);
		
		//inizio
		textview = (TextView) findViewById(R.id.guerrastory);
		//textview.setVerticalScrollBarEnabled(true);
		//textview.setScroller(new Scroller(myContext)); 
		//textview.setMaxLines(100); 
		//textview.setVerticalScrollBarEnabled(true); 
		//textview.setMovementMethod(new ScrollingMovementMethod()); 
		textview.setMovementMethod(new ScrollingMovementMethod());
		textview.setText(" Mi unisco all'esercito di Ardus, il comandante ci ordina di mantenere la posizione. " +
				"La prima mandata dei cavalieri dei signori delle tenebre si avvicina." +
				" Arrivano da nord-est, sono in pochi e si capisce che sono disorganizzati poiche avanzano in gruppi di due," +
				" senza aspettare i loro compagni e senza darsi manforte gli uni con gli altri." +
				" Questo e un punto a nostro vantaggio. Avanziamo verso la taverna , cercando di salvare più" +
				" vite possibili. Lo scontro inizia a metta strada tra le camere di armamento e la taverna." +
				" Un pugno di cavalieri si avvicina, erano maestosi in groppa ai loro cavalli ed erano ben armati ," +
				" ma grazie alla nostra superiorità numerica li soprafiamo facilmente. Poiche non c'era tempo di fare prigioniere," +
				" il comandante ordina di porrere fine alla loro vita. Arriviamo davanti alla taverna e scoprima che e troppo tardi," +
				" poiche stava andando a fuoco. Al interno si sentono delle grida strazianti." +
				" Il comandante ordina di spegnere il fuoco, ma non facciamo in tempo a scendere da cavallo quando alle nostre spalle," +
				" in lontananza vediamo una nube nera, strizzo gli occhi per vedere meglio, non era una nube ma era la seconda mandata" +
				" dei signori delle tenebre.L'esercito della seconda mandata era enorme, ed attaccavano sempre da nord-est. " +
				" Ci guardiamo negli occhi gli uni con gli altri per cercare un po di conforto, ma capiamo velocemente che se fossimo rimasti" +
				" ancora qualche istante nel campo d'addestramento saremo andati incontro a morte certa. Rientriamo in città," +
				" e decidiamo di percorrere la strada che tagliava il bosco per arrivare più veloci. Arrivati davanti alla porta maggiore il " +
				" comandante ordina di formare due gruppi da 5 volontari che sarebbero andati a informare i villaggi alleati di Nedres e di Murdunt.");
				
		
		 avanti = (Button)findViewById(R.id.avantig);
		 avanti.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				
				//seconda schermata
				textview = (TextView) findViewById(R.id.guerrastory);
				textview.setText("Mi alzo in piedi per preparare la mia borsa e partire come ogni giorno ormai da tre lunghissimi anni per il" +
						" campo d'addestramento. Guardo fuori dalla finestra e l'atmosfera è stranamente silenziosa, la brina del mattino luccica " +
						"sui merli delle torri, l'aria e pungente. " );
				
				//1 prima scelta
				avanti.setText("Ritorna a dorimire");
				avanti.setOnClickListener(new View.OnClickListener() {
						
						@Override
						public void onClick(View v) {
							
							
							
							textview = (TextView) findViewById(R.id.guerrastory);
							textview.setText("Dopo tre ore di sonno vengo svegliato dal rumore assordante che la porta produce cadendo per terra e " +
									"frantumandosi in mille pezzi.In controluce appare la faccia di un assasino, era li per derubarmi." +
									" A 40 centimetri alla destra del letto c'era la finestra aperta che dava sul lago, mentre sopra la sedia " +
									"sulla mia sinistra lucicava l'argento della spada che avevo ereditato dal mio defunto padre. " );
							
							avanti.setText("Buttati dalla finestra!");
							avanti.setOnClickListener(new View.OnClickListener() {
								
								@Override
								public void onClick(View v) {
									
									// TODO Auto-generated method stub
									
									//textview.setBackgroundResource(R.drawable.death);
									
									textview = (TextView) findViewById(R.id.guerrastory);
									textview.setText("Mi alzo di colpo e mi lancio nel vuoto attraverso la finestra. Cado per tre metri e cado in piedi " +
											"per poi sbattere violentemente il 	ginochio destro per terra e procurarmi una ferita che inizio a" +
											" perdere sangue. Mi rialzo, senza pensare alla ferita e inizio a correre 	all'impazata, l'assasino mi" +
											" corre dietro con un coltello in mano. All'orizonte vedo una guardia reale in servizio e inizio a gridare " +
											"con tutto il fiato che mi era rimasto. La guardia si acorge di me e inizia a corrermi incontro, tira fuori" +
											" il suo arco e scoca una freccia con la quale trapassa il cranio del assasino. Io vengo ricorso e" +
											" tranquillizato ma poche ore dopo vengo ragiunto dal mio comandante il quale mi da la brutta notizia che" +
											" a causa del mio disonore per la cavalleria ero stato escluso dal esercito. Torno a casa e inizio a pensare " +
											" al disonore che avevo causato alla mia famigli. Mi rendo conto che tutto quell'disonore era troppo " +
											"grande da soportare, prendo una corda e decido di impicarmi.");
									
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
							second.setText("Affera la spada!");
							second.setOnClickListener(new View.OnClickListener() {
								
								@Override
								public void onClick(View v) {
									// TODO Auto-generated method stub
									
									textview = (TextView) findViewById(R.id.guerrastory);
									textview.setText("Affero la spada e tiro un primo fendente all'assasino staccandogli la testa dal corpo, il sangue schizza" +
											" da per tutto e quattro corone d'oro cadono dalle tasche del assasino rotolando per terra.");
									
								avanti.setText("Sbarazati del corpo!");
								avanti.setOnClickListener(new View.OnClickListener() {
									
									@Override
									public void onClick(View v) {
										
										textview = (TextView)findViewById(R.id.guerrastory);
										textview.setText("Scendo nella stalla e afferro un sacco, all' interno del quale ci inserisco il cadavere del assassino.");
										
										
										avanti.setText("Butta il cadavere nel lago!");
										avanti.setOnClickListener(new View.OnClickListener() {
											
											@Override
											public void onClick(View v) {
												// TODO Auto-generated method stub
												
												textview=(TextView)findViewById(R.id.guerrastory);
												textview.setText("Carico il cadavere sulle spalle e lo porto fino alla riva del lago per poi buttarlo all' interno. " +
														"Rimango in piedi a fissarlo per più di 10 minuti dopo di che il sacco sparisce sott'acqua e decido di ritornare nell' appartamento.");
												
												avanti.setText("Pulisci la stanza!");
												avanti.setOnClickListener(new View.OnClickListener() {
													
													@Override
													public void onClick(View v) {
														// TODO Vai al 6
														textview=(TextView)findViewById(R.id.guerrastory);
														textview.setText("Scendo al lago sottostante e riempio un barilotto con l'acqua limpida" +
																" che si trova al suo interno, ritono nella mia camera e inizio a pulire il sangue che aveva macchiato ogni cosa." +
																" Una volta finito la stanza splendeva come non mai, ma davanti alla porta giace per terra il cadavere freddo e" +
																" senza vita del assasino e come se non bastase sono di parecchie ore in ritardo per l'adestramento.");
														
														
														second.setText("Parti per l'adestramento!");
														second.setOnClickListener(new View.OnClickListener() {
															
															@Override
															public void onClick(View v) {
																// TODO an other activity
																Intent second = new Intent (Guerra.this, partenzza.class);
																startActivity(second);
															}
														});
													}
												});
												
												avanti.setVisibility(View.INVISIBLE);
												second.setText("Parti per l'adestramento!");
												second.setOnClickListener(new View.OnClickListener() {
													
													@Override
													public void onClick(View v) {
														// TODO an other activity
														Intent second = new Intent (Guerra.this, partenzza.class);
														startActivity(second);
													}
												});
											}
										});
										
										second.setText("Porta il cadavere nel bosco per sotterarlo!");
										second.setOnClickListener(new View.OnClickListener() {
											
											@Override
											public void onClick(View v) {
												// TODO Auto-generated method stub
												textview=(TextView)findViewById(R.id.guerrastory);
												textview.setText("Afferro il sacco con forza e lo carico sopra il cavallo, salgo in groppa e parto in direzzione del bosco." +
														" Scendo a cavallo per il ripido sentiero che si inoltra nella foresta di Freylund, mi inoltro al suo interno e " +
														" in prossimita di un dirupo mi fermo per poi butare al suo interno il sacco");
												
												avanti.setVisibility(View.INVISIBLE);
												second.setText("Parti per l'adestramento!");
												second.setOnClickListener(new View.OnClickListener() {
													
													@Override
													public void onClick(View v) {
														// TODO an other activity
														Intent second = new Intent (Guerra.this, partenzza.class);
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
										Intent second = new Intent (Guerra.this, partenzza.class);
										startActivity(second);
									}
								});
								
								}
							});
							
							
							
						}
					});
				second.setVisibility(View.VISIBLE);
				second.setText("Avvisare gli alleati!");
				second.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO an other activity
						textview=(TextView)findViewById(R.id.guerrastory);
						textview.setText("Non me la sentivo di rimanere nel villaggio, sarebbe stato inutile, avrei dovuto aspettare gli rinforzi senza poter fare " +
								"nulla, impotente, non e questo ciò che voglio, io voglio salvare il mio villaggio, la terra dove sono nato," +
								" i miei amici, la mia casa, tutto ciò che ho si trova qui non posso permettermi di perderla, la cosa migliore che posso fare e avvisare gli alleati e schiacciare l'esercito oscuro delle tenebre. ");
						
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
