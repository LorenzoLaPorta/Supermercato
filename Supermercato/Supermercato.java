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