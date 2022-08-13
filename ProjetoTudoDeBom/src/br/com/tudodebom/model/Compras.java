package br.com.tudodebom.model;


import java.time.LocalDate;

/*
 * Classe para representar a entidade Compras
 */
public class Compras {

	/* Atributos */
	private Integer clienteId;
	private Integer codigoCompra;
	private Double valorTotal;
	private LocalDate dataCompra;
	
	
	public Integer getClienteId() {
		return clienteId;
	}
	public void setClienteId(Integer clienteId) {
		this.clienteId = clienteId;
	}
	public Integer getCodigoCompra() {
		return codigoCompra;
	}
	public void setCodigoCompra(Integer codigoCompra) {
		this.codigoCompra = codigoCompra;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public LocalDate getDataCompra() {
		return dataCompra;
	}
	public void setDataCompra(LocalDate dataCompra) {
		this.dataCompra = dataCompra;
	}
	
	
	
	
}
