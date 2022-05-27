package model;

public class Veiculo {
	private String marca;
	private String modelo;

	public Veiculo(String vMarca, String vModelo) {
		this.marca = vMarca;
		this.modelo = vModelo;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setMarca(String cMarca) {
		this.marca = cMarca;
	}

	public String getMarca() {
		return this.marca;
	}

	public String dadosFormatados(){		
		return String.format("Marca: %s\nModelo: %s\n",
				this.marca, this.modelo);
	}

}

