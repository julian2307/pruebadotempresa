package com.prueba.empresa.controllerdtoExternos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name = "cotizacion")
@XmlAccessorType(XmlAccessType.NONE)
public class dtoCotizacion {

	@XmlElement
	private String nombre;
	@XmlElement
	private float cuotaMes;
	@XmlElement
	private float montoTotal;
	@XmlElement
	private String tasaInteres;
	
	public dtoCotizacion() {
		
		
	}
	
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
