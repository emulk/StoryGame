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

public class Guerra extends Activity {
	
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
		   			Intent Helpintent = new Intent (Guerra.this, Help.class);
					startActivity(Helpintent);           
				   Toast.makeText(getApplicationContext(), "Aiuto", Toast.LENGTH_LONG).show();
				   Vibrator sp = (Vibrator)   getSystemService(Context.VIBRATOR_SERVICE);
			        sp.vibrate(100);
			            return true;
	           case R.id.Quit:
	        	      finish();
		        	  Toast.makeText(getApplicationContext(), "Chiusura applicazione", Toast.LENGTH_LONG).show();
		        	   Vibrator vg = (Vibrator)   getSystemService(Context.VIBRATOR_SERVICE);
			            vg.vibrate(100);
			            return true;
	           default:
	              return true;
	       }
	   }
	  
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.guerra);
		
		second = (Button)findViewById(R.id.indietrog);
		//second.setVisibility(View.INVISIBLE);
		
		//inizio
		textview = (TextView) findViewById(R.id.guerrastory);
		
		textview.setMovementMethod(new ScrollingMovementMethod());
		textview.setText(" Mi unisco all'esercito di Ardus, il comandante ci ordina di mantenere la posizione. " +
				"La prima mandata dei cavalieri dei signori delle tenebre si avvicina." +
				" Arrivano da nord-est, sono in pochi e si capisce che sono disorganizzati poichè avanzano in gruppi di due," +
				" senza aspettare i loro compagni e senza darsi manforte gli uni con gli altri." +
				" Questo è un punto a nostro vantaggio. Avanziamo verso la taverna , cercando di salvare più" +
				" vite possibili. Lo scontro inizia a metà strada tra le camere di armamento e la taverna." +
				" Un pugno di cavalieri si avvicina, erano maestosi in groppa ai loro cavalli ed erano ben armati ," +
				" ma grazie alla nostra superiorità  numerica li sopraffiamo facilmente. Poichè non c'era tempo di fare prigionieri," +
				" il comandante ordina di porre fine alla loro vita. Arriviamo davanti alla taverna e scopriamo che è troppo tardi," +
				" poichè stava andando a fuoco. All'interno si sentono delle grida strazianti." +
				" Il comandante ordina di spegnere il fuoco, ma non facciamo in tempo a scendere da cavallo quando alle nostre spalle," +
				" in lontananza vediamo una nube nera, strizzo gli occhi per vedere meglio, non era una nube ma era la seconda mandata" +
				" dei signori delle tenebre. L'esercito della seconda mandata era enorme, ed attaccavano sempre da nord-est. " +
				" Ci guardiamo negli occhi gli uni con gli altri per cercare un po' di conforto, ma capiamo velocemente che se fossimo rimasti" +
				" ancora qualche istante nel campo d'addestramento saremmo andati incontro a morte certa. Rientriamo in città ," +
				" e decidiamo di percorrere la strada che taglia il bosco per arrivare più veloci. Arrivati davanti alla porta maggiore, il " +
				" comandante ordina di formare due gruppi da 5 volontari che sarebbero andati a informare i villaggi alleati di Nedres e di Murdunt.");
				
		Toast.makeText(getApplicationContext(), "Obiettivo 11: Ardus, il nostro salvatore", Toast.LENGTH_LONG).show();
		 avanti = (Button)findViewById(R.id.avantig);
		 avanti.setText("Rimani sotto l'esercito di Ardus!");
		 avanti.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				
				//seconda schermata
				textview = (TextView) findViewById(R.id.guerrastory);
				textview.setText("I due gruppi si formano velocemente, ma ciò vuol dire 10 cavalieri in meno per proteggere la nostra città ." +
						" Vediamo i due gruppi dei volontari partire, e dopo pochi minuti sono fuori dalla nostra vista. La testa inizia a farmi" +
						" male , inizio ad avere mille dubbi e mille domande contemporaneamente: \n " +
						" -E se gli alleati non fossero intervenuti in tempo ? " +
						"\n -E se non eravamo abbastanza forti per tenere testa all'esercito nemico fino all'arrivo dei rinforzi? " +
						"\n -E se la vita di tutti noi non sarebbe bastata come prezzo per vincere questa guerra o questa battaglia? " +
						"\n -E se fosse una guerra già  persa in partenza ? " +
						"\n.....\"Cavalieri delle terre tormentate, il nemico è alle porte. Ora dipende tutto da noi , scegliete se combattere per " +
						" la libertà  anche a prezzo della vostra vita,  o arrenderci per la paura e vivere nella vergogna e sotto " +
						" l'assedio del nemico \" Era la voce del capitano che suonava fiera e impetuosa. " +
						" \"Entriamo in città  e iniziamo i preparativi per la difesa e il contrattacco, salveremo il nostro paese\".  " );
				
				//1 prima scelta
				avanti.setText("Esegui gli ordini");
				avanti.setOnClickListener(new View.OnClickListener() {
						
						@Override
						public void onClick(View v) {
							
							
							
							textview = (TextView) findViewById(R.id.guerrastory);
							textview.setText("Eseguo gli ordini del capitano ed entriamo dentro le mura, l'immensa porta viene chiusa alle " +
									"nostre spalle, da quel momento nessuno poteva più entrare o uscire dalla città . " +
									"Ma non appena scendiamo da cavallo ci accorgiamo dell'immenso problema, eravamo in pochi e i nemici a" +
									" differenza nostra non finivano più. Si avvicinavano sempre di più e incutevano sempre più paura e timore." +
									"L'orizzonte era nero, e io iniziavo a tremare, temevo che i miei compagni potessero sentire la mia paura, non volevo" +
									" apparire codardo, iniziavo a sperare che tutto ciò fosse solo un incubo, volevo svegliarmi, volevo dimenticare tutto." +
									"\"Aprite tutti gli arsenali, date un'arma a chiunque sia in grado di tenerla in mano\" era sempre il capitano che parlava" +
									"\"portate le donne, i vecchi e i bambini in un posto sicuro\", la sua voce era sempre più cupa e bassa." +
									"\n-Un posto sicuro?" +
									"\n-E dove? dove lo troviamo un posto sicuro?" +
									"\"Amon porta gli indifesi nelle grotte\"" +
									"-Ecco il mio compito, devo solo portare quelli che non possono combattere all'interno delle grotte, ma quanto avrebbero " +
									"retto le grotte? " );
							
							avanti.setText("All'interno delle grotte");
							avanti.setOnClickListener(new View.OnClickListener() {
								
								@Override
								public void onClick(View v) {
									
									// TODO Auto-generated method stub
									
									//textview.setBackgroundResource(R.drawable.death);
									
									textview = (TextView) findViewById(R.id.guerrastory);
									textview.setText("Vedevo il terrore sulle faccia di tutti i cittadini, i guerrieri cercavano di nascondere il timore e la paura, " +
											"ma i cittadini normali erano meno bravi, non riuscivano a nascondere i propri sentimenti, erano terrorizzati." +
											"Inizio a fare strada attraverso le scale, e scendo sempre più in profondità , si sente l'aria chiusa e l'odore putrefatto del legno." +
											"Quando arrivo alla fine, seguito dai cittadini, vedo davanti a me un sacco di macerie, una delle pareti era quasi crollata del tutto." +
											"Ma quella grotta si trovava ad est del paese, se avessimo buttato giù il muro avremmo potuto sorprendere il nemico alle spalle." +
											"Salgo le scale e ritorno in superficie, vado dal capitano e li riferisco la mia idea." +
											"Dopo averli raccontato tutto il capitano lascia la decisione a me." +
											"\"Amon, se credi che il piano possa funzionare, porta con te altri 4 guerrieri, sceglili, e avvicinatevi alle spalle del nemico," +
											" ma non dovete attaccare, non fatevi scoprire, cercate di raccogliere più informazioni che potete e ritornate qui prima del calar del sole," +
											"non un attimo prima, non un attimo dopo, se per quell'ora non sarete qui chiuderemo le grotte e non avrete più nessun modo per rientrare" +
											"all'interno delle mura\"");
									
									avanti.setText("Scegli i cinque guerrieri");
									avanti.setOnClickListener(new View.OnClickListener() {
										
										@Override
										public void onClick(View v) {
											// TODO Auto-generated method stub
											textview=(TextView)findViewById(R.id.guerrastory);
											textview.setText("Scelgo i cinque guerrieri vicino a me, iniziamo a scendere nella grotta. Arrivati " +
													"in fondo alla grotta attraversiamo il muro attraverso il buco fatto e usciamo in campo aperto." +
													" Eravamo alle spalle dell'esercito oscuro, iniziamo ad avvicinarci, e a scorgere centinaia di orrori " +
													", trappole ovunque e come se non bastasse gli arcieri stavano preparando le freccie infuocate, volevano " +
													"bruciare tutto. C'erano centinaia di catapulte, isolate, alle spalle dei soldati." +
													" Quelle catapulte sarebbero state la nostra rovina, dovevamo distruggerle.");
											avanti.setVisibility(View.INVISIBLE);
											second.setText("Distruggiamo le catapulte!");
											second.setOnClickListener(new View.OnClickListener() {
												
												@Override
												public void onClick(View v) {
													// TODO Auto-generated method stub
													textview=(TextView)findViewById(R.id.guerrastory);
													textview.setText("Comunico agli altri le mie intenzioni e ci dirigiamo verso le catapulte, aggiriamo il nemico alle spalle" +
															" , arrivai dinanzi alle catapulte. Beh da lontano sembravano grandi, ma da vicine sono gigantesche, l'unico modo" +
															" che avevamo per metterle fuori gioco era tagliare la corda di caricamento, e sperare che non avvesero altre corde di riserva." +
															"\n Con le nostre spade affilate era un gioco da ragazzi tagliare le corde, più andavamo avanti e più vedevamo qualche speranza" +
															" di arrivare alla fine della prossima giornata. " +
															"Una volta messe fuori gioco le catapulte decidiamo di avvicinarci per raccogliere più informazioni possibili dal nemico, " +
															" Arlong, uno dei miei 5 compagni, vede una guardia avvicinarsi a noi, probabilmente era uno delle guardie." +
															" Non si era ancora accorto di noi, e a vederlo caminare era sicuramente ubriaco, inciampa su un sasso nero e cade per terra " +
															"sbatendo la testa, sentiamo il rumore della sua testa che sbatte per tera." +
															"Arlong fa un scatto per arrivarli alle spalle, ma appena parte il nemico sentendo i suoi passi, fa per rialzarsi e cerca " +
															"di estrarre la spada, ma era troppo tardi, Arlong tira un fendente con la sua maestosa spada staccandogli di netto la testa dal" +
															" corpo. Mentre eravamo troppo presi a nascondere il cadavere qualcuno si era accorto di noi, vediamo un gruppo di 10 soldati" +
															" che si dirigono verso di noi. Ormai ci avevano scoperto, dovevcamo scegliere, combattere o scappare?");
													avanti.setVisibility(View.VISIBLE);
													avanti.setText("Combatti!");
													avanti.setOnClickListener(new View.OnClickListener() {
														
														@Override
														public void onClick(View v) {
															// TODO Auto-generated method stub
															textview.setBackgroundResource(R.drawable.death);
															textview=(TextView)findViewById(R.id.guerrastory);
															textview.setText("Ci prepariamo per affrontare i nemici intanto che si avvicinavano sempre di più, dietro di loro ce n'erano" +
																	" degli altri, ma non era un problema per ora, dovevamo affrontare i primi dieci e dopo avremmo pensato agli altri." +
																	" Cerco di estrare la spada ma una freccia mi trafigge il petto, sento un male impressionante al petto e vedo il mio" +
																	"sangue fuoriuscire. Il maledetto arciere era riuscito a trafiggermi il petto da quella distanza, non potevo crederci.");
															avanti.setVisibility(View.INVISIBLE);
															second.setText("Fine!");
															second.setOnClickListener(new View.OnClickListener() {
																
																@Override
																public void onClick(View v) {
																	// TODO Auto-generated method stub
																	Intent finish = new Intent(Guerra.this, Read.class);
																	startActivity(finish);
																	
																}
															});
															
														}
													});
													second.setText("Scappa!");
													second.setOnClickListener(new View.OnClickListener() {
														
														@Override
														public void onClick(View v) {
															// TODO Auto-generated method stub
															textview.setBackgroundResource(R.drawable.death);
															textview=(TextView)findViewById(R.id.guerrastory);
															textview.setText("Decidiamo di scappare, erano in troppi e non volevamo rischiare, " +
																	"iniziamo a correre, ma la nostra corsa dura poco, gli arcieri iniziano a scoccare le freccie" +
																	" e nel giro di poco tempo eravamo tutti stesi per terra e insanguinati." +
																	" Era la fine per tutti.");
															
															
															avanti.setVisibility(View.INVISIBLE);
															second.setText("Fine!");
															second.setOnClickListener(new View.OnClickListener() {
																
																@Override
																public void onClick(View v) {
																	// TODO Auto-generated method stub
																	Intent finish = new Intent(Guerra.this, Read.class);
																	startActivity(finish);
																	
																}
															});
														}
													});
												}
											});
										}
									});
									second.setText("Agisci da solo");
									second.setOnClickListener(new View.OnClickListener() {
										
										@Override
										public void onClick(View v) {
											// TODO Auto-generated method stub
											textview=(TextView)findViewById(R.id.guerrastory);
											textview.setText("Aggire in gruppo sarebbe stato troppo pericoloso, avviso il capitano che sarei andato da solo e" +
													" scendo di nuovo nella grotta, intanto" +
													" qualcuno aveva già fatto il buco nel muro, seppur piccolo bastava per passarci attraverso " +
													" e uscire in campo aperto. Purtroppo non potevo avere un cavallo, era impossibile farlo scendere nella grotta," +
													" ed era ancora più difficile farlo passare attraverso quel piccolo buco.");
											avanti.setVisibility(View.INVISIBLE);
											second.setText("Visualizza i nemici");
											second.setOnClickListener(new View.OnClickListener() {
												
												@Override
												public void onClick(View v) {
													// TODO Auto-generated method stub
													textview=(TextView)findViewById(R.id.guerrastory);
													textview.setText("Esco dalla grotta, cammino per un po' in campo aperto per avvicinarmi sempre di più alle loro spalle" +
															", erano ancora più orrendi da vicino, sembravano più bestie che uomini." +
															"Ormai il tramonto era vicino, si stavano preparando per accamparsi, rimanevano si e no tre ore di luce." +
															"Ma oltre all'accampamento stavano anche preparando numerose trappole, avevano anche le catapulte che avrebbero" +
															"usato il giorno dopo, ma quello che mi sorprendeva veramente era il numero degli arceri, erano numerosissimi" +
															"e ci avrebbero fatto a pezzi se non trovavamo alla svelta una buona strategia da seguire.");
													second.setText("Ritorna dal capitano");
													second.setOnClickListener(new View.OnClickListener() {
														
														@Override
														public void onClick(View v) {
															// TODO Auto-generated method stub
															textview.setBackgroundResource(R.drawable.death);
															textview=(TextView)findViewById(R.id.guerrastory);
															textview.setText("Giro le spalle e inizio a rientrare, faccio pochi passi quando inizio a sentire degli abbai," +
																	"erano dei cani che stavano abbaiando, mi giro e li vedo, stavano correndo verso di me." +
																	"Dovevo fare qualcosa o sarei morto, ma l'unica soluzione che mi veniva in mente era correre," +
																	"correre più che potevo, non pensare a nient'altro che correre, faccio una decina di passi, " +
																	"mi avvicino alle mura per rientrare, quando il mio corpo si blocca, si blocca di colpo, non rispondeva" +
																	" più ai miei comandi, abbasso lo sguardo e vedo un fiume di sangue uscire dal mio petto, maledetti, " +
																	"era una freccia, una freccia mi aveva traffito il cuore.");
															second.setText("Fine!");
															second.setOnClickListener(new View.OnClickListener() {
																
																@Override
																public void onClick(View v) {
																	// TODO Auto-generated method stub
																	Intent finish = new Intent(Guerra.this, Read.class);
																	startActivity(finish);
																	
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
							second.setText("Alla fontana degli alchimisti!");
							second.setOnClickListener(new View.OnClickListener() {
								
								@Override
								public void onClick(View v) {
									// TODO Auto-generated method stub
									
									textview = (TextView) findViewById(R.id.guerrastory);
									textview.setText("Le grotte erano chiuse da più di mille anni, l'aria sarebbe stata scarsa e pesante, non erano adatte a delle persone " +
											"anziane o a giovani bambini. L'unico posto sicuro era la fontana degli alchimisti, si trovava a sud-ovest del castello," +
											"in un campo aperto. Propongo l'idea al capitano Ardus, e ci dirigamo verso la fontana." +
											"Dopo due ore tutte le donne, anziani e bambini si trovavano nei pressi della fontana." +
											"Mancava solo un'ora di luce ormai, intanto i nemici si stavano accampando davanti alla porta maggiore del castello." +
											"Ci serviva un strategia, altrimenti sarebbe stata tutta fatica inutile.");
									
								avanti.setText("Continua!");
								second.setVisibility(View.INVISIBLE);
								avanti.setOnClickListener(new View.OnClickListener() {
									
									@Override
									public void onClick(View v) {
										
										textview = (TextView)findViewById(R.id.guerrastory);
										textview.setBackgroundResource(R.drawable.death);
										textview.setText("Alle prime luci dell'alba si sente un forte boato, ci svegliamo tutti all'improvviso. " +
												"Mi alzo in piedi e cerco di capire cosa stava succedendo, intanto si sentono delle urla strazianti. " +
												"I nemici erano entrati in città, dopo aver abbatutto la porta. " +
												"Inizio a mettermi l'armatura in fretta, ma all'improvisso il cielo si oscura, guardiamo tutti verso l'alto e..." +
												" Erano frecce, iniziano a cadere al suolo e a trafigere tutti." +
												"Muovo la mano alla ricerca dello scudo ma una delle frecce mi trafige in pieno petto.");
										
										
										avanti.setText("Fine!");
										//second invisible
										
										avanti.setOnClickListener(new View.OnClickListener() {
											
											@Override
											public void onClick(View v) {
												// TODO Auto-generated method stub
												
												Intent finish= new Intent (Guerra.this, Read.class);
												startActivity(finish);
											}
										});
										
										
									}
								});
								
								second.setText("Fuggi in groppa al cavallo!");
								second.setOnClickListener(new View.OnClickListener() {
									
									@Override
									public void onClick(View v) {
										// TODO an other activity
										textview.setBackgroundResource(R.drawable.death);
										textview=(TextView)findViewById(R.id.guerrastory);
										textview.setText("Vedevo negli occhi dei miei compagni la paura e contemporamente la speranza ." +
												" Ma se fossi scappato avrei avuto piu' possibilità di sopravvivenza. Potevo rifugiarmi nella " +
												"città  vicina di Nedres , entrare a fare parte del loro esercitto, e salvare la mia citta, e in " +
												"questo modo sembrare un eroe e avere la vita salva. Un piano geniale. Mentre gli altri iniziano a rientrare in città io mi volto dall'altra parte e sparisco nel bosco." +
												" Volevo raggiungere gli altri cavalieri che erano partiti prima di me, ormai era troppo tardi, mi lancio a tutta velocità per " +
												"allontanarmi il più possibile dal mio villaggio, mi indentro sempre di più nel bosco, fino ad arrivare alla fonte," +
												" mi fermo per abbeverare il mio cavallo, ma alle mie spalle spuntano tre cavalieri. No, non potevano esser dei nemici, " +
												"era passato cosi poco tempo, non avrebbero fatto in tempo ad essere già qui. Si avvicinano, scendono da cavallo e..., senza neanche" +
												" che mi accorga di ciò  che stava succedendo mi ritrovo per terra, senza vita. Ora capisco,  il comandante aveva mandato tre cavalieri " +
												"a cercarmi, ero a tutti gli effetti un traditore, era ovvio, non avrebbe mai permesso che mi allontanassi dal villaggio come se nulla fosse, magari avrei potuto vendermi ai nemici, informarli dei punti deboli del villaggio e condannare tutti i miei amici.");
									}
								});
								
								}
							});
							
							
							
						}
					});
				second.setVisibility(View.VISIBLE);
				
				second.setText("Diserta in groppa al cavallo");
				second.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO an other activity
						textview.setBackgroundResource(R.drawable.death);
						textview=(TextView)findViewById(R.id.guerrastory);
						textview.setText("Vedevo negli occhi dei miei compagni la paura e contemporamente la speranza ." +
												" Ma se fossi scappato avrei avuto piu' possibilità di sopravvivenza. Potevo rifugiarmi nella " +
												"città  vicina di Nedres , entrare a fare parte del loro esercitto, e salvare la mia citta, e in " +
												"questo modo sembrare un eroe e avere la vita salva. Un piano geniale. Mentre gli altri iniziano a rientrare in città io mi volto dall'altra parte e sparisco nel bosco." +
												" Volevo raggiungere gli altri cavalieri che erano partiti prima di me, ormai era troppo tardi, mi lancio a tutta velocità per " +
												"allontanarmi il più possibile dal mio villaggio, mi indentro sempre di più nel bosco, fino ad arrivare alla fonte," +
												" mi fermo per abbeverare il mio cavallo, ma alle mie spalle spuntano tre cavalieri. No, non potevano esser dei nemici, " +
												"era passato cosi poco tempo, non avrebbero fatto in tempo ad essere già qui. Si avvicinano, scendono da cavallo e..., senza neanche" +
												" che mi accorga di ciò  che stava succedendo mi ritrovo per terra, senza vita. Ora capisco,  il comandante aveva mandato tre cavalieri " +
												"a cercarmi, ero a tutti gli effetti un traditore, era ovvio, non avrebbe mai permesso che mi allontanassi dal villaggio come se nulla fosse, magari avrei potuto vendermi ai nemici, informarli dei punti deboli del villaggio e condannare tutti i miei amici.");
						avanti.setVisibility(View.INVISIBLE);
						second.setText("Fine!");
						second.setOnClickListener(new View.OnClickListener() {
							
							@Override
							public void onClick(View v) {
								// TODO Auto-generated method stub
								Intent finish = new Intent(Guerra.this, Read.class);
								startActivity(finish);
								
							}
							
						});
					}
				});
				
			
				
				
				
				
				
			}
		});
		 
		 	//second.setVisibility(View.VISIBLE);
			second.setText("Avvisare gli alleati!");
			second.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO an other activity
					textview=(TextView)findViewById(R.id.guerrastory);
					textview.setText("Non me la sentivo di rimanere nel villaggio, sarebbe stato inutile, avrei dovuto aspettare i rinforzi senza poter fare " +
							"nulla, impotente, e non era questo ciò che voglio. Io voglio salvare il mio villaggio, la terra dove sono nato," +
							" i miei amici, la mia casa, tutto ciò che ho si trova qui non posso permettermi di perderlo, la cosa migliore che posso fare è avvisare gli alleati e schiacciare l'esercito oscuro delle tenebre. ");
					
					avanti.setText("Avissa Nedres!");
					avanti.setOnClickListener(new View.OnClickListener() {
						
						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							textview=(TextView)findViewById(R.id.guerrastory);
							textview.setText("Il villaggio di Nedres era uno dei pochi villaggi alleati che avevamo. Si trovava a sud-est del campo d'addestramento , a circa 1 giorno e mezzo di cammino a cavallo.");
							
							avanti.setText("Continua!");
							second.setVisibility(View.INVISIBLE);
							avanti.setOnClickListener(new View.OnClickListener() {
								
								@Override
								public void onClick(View v) {
									// TODO Auto-generated method stub
									Intent finish = new Intent(Guerra.this, Nedres.class);
									startActivity(finish);
								}
							});
						}
					});
					second.setText("Vai a Murdunt!");
					second.setOnClickListener(new View.OnClickListener() {
						
						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							textview=(TextView)findViewById(R.id.guerrastory);
							textview.setText("Partiamo tutti e cinque per Murdunt, il viaggio sarebbe stato lungo e scomodo." +
									" Per arrivare a Murdunt saremo dovuti passare sotto la montagna ghiacciata di Kermek, e avremo dovuto" +
									" aggirare il lago di Mestia. Oppure potevamo aggirare la montagna ma ciò avrebbe allungato la strada" +
									" di parecchio. Arrivati in prossimità  della Montagna di Kermek ci troviamo di fronte alla decisione: ");
							Toast.makeText(getApplicationContext(), "Obiettivo 9: L'avventura continua", Toast.LENGTH_LONG).show();
							avanti.setText("Continua!");
							second.setVisibility(View.INVISIBLE);
							avanti.setOnClickListener(new View.OnClickListener() {
								
								@Override
								public void onClick(View v) {
									// TODO Auto-generated method stub
									Intent finish = new Intent(Guerra.this, Murdunt.class);
									startActivity(finish);
								}
							});
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
