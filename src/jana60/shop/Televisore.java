package jana60.shop;

public class Televisore extends Prodotto {
	
	private int pollici;
	private boolean smart;
	
	public Televisore(int codice, String nome, String marca, double prezzo, int percIva, int pollici, boolean smart) {
		super(codice, nome, marca, prezzo, percIva);
		this.pollici = pollici;
		this.smart = smart;
	}

	public int getPollici() {
		return pollici;
	}

	public void setPollici(int pollici) {
		this.pollici = pollici;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}
	
	public String tvType() {
		String string = " ";
		if(smart) {
			string = "smart";
		}
		return string;
	}
	
	@Override
	public String toString() {
		return super.toString() + " - " + pollici + " pollici - " + tvType();
	}
	
	

}
