package model;

public class Carro extends Veiculo{
	private int numPortas;

	public Carro(String pMarca, String pModelo, int pNumPortas) {
		super(pMarca, pModelo);
		this.numPortas = pNumPortas;	
	}

	public int getNumPortas() {
		return this.numPortas;
	}

	public void setMarca( int pNumPortas) {
		this.numPortas = pNumPortas;
	}
	@Override
	public String dadosFormatados(){
		String dadosVeiculo = super.dadosFormatados();
		String titulo = String.format("Carro\n");
		String dadosCarro = String.format("NumPortas: %s\n",
				this.numPortas);

		return titulo + dadosVeiculo + dadosCarro;

	}
}