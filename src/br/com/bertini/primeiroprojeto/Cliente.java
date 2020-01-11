package br.com.bertini.primeiroprojeto;

public class Cliente {

	private int idadePrimitivo;
	private boolean clientePrimitivo;
	private double valorPrimitivo;
	
	private Integer idadeWrapper;
	private Boolean clienteAtivoWrapper;
	private Double valorWrapper;

	public int getIdadePrimitivo() {
		return idadePrimitivo;
	}
	public void setIdadePrimitivo(int idadePrimitivo) {
		this.idadePrimitivo = idadePrimitivo;
	}
	public boolean isClientePrimitivo() {
		return clientePrimitivo;
	}
	public void setClientePrimitivo(boolean clientePrimitivo) {
		this.clientePrimitivo = clientePrimitivo;
	}
	public double getValorPrimitivo() {
		return valorPrimitivo;
	}
	public void setValorPrimitivo(double valorPrimitivo) {
		this.valorPrimitivo = valorPrimitivo;
	}
	public Integer getIdadeWrapper() {
		return idadeWrapper;
	}
	public void setIdadeWrapper(Integer idadeWrapper) {
		this.idadeWrapper = idadeWrapper;
	}
	public Boolean getClienteAtivoWrapper() {
		return clienteAtivoWrapper;
	}
	public void setClienteAtivoWrapper(Boolean clienteAtivoWrapper) {
		this.clienteAtivoWrapper = clienteAtivoWrapper;
	}
	public Double getValorWrapper() {
		return valorWrapper;
	}
	public void setValorWrapper(double valorWrapper) {
		this.valorWrapper = valorWrapper;
	}
	@Override
	public String toString() {
		return "Cliente [idadePrimitivo=" + idadePrimitivo + ", clientePrimitivo=" + clientePrimitivo
				+ ", valorPrimitivo=" + valorPrimitivo + ", idadeWrapper=" + idadeWrapper + ", clienteAtivoWrapper="
				+ clienteAtivoWrapper + ", valorWrapper=" + valorWrapper + "]";
	}
	
	}


