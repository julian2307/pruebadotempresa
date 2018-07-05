package com.prueba.empresa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "socios")
public class Socio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "Nombre", nullable = false)
	private String nombre;
	@Column(name="Tasa", columnDefinition="Float(10,2)", nullable = false)
	private float tasaInteres;
	@Column(name = "montoMaximo", columnDefinition="Float(10,2)",nullable = false)
	private float montoMaximo;
	
	public Socio() {}
	
	public Socio(String nombre, float tasaInteres, float montoMaximo) {
		super();
		this.nombre = nombre;
		this.tasaInteres = tasaInteres;
		this.montoMaximo = montoMaximo;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getTasaInteres() {
		return tasaInteres;
	}
	public void setTasaInteres(float tasaInteres) {
		this.tasaInteres = tasaInteres;
	}
	public float getMontoMaximo() {
		return montoMaximo;
	}
	public void setMontoMaximo(float montoMaximo) {
		this.montoMaximo = montoMaximo;
	}
	
	

}
