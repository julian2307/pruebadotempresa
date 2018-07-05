package com.prueba.empresa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.empresa.entities.Cotizacion;
import com.prueba.empresa.entities.Socio;
import com.prueba.empresa.exception.ExceptionSocio;
import com.prueba.empresa.repository.SocioRepository;

@Service
public class CotizacionService {

	@Autowired
	SocioRepository socioRepositorio;

	public Cotizacion Cotizar(final float valor)
	{
		Cotizacion dtoCotizacion = null;
		try
		{
			List<Socio> socios = (List<Socio>) socioRepositorio.findSocioDisponibles(valor);
			if(socios.isEmpty() || socios == null) throw new ExceptionSocio();
			dtoCotizacion = new Cotizacion();
			dtoCotizacion.setNombre(socios.get(0).getNombre());
			dtoCotizacion.setTasaInteres(socios.get(0).getTasaInteres() + "%");
			
			dtoCotizacion.setMontoTotal(calcularValor(valor, socios.get(0).getTasaInteres()));
			dtoCotizacion.setCuotaMes(dtoCotizacion.getMontoTotal() / 36); 
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
			
		return dtoCotizacion;
	}
	
	private float calcularValor(float valor, float tasaInteres)
	{
		return (valor * (1 + ((tasaInteres/100) * 36))); 
	}



}
