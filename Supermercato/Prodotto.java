public class Prodotto{
	
	//ATTRIBUTI
	String nome;
	int quantita;
	double prezzo;
	//---------
	Prodotto(String nome, int quantita, double prezzo){
		this.nome = nome;
		this.quantita = quantita;
		this.prezzo = prezzo;
	}
	
	@Override
	public String toString(){
		return this.nome + " (" + this.quantita + "), prezzo:" + this.prezzo;
	}
}