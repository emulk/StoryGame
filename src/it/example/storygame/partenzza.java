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

public class partenzza extends Activity {
	
	TextView textview;

	Button avanti;
	Button second;
	
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
		   			Intent Helpintent = new Intent (partenzza.this, Help.class);
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
		setContentView(R.layout.partenzza);
		
		second = (Button)findViewById(R.id.indietro);
		//second.setVisibility(View.INVISIBLE);
		
		//inizio
		textview = (TextView) findViewById(R.id.story1);
		textview.setMovementMethod(new ScrollingMovementMethod());
		textview.setText("Apro la borsa e dentro ci inserisco 10 corone d'oro, afferro una razione alimentare dallo scaffale in alto e lo appoggio" +
				" con cura dentro la borsa, poi afferro la mia spada e indosso il corpetto di pelle. Finalmente sono pronto, scendo nella " +
				"stalla e inizia a sentirsi il rumore assordante della campana d'oro. Salgo a cavallo e parto per il campo d'addestramento." +
				" Scendo a cavallo per il ripido sentiero che si inoltra nella foresta di Freylund, e prima di entrare nel fitto bosco mi giro " +
				" a guardare la campana d'oro innalzata sopra una torre. Una volta uscito dalla foresta procedo verso sud sulla \"Strada dei Predoni Maledetti\"" +
				", l'unica che collega il paese con il campo d'addestramento. All'improvviso vengo assalito da una banda di fuorilegge " +
				" che vuole rapinarmi del mio oro.");
				
		
		 avanti = (Button)findViewById(R.id.avanti);
		 avanti.setText("Combatti contro la banda!");
		 avanti.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				
				//seconda schermata
				textview = (TextView) findViewById(R.id.story1);
				textview.setText("Pur preso alla sprovvista afferro la spada e colpisco il primo malvivente che mi capita a tiro staccandogli un" +
						" braccio, e mentre il secondo si avvicina mi sbrigo a tirar fuori lo scudo e intanto do il colpo di " +
						"grazia alla mia prima vittima che giaceve immobile per terra e senza fiato, rendendolo inoffensivo per sempre." +
						" Intanto gli altri tre malfattori scappano terrorizzati , dopo aver visto che ero un boccone troppo duro per loro." );
				
				//1 prima scelta
				avanti.setText("Insegui i malviventi!");
				avanti.setOnClickListener(new View.OnClickListener() {
						
						@Override
						public void onClick(View v) {
							
							
							
							textview = (TextView) findViewById(R.id.story1);
							textview.setText("Furioso mi lancio all'inseguimento dei malfattori, dopotutto sono un cavaliere e ne va della mia " +
									" reputazione rendere giustizia, dando ai malfattori cio' che si meritano. E l'unica pena che dovrebbero avere" +
									" per le loro malefatte è la morte. Arrivo alle spalle del piu' lento, il quale ignaro della mia posizione" +
									" credeva di avermi seminato, lo attacco alle spalle con la spada. Il malvivente cade per terra senza vita." );
							
							avanti.setText("Continua a seguire i malviventi!");
							avanti.setOnClickListener(new View.OnClickListener() {
								
								@Override
								public void onClick(View v) {
									// TODO Auto-generated method stub
									textview.setBackgroundResource(R.drawable.death);
									textview = (TextView) findViewById(R.id.story1);
									textview.setText("Senza fermarmi neanche per un attimo, continuo l'inseguimento dei restanti malviventi. Sono a pochi passi" +
											" da loro quando ne ho abbastanza di inseguirli, tirofuori l'arco e con la mano destra afferro un freccia, " +
											" prendo la mira e scocco il dardo. Manco il bersaglio e la frecia si confica nell'albero, alla destra del mio bersaglio.Intanto mi accorgo che il secondo " +
											" malvivente non è piu' sulla mia visuale, ignaro del pericolo in cui mi stavo imbattendo continuo l'inseguimento come se nulla fosse." +
											" All'improvviso il mio bersaglio si ferma di colpo, estraggo la spada e gli vado incontro anche io , pensando che ne" +
											" aveva abbastanza di scappare e che finalmente voleva arrendersi e andare incontro alla morte. Quando ero a pochi passi dal mio " +
											" bersaglio 10 uomini armati mi circondano, quattro dei quali mi tenevano sotto tiro con l'arco. Ero finito in trappola, una freccia mi " +
											" colpisce , trapassandomi una spalla. Questa era la fine per me, intanto il malvivente che stavo inseguendo si avvicina a me e tira fuori " +
											" un mazza, si ferma davanti a me e sussurra poche parole che non riesco a capire e mi da il colpo di grazia.");
									
									
							
							
									second.setText("Fine!");
									second.setOnClickListener(new View.OnClickListener() {
										
										@Override
										public void onClick(View v) {
											// TODO Auto-generated method stub
											Intent finish = new Intent(partenzza.this, Read.class);
											startActivity(finish);
											
										}
									});
									avanti.setVisibility(View.INVISIBLE);
									
									
									
								}
							});
							
							avanti.setVisibility(View.VISIBLE);
	
							
							
							
						}
					});
				//second.setVisibility(View.VISIBLE);
				second.setText("Prosegui per il campo, dopo la lezione data ai malviventi.!");
				second.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO an other activity
						textview=(TextView)findViewById(R.id.story1);
						textview.setText("Dopo una lunga galoppata ecco che finalmente appare davanti ai miei occhi il campo d'addestramento. Appena sorpasso il cancello vedo quattro soldati seduti che stanno bevendo birra, e raccontano le loro imprese con impeto esagerato." +
								" Sono tutti mezzi ubriachi e parlano a voce molto alta, ma quando mi vedono tacciono immediatamente e si alzano in piedi in segno di saluto..");
						
