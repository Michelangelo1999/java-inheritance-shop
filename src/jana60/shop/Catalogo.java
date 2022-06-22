package jana60.shop;

import java.util.Random;
import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rnd = new Random();
		
		System.out.println("Riempiamo un catalogo: quanti prodotti vuoi inserire?");
		int numeroProdotti = Integer.parseInt(scan.nextLine());
		
		Prodotto[] listaProdotti = new Prodotto[numeroProdotti];
		
		for(int i = 0; i < listaProdotti.length; i++) {
			
			int counter = i+1;
			
			System.out.println("Prodotto " + counter + ": che prodotto vuoi inserire? smartphone - televisione - cuffie");
			String prodotto = scan.nextLine();
			
			if(prodotto.equalsIgnoreCase("smartphone")) {
				int codice = rnd.nextInt(1001);
				System.out.println("Nome: ");
				String nome = scan.nextLine();
				System.out.println("Marca: ");
				String marca = scan.nextLine();
				System.out.println("Prezzo: ");
				double prezzo = Double.parseDouble(scan.nextLine());
				System.out.println("Percentuale iva: ");
				int percIva = Integer.parseInt(scan.nextLine());
				int imei = rnd.nextInt(1001);
				System.out.println("Memoria: ");
				int memoria = Integer.parseInt(scan.nextLine());
				
				listaProdotti[i] = new Smartphone(codice, nome, marca, prezzo, percIva, imei, memoria);
				
			}else if(prodotto.equalsIgnoreCase("televisione")) {
				int codice = rnd.nextInt(1001);
				System.out.println("Nome: ");
				String nome = scan.nextLine();
				System.out.println("Marca: ");
				String marca = scan.nextLine();
				System.out.println("Prezzo: ");
				double prezzo = Double.parseDouble(scan.nextLine());
				System.out.println("Percentuale iva: ");
				int percIva = Integer.parseInt(scan.nextLine());
				System.out.println("Pollici: ");
				int pollici = Integer.parseInt(scan.nextLine());
				System.out.println("Smart? -> Yes | No");
				String answer = scan.nextLine();
				boolean smart = false;
				if(answer.equalsIgnoreCase("yes")) {
					smart = true;
				}
				
				listaProdotti[i] = new Televisore(codice, nome, marca, prezzo, percIva, pollici, smart);
				
			}else if(prodotto.equalsIgnoreCase("cuffie")) {
				int codice = rnd.nextInt(1001);
				System.out.println("Nome: ");
				String nome = scan.nextLine();
				System.out.println("Marca: ");
				String marca = scan.nextLine();
				System.out.println("Prezzo: ");
				double prezzo = Double.parseDouble(scan.nextLine());
				System.out.println("Percentuale iva: ");
				int percIva = Integer.parseInt(scan.nextLine());
				System.out.println("Colore: ");
				String colore = scan.nextLine();
				System.out.println("Wirless? -> Yes | No");
				String answer = scan.nextLine();
				boolean wireless = false;
				if(answer.equalsIgnoreCase("yes")) {
					wireless = true;
				}
				
				listaProdotti[i] = new Cuffia(codice, nome, marca, prezzo, percIva, colore, wireless);
				
			}else {
				System.out.println("inserimento non valido.Non prenderemo in considerazione questo prodotto.");
				listaProdotti[i] = new Prodotto(0, null, null, 0, 0);
			}
			
		}
		
		for(int i = 0; i < listaProdotti.length; i++) {
			int counter = i+1;
			System.out.println("Prodotto " + counter + ": " + listaProdotti[i]);
		}
		
		
		
//		Prodotto[] prodotti = new Prodotto[30];
//		prodotti[0] = new Smartphone(1, null, null, 0, 0, 0, 0);
//		
//		Prodotto p = prodotti[0];
//		if (p instanceof Smartphone) {
//			Smartphone pp = (Smartphone)p;
//		}
			
		
				
		scan.close();
	}

}
