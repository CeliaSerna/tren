package com.cursoceat.empleados;

public class Mecanico {

	private String nombre;
	private String telefono;
	public enum Especialidad {
	FRENOS, HIDRAULICA, ELECTRICIDAD, MOTOR}
	Especialidad especialidad;

	public Mecanico(String nombre, String telefono, String especialidad) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.especialidad = Especialidad.valueOf(especialidad);
	}
	
	
	
}
