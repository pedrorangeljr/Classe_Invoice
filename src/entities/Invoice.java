package entities;

public class Invoice {
	
	private int id;
	private String descricao;
	private int quantidadeCompradaDeItem;
	private double precoItem;
	 
	public Invoice() {
		
	}
	// Metodo construtor
	public Invoice(int id, String descricao, int quantidadeCompradaDeItem, double precoItem) {
	
		this.id = id;
		this.descricao = descricao;
		if(quantidadeCompradaDeItem < 0)
		{
			quantidadeCompradaDeItem = 0;
		}
		else if(precoItem < 0.0)
		{
			precoItem = 0;
		}
		this.quantidadeCompradaDeItem = quantidadeCompradaDeItem;
		this.precoItem = precoItem;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidadeCompradaDeItem() {
		return quantidadeCompradaDeItem;
	}

	public void setQuantidadeCompradaDeItem(int quantidadeCompradaDeItem) {
		this.quantidadeCompradaDeItem = quantidadeCompradaDeItem;
	}

	public double getPrecoItem() {
		return precoItem;
	}

	public void setPrecoItem(double precoItem) {
		this.precoItem = precoItem;
	}
	
	public double getInvoiceAmout()
	{
		
		return quantidadeCompradaDeItem * precoItem;
	}

    // Metodo toString
	public String toString() {
		return "Id = "
	            + id 
	            + ", descrição = "
	            + descricao 
	            + ",  Quantidade = " + String.format("%d" , quantidadeCompradaDeItem ) 
	            + ",  Preço = " +  precoItem 
	            + ",  Total da Compra = R$ " + String.format("%.2f", getInvoiceAmout());
				
	}
	
	
    
}
