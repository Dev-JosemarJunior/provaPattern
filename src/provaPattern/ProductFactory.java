package provaPattern;

public abstract class  ProductFactory {
	
	public abstract ProductIF createProduto(String nome, String codUnico);
	
	public ProductIF getProduto(String nome, String codUnico) {
		
		ProductIF produto = this.createProduto(nome, codUnico);
		return produto;
		
	}
	
}
