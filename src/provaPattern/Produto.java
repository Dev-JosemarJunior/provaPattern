package provaPattern;

public abstract class Produto {
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	private String nome;
	private String codigoUnico;
	public String description;
	
	public Produto() {
		
	}
	
	public Produto(String description) {
		this.description = description;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigoUnico() {
		return this.codigoUnico;
	}

	public void setCodigoUnico(String codigoUnico) {
		this.codigoUnico = codigoUnico;
	}
}
