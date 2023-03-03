package com.cursoceat.maquinaria;

import com.cursoceat.empleados.Mecanico;

public class Locomotora {

	private String matricula;
	private int potencia;
	private int antiguiedad;

	Mecanico mecanico;

	public Locomotora(String matricula, int potencia, int antiguiedad, Mecanico mecanico) {
		this.matricula = matricula;
		this.potencia = potencia;
		this.antiguiedad = antiguiedad;
		this.mecanico = mecanico;
	}
	
	
	
}