						avanti.setText("Unisciti ai soldati!");
						avanti.setOnClickListener(new View.OnClickListener() {
							
							@Override
							public void onClick(View v) {
								// TODO Auto-generated method stub
								textview=(TextView)findViewById(R.id.story1);
								textview.setText("Mi siedo vicino ai quattro soldati formando un cerchio, e uno dei quattro iniza a parlare. Ora mi ricordo di lui. " +
										" Il suo nome è Caspian e ha combattuto sotto il mio comando tra le rovine della città-fantasma di Quaren. L'uomo ha una grossa " +
										" cicatrice in volto, fa un lungo sospiro e inizia a raccontare una storia.");
								
									avanti.setText("Ascolta la storia!");
									avanti.setOnClickListener(new View.OnClickListener() {
										
										@Override
										public void onClick(View v) {
											// TODO Auto-generated method stub
											textview=(TextView)findViewById(R.id.story1);
											textview.setText("L'uomo inizia a raccontare la storia della Pietra del potere. La pietra era stata" +
													" forgiata dalla fusione dell'oro con il diamante, nell'era della Luna nera nella città di Paressa. Centinaia di anni fa fu rubata da " +
													" un re di nome Broly, che la incastonò nella sua lancia e la usò in battaglia come strumento ispiratore dei suoi fanatici seguaci. Egli credeva che la pietra l'avesse reso invulnerabile, ma le cose non stavano cosi." +
													" Durante una battaglia presso il fiume Ridhan il re fu ucciso, e la lancia dorata gli cadde di mano inabissandosi nelle profondità delle acque del fiume e la pietra andò perduta.");
											
											
											avanti.setVisibility(View.INVISIBLE);
										}
									});
							}
						});
						
						
						second.setText("Prosegui dopo aver ricambiato il saluto!");
						second.setOnClickListener(new View.OnClickListener() {
							
							@Override
							public void onClick(View v) {
								// TODO Auto-generated method stub
								textview=(TextView)findViewById(R.id.story1);
								textview.setText("Mi inoltro nel campo e mi accorgo che un gruppo di persone si sono riunite davanti a un grande cartello. Il cartello è troppo lontano e non riesco a leggere cosa c'è scritto, " +
										" per questo decido di avvicinarmi. Quando arrivo vicino al cartello leggo a voce alta \n \"TORNEO DI TIRO CON L'ARCO \" \n	QUOTA D'ISCIRZIONE:2  CORONE D'ORO \n PRIMO PREMIO:L'ARCO D'ARGENTO DI BROLY.");
								
								avanti.setVisibility(View.VISIBLE);
								second.setVisibility(View.INVISIBLE);
								avanti.setText("Continua!");
								avanti.setOnClickListener(new View.OnClickListener() {
									
									@Override
									public void onClick(View v) {
										// TODO Auto-generated method stub
										textview=(TextView)findViewById(R.id.story1);
										textview.setText("Continuo a inoltrarmi nel campo fino ad arrivare davanti alla \"Taverna del rospo\". E' la taverna più famosa del villaggio proprio perchè è qui che servono la birra più buona, " +
												" ma anche grazie a questo è sempre piena di malintenzionati e di delinquenti. Appena entro nel cortile un garzone apparso dal nulla mi da il benvenuto, prende il mio cavallo e mi mostra l'entrata " +
												"  della taverna. All'interno, nonostante sia mattina presto, è piena di gente. In mezzo alla sala c'è un grande camino, con sopra tutta la carne che cuoce. L'odore della carne si sente in ogni angolo della taverna e fa venire l'acquolina in bocca.");
										
										
										avanti.setText("Vai al bancone per prendere una birra!");
										avanti.setOnClickListener(new View.OnClickListener() {
											
											@Override
											public void onClick(View v) {
												// TODO Auto-generated method stub
												textview=(TextView)findViewById(R.id.story1);
												textview.setText("Arrivo davanti al bancone e il proprietario della taverna, un uomo basso e cicciotello mi porgie un boccale" +
														" e subito dopo lo riempie di birra. \"Se lo goda con calma signore\" dice \"questa è la miglior birra che potrà trovare in tutto il paese\", " +
														" gli faccio un cenno di consenso con la testa e poi inizio a sorseggiare la birra. \"Mio figlio mi ha detto di aver dato da bere e da mangiare al suo" +
														" cavallo , non si deve preoccupare , è in buone mani , le nostre sono le stalle più sicure di tutto il paese\". Pago due corone d'oro per la " +
														" birra ");
												
												
												
												avanti.setText("Esci dalla taverna!");
												avanti.setOnClickListener(new View.OnClickListener() {
													
													@Override
													public void onClick(View v) {
														// TODO Auto-generated method stub
														
														textview=(TextView)findViewById(R.id.story1);
														textview.setText("Esco dalla taverna per poi entrare nella stalla a prendere il mio cavallo." +
																" Un rumore assordante inizia a farsi sentire da tutte le parti. Il rumore era talmente forte che rimango stordito per qualche secondo. Appena mi riprendo vedo che tutte le persone che fino " +
																" a qualche istante fa erano intorno a me, ora scappano senza avere una meta precisa. Il rumore assordante veniva da tutte le campane, questo significava una cosa sola, ci stavano attaccando.");
														
														
														
														avanti.setText("Torna dentro la taverna!");
														avanti.setOnClickListener(new View.OnClickListener() {
															
															@Override
															public void onClick(View v) {
																// TODO Auto-generated method stub
																textview.setBackgroundResource(R.drawable.death);
																textview=(TextView)findViewById(R.id.story1);
																textview.setText("Corro dentro la taverna in cerca di protezione, ma passato qualche minuto all' interno " +
																		" , tra il fuggi fuggi generale, il fuoco inizia a inghiottire tutto. Due cavalieri nemici avevano dato fuoco alla taverna condannando tutti al suo interno alla morte.");
																
																second.setVisibility(View.VISIBLE);
																second.setText("Fine!");
																second.setOnClickListener(new View.OnClickListener() {
																	
																	@Override
																	public void onClick(View v) {
																		// TODO Auto-generated method stub
																		Intent finish = new Intent(partenzza.this, Read.class);
																		startActivity(finish);
																		
																	}
																});
																avanti.setVisibility(View.INVISIBLE);
																
															}
														});
														avanti.setText("Precipita nella zona dell'armamento!");
														avanti.setOnClickListener(new View.OnClickListener() {
															
															@Override
															public void onClick(View v) {
																// TODO Auto-generated method stub
																//textview.setBackgroundResource(R.drawable.death);
																textview=(TextView)findViewById(R.id.story1);
																textview.setText("Dopo essere salito a cavallo, mi dirigo verso la zona d'armamento, spingo il cavallo a correre come non aveva mai fatto. " +
																		" Appena arrivo davanti alle grandi sale d'armamento, in lontananza vedo l'esercito nemico che avanzava, " +
																		" mentre il generale Ardrus aveva preparato un piccolo esercito di cavalieri per contrattaccare il nemico, " +
																		" o per lo meno per tenerlo occupato affinchè gli altri avvessero il tempo per prepararsi e dare manforte in battaglia.");
																
																
																avanti.setText(" Unisciti all'esercito di Ardus!");
																avanti.setOnClickListener(new View.OnClickListener() {
																	
																	@Override
																	public void onClick(View v) {
																		// TODO Auto-generated method stub
																		textview=(TextView)findViewById(R.id.story1);
																		textview.setText("to be continued....");
																		
																		//attacarlo alla prima attivita del secondo gamestory
																		second.setVisibility(View.VISIBLE);
																		second.setText("Fine!");
																		second.setOnClickListener(new View.OnClickListener() {
																			
																			@Override
																			public void onClick(View v) {
																				// TODO Auto-generated method stub
																				Intent finish = new Intent(partenzza.this, Read.class);
																				startActivity(finish);
																				
																			}
																		});
																		avanti.setVisibility(View.INVISIBLE);
																		
																	}
																});
																second.setVisibility(View.VISIBLE);
																second.setText("Arrenditi ai nemici");
																second.setOnClickListener(new View.OnClickListener() {
																	
																	@Override
																	public void onClick(View v) {
																		// TODO Auto-generated method stub
																		textview.setBackgroundResource(R.drawable.death);
																		textview=(TextView)findViewById(R.id.story1);
																		textview.setText("Arrendermi ai nemici significava andare  incontro a morte certa, ma in quel momento non vedevo altra soluzione. " +
																				"Due cavalieri si fermano dinanzi a me. Erano grossi e impetuosi, la loro corazza color argento respingeva i raggi " +
																				"del sole, da lontano sembravano quasi due angeli. Butto la spada e lo scudo a terra ,in " +
																				" segno di resa. Uno dei due cavalieri avanza , mi gira intorno, poi alza la lancia e mi trafigge in pieno petto. Non faccio in " +
																				" tempo ad alzare gli occhi per guardare in faccia un'ultima volta \"il cavaliere dei signori delle tenebre\" che ero a terra senza forze.");
																		
																		//attacarlo alla prima attivita del secondo gamestory
																		second.setText("Fine!");
																		second.setOnClickListener(new View.OnClickListener() {
																			
																			@Override
																			public void onClick(View v) {
																				// TODO Auto-generated method stub
																				Intent finish = new Intent(partenzza.this, Read.class);
																				startActivity(finish);
																				
																			}
																		});
																		avanti.setVisibility(View.INVISIBLE);
																		
																	}
																});
																
															}
														});
														
														
													}
												});
											}
										});
									}
								});
							}
						});
						
					}
				});
				
				
	
				
			}
		});
		 
		 
			//second.setVisibility(View.VISIBLE);
			second.setText("Fuggi in groppa al cavallo!");
			second.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO an other activity
					textview.setBackgroundResource(R.drawable.death);
					textview=(TextView)findViewById(R.id.story1);
					textview.setText("Senza fermarmi neanche per un attimo, continuo a fuggire dei restanti malviventi. Sono a pochi passi da loro" +
							" quando ne ho abbastanza dell'inseguimento, tiro fuori l'arco e con la mano destra afferro un freccia, prendo la mira e scocco il dardo." +
							" Manco il bersaglio e la freccia si conficca nell'albero, alla destra del mio bersaglio.Intanto mi accorgo che il secondo malvivente" +
							" non era più nulla mia visuale, ignaro del pericolo in cui mi stavo imbattendo continuo a fuggire come se nulla fosse. " +
							" All' improvviso  mi fermo di colpo, estraggo la spada e gli vado incontro, pensando di averne abbastanza di scappare e che finalmente voleva " +
							" arrendersi e andare incontro alla morte. Quando ero a pochi passi dal mio bersaglio 10 uomini armati mi circondano, quattro dei quali mi " +
							" tenevano sotto tiro con l'arco. Ero finito in trappola, una freccia mi colpisce , trapassandomi una spalla. Questa era la fine per me, " +
							" intanto il malvivente che stavo inseguendo si avvicina a me e tira fuori un mazza, si ferma davanti a me e sussura poche parole che non" +
							" riesco a capire e mi da il colpo di grazia.");
					
					
					second.setText("Fine!");
					second.setOnClickListener(new View.OnClickListener() {
						
						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							Intent finish = new Intent(partenzza.this, Read.class);
							startActivity(finish);
							
						}
					});
					avanti.setVisibility(View.INVISIBLE);
					
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
