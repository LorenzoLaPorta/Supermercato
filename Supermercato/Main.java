import java.util.Scanner;

public class Main{
	//OGGETTI
	static Scanner scanner = new Scanner(System.in);
	//-------
	
	/*
		scrive nel file voluto una stringa definita
	*/
	public static boolean scrivi(String stringa, String percorso){
		
		return true;
	}
	
	/*
		legge il contenuto di un file voluto
	*/
	public static boolean leggi(String percorso){
		
		return true;
	}
	
	/*
		usa lo scanner per prendere valori String
	*/
	public static String scannerString(String messaggio){
		System.out.println(messaggio);
		return scanner.nextLine();
	}
	
	/*
		usa lo scanner per prendere valori int
	*/
	public static int scannerInt(String messaggio){
		System.out.println(messaggio);
		int input = scanner.nextInt();
		scanner.nextLine();
		return input;
	}
	
	/*
		usa lo scanner per prendere valori double
	*/
	public static double scannerDouble(String messaggio){
		System.out.println(messaggio);
		double input = scanner.nextDouble();
		scanner.nextLine();
		return input;
	}
	
	/*
		menu per gli input
	*/
	public static String menu(){
		String menu = "SCEGLI UNA DELLE SEGUENTI OPZIONI \n";
		menu += "0) esci \n";
		menu += "1) aggiungi prodotto nel supermercato \n";
		menu += "2) rimuovi prodotto nel supermercato \n";
		menu += "3) visualizza prodotti nel supermercato \n";
		menu += "4) aggiungi prodotto al carrello \n";
		menu += "5) rimuovi prodotto dal carrello \n";
		menu += "6) visualizza prodotti \n";
		menu += "7) visualizza scontrino \n";
		menu += "8) stampa scontrino \n";
		return menu;
	}
	
	public static void main(String[] args){
		String inserimento;
		//IMPORTA IL FILE PRODOTTI
		
		do{
			menu();
			inserimento = scannerString("");
			
			switch (inserimento){
				case "0":
					break;
				case "1":
					
					break;
				case "2":
					
					break;
				case "3":
					
					break;
				case "4":
					
					break;
				case "5":
					
					break;
				case "6":
					
					break;
				case "7":
					
					break;
				case "8":
					
					break;
				default:
					break;
			}
		} while(!inserimento.equals("0"));
		
		//SALVA IL FILE PRODOTTI
	}
}