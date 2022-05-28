package view;

import model.Carro;
import model.Moto;


public class Main {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro("BMW","X1", 4);
		System.out.println(carro1.dadosFormatados());

		Moto moto1 = new Moto("Yamaha","Roadstar Nehmesis","Automática V-MATIC");
		System.out.println(moto1.dadosFormatados());
	}

}
