package com.cursoceat.maquinaria;

import com.cursoceat.empleados.Maquinista;

public class Trenes {

Locomotora locomotora ;
Maquinista responsable;
Vagon vagones[];
private int numVagones;

public Trenes(Locomotora locomotora, Maquinista responsable) {
	this.locomotora = locomotora;
	this.responsable = responsable;
vagones = new Vagon[5];
numVagones=0;

}
public void engancharVagon(int cargaMax,int cargaActual,String tipoMercancia){
	
	if (numVagones>=5) {
		System.out.println("El tren no admite más vagones");
		
	}else {
Vagon v = new Vagon(cargaMax, cargaActual, tipoMercancia);
vagones[numVagones]=v;
numVagones++;
	}
}




}
