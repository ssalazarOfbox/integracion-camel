package com.company.model;

public class Transporte {
	
	private Long id_transporte;
	private Long id_paquete;
	private String descripcion;
	private Long millas;
	
	public Long getId_transporte() {
		return id_transporte;
	}
	public void setId_transporte(Long id_transporte) {
		this.id_transporte = id_transporte;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Long getMillas() {
		return millas;
	}
	public void setMillas(Long millas) {
		this.millas = millas;
	}
	public Long getId_paquete() {
		return id_paquete;
	}
	public void setId_paquete(Long id_paquete) {
		this.id_paquete = id_paquete;
	}
	

}
