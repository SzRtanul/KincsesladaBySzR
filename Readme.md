Logics:
3 láda, egyikben kincs
ládákon egy-egy felirat, csak az egyik igaz

Feliratok:
- Aranyláda: Én rejtem a kincset
- Ezüst láda: Nem én rejtem a kincset
- Bronz láda: Az aranyláda hazudik

Megfejtés:
Az ezüst ládában lehet a kincs

Programterv:
statikus osztály Kincsesládák:
	// Game Control
	boolean kitalalva;
	
	// Jatek
	byte melyiklada;
	String[] feliratok;
	
	//Muvelet
	boolean Kitalal(int lada);
	
	//Get
	String getFeliratok();
	
statikus osztály Megjelenit:
	input:
		3 gomb a láda képével
			Egyikre rákattintunk, felfedjük, hogy üres-e, utána a gomb nem aktív.