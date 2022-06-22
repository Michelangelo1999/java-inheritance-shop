package jana60.shop;

public class Cuffia extends Prodotto {
	
	private String colore;
	private boolean wireless;
	
	public Cuffia(int codice, String nome, String marca, double prezzo, int percIva, String colore, boolean wireless) {
		super(codice, nome, marca, prezzo, percIva);
		this.colore = colore;
		this.wireless = wireless;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public boolean isWireless() {
		return wireless;
	}

	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}
	
	public String typePods() {
		if(wireless) {
			return "wireless";
		}else {
			return "cablate";
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + " - " + colore + " - " + typePods();
	}
	
	

}
