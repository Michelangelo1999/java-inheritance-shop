package jana60.shop;

public class Smartphone extends Prodotto {
	
	private int codiceImei;
	private int memoria;
	
	public Smartphone(int codice, String nome, String marca, double prezzo, int percIva, int codiceImei, int memoria) {
		super(codice, nome, marca, prezzo, percIva);
		this.codiceImei = codiceImei;
		this.memoria = memoria;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public int getCodiceImei() {
		return codiceImei;
	}
	
	@Override
	public String toString() {
		return super.toString() + " - " + "IMEI: " + codiceImei + " - " + memoria + "GB";
	}
	
	

}
