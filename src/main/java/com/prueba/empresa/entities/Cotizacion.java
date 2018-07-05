package com.prueba.empresa.entities;

public class Cotizacion {
	
	private String nombre;
	private float cuotaMes;
	private float montoTotal;
	private String tasaInteres;
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getCuotaMes() {
		return cuotaMes;
	}
	public void setCuotaMes(float cuotaMes) {
		this.cuotaMes = cuotaMes;
	}
	public float getMontoTotal() {
		return montoTotal;
	}
	public void setMontoTotal(float montoTotal) {
		this.montoTotal = montoTotal;
	}
	public String getTasaInteres() {
		return tasaInteres;
	}
	public void setTasaInteres(String tasaInteres) {
		this.tasaInteres = tasaInteres;
	}
	
	

}
