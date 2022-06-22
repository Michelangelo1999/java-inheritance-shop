package jana60.shop;

import java.text.DecimalFormat;

public class Prodotto {
	
	private int codice;
	private String nome;
	private String marca;
	private double prezzo;
	private int percIva;
	private DecimalFormat df = new DecimalFormat(".00€");
	
	public Prodotto(int codice, String nome, String marca, double prezzo, int percIva) {
		this.codice = codice;
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		this.percIva = percIva;
	}

	public int getCodice() {
		return codice;
	}

	public String getNome() {
		return nome;
	}

	public String getMarca() {
		return marca;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public int getPercIva() {
		return percIva;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public void setPercIva(int percIva) {
		this.percIva = percIva;
	}

	public double prezzoTot() {
		return prezzo+(prezzo/100)*percIva;
	}
	
	public String formattaPrezzo() {
		return df.format(prezzoTot());
	}
	
	@Override
	public String toString() {
		return "ID: " + codice + " - " + nome + " - " + marca + " - " + formattaPrezzo();
	}

}
