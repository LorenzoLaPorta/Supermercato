import java.util.ArrayList;

public class Supermercato{
	//COSTANTI
	final String prodotti = "./prodotti.txt";
	final String scontrino = "./scontrino.txt";
	//--------
	
	//ATTRIBUTI
	static ArrayList<Prodotto> scaffali;
	String nome = "ELLELUNGA";
	//---------
	Supermercato(String nome){
		this.scaffali = new ArrayList<>();
		this.nome = nome;
	}
	
	/*
		aggiunge un prodotto alla lista
	*/
	public static boolean aggiungiProdotto(){
		String nome = Main.scannerString("Inserisci il nome del prodotto da aggiungere");
		// se i due nomi corrispondono
		for (int i = 0; i < scaffali.size(); i++){
			if ( scaffali.get(i).nome.equals(nome) ){
				return false; // esiste un altro prodotto con lo stesso nome
			}
		}
		int quantita = Main.scannerInt("Inserisci la quantita' del prodotto da aggiungere");
		double prezzo = Main.scannerDouble("Inserisci il prezzo del prodotto da aggiungere");
		Prodotto prodotto = new Prodotto(nome, quantita, prezzo);
		return true; // non esiste un altro prodotto con lo stesso nome
	}
	
	/*
		modifica la quantità di un prodotto
	*/
	public static boolean modificaQuantita(){
		return true;
	}
	
	/*
		modifica il prezzo di un prodotto
	*/
	public static boolean modificaPrezzo(){
		return true;
	}
	
	/*
		rimuove un prodotto dalla lista
	*/
	public static boolean rimuoviProdotto(){
		int inserimento = Main.scannerInt("SCEGLI UN PRODOTTO DA ELIMINARE \n") - 1;
		System.out.println(prodotti());
		if (inserimento >= scaffali.size){
			return false; // l'inserimento supera la dimensione dell'arraylist
		}
		scaffali.remove(inserimento);
		return true;
	}
	
	/*
		restituisce i prodotti nella lista
	*/
	public static String prodotti(){
		String prodotti = "";
		for (int i =0; i < scaffali.size(); i++){
			prodotti += + (i + 1) + ") " + scaffali.get(i).toString() + "\n";
		}
		return prodotti;
	}
}