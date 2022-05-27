package model;

public class Moto extends Veiculo {

	private String transmissao;

	public Moto(String pMarca, String pModelo, String pTransmissao) {
		super(pMarca, pModelo);
		this.transmissao = pTransmissao;
	}
	public String getNumPortas() {
		return this.transmissao;
	}

	public void setMarca( String pTransmissao) {
		this.transmissao = pTransmissao;
	}
	@Override
	public String dadosFormatados(){
		String dadosVeiculo = super.dadosFormatados();
		String titulo = String.format("Moto\n");
		String dadosMoto = String.format("Trasmissao: %s",
				this.transmissao);

		return titulo + dadosVeiculo + dadosMoto;

	}
}
