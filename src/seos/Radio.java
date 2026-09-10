package seos;
//Übung Klassendiagramm → Java

public class Radio {

	private boolean eingeschaltet;
	private double frequenz;
	private int lautstarke;
	
	public Radio(){
		this.eingeschaltet = false;
		this.frequenz = 101.1;
		this.lautstarke = 1;
	}
	public Radio(boolean eingeschaltet, double frequenz, int lautstarke) {
		
		this.eingeschaltet = eingeschaltet;
		this.frequenz = frequenz;
		this.lautstarke = lautstarke;
	}
	
	public void an() {
		eingeschaltet = true;
	}
	public void aus() {
		eingeschaltet = false;
	}
	
	public void lauter() {
		if(eingeschaltet && lautstarke < 10) {
			lautstarke ++;
		}
	}
	
	public void leiser() {
		if (eingeschaltet && lautstarke > 0) {
			lautstarke --;
		}		
	}
	
	public void setSender(double frequenz) {
		this.frequenz = frequenz;
	}
	
	public String toString() {
		return "Radio [ ist eingeschaltet = " + eingeschaltet + " Frequenz = " + frequenz + " Lautstärke = " + lautstarke + " ]"; 
	}
	
	
	
}
