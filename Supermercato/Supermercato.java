import java.util.arrayList;

public class Supermercato{
	//COSTANTI
	final String prodotti = "./prodotti.txt";
	final String scontrino = "./scontrino.txt";
	//--------
	
	//ATTRIBUTI
	arrayList<Prodotto> scaffali;
	String nome = "ELLELUNGA";
	//---------
	Supermercato(String nome){
		this.scaffali = new arrayList<>();
		this.nome = nome;
	}
	
	/*
		aggiunge un prodotto alla lista
	*/
	public static boolean aggiungiProdotto(){
		String nome = Main.scannerString("Inserisci il nome del prodotto da aggiungere");
		int quantita = Main.scannerInt("Inserisci la quantita' del prodotto da aggiungere");
		double prezzo = Main.scannerDouble("Inserisci il prezzo del prodotto da aggiungere");
		Prodotto prodotto = new Prodotto(nome, quantita, prezzo);
	}
	
	/*
		rimuove un prodotto dalla lista
	*/
	public static boolean rimuoviprodotto(){
		
	}
	
	/*
		restituisce i prodotti nella lista
	*/
	public static String prodotti(){
		
	}
}