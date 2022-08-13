package br.com.tudodebom.model;


public class Produto {

	/* Atributos */
	private Integer idProduto;
	private String nomeProduto;
	private Integer qtdProduto;
	
	/* Se o produto é do tipo medicamento */
	private boolean tipoMedicamento;
	
	/* se o produto é do tipo medicamento generico */
	private boolean tipoGenerico;
	private Double preco;
	
	
	public Integer getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public Integer getQtdProduto() {
		return qtdProduto;
	}
	public void setQtdProduto(Integer qtdProduto) {
		this.qtdProduto = qtdProduto;
	}
	public boolean isTipoMedicamento() {
		return tipoMedicamento;
	}
	public void setTipoMedicamento(boolean tipoMedicamento) {
		this.tipoMedicamento = tipoMedicamento;
	}
	public boolean isTipoGenerico() {
		return tipoGenerico;
	}
	public void setTipoGenerico(boolean tipoGenerico) {
		this.tipoGenerico = tipoGenerico;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
	
	
}
