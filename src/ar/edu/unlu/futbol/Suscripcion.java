package ar.edu.unlu.futbol;

import java.util.ArrayList;

public class Suscripcion {
private String nombre;
private Double valor;
private ArrayList<Actividad> actividades = new ArrayList<>();

public String getNombre() {
	return nombre;
}
private void setNombre(String nombre) {
	this.nombre = nombre;
}
private Double getValor() {
	return valor;
}
private void setValor(Double valor) {
	this.valor = valor;
}
public Suscripcion (String nombre, Double valor, ArrayList actividades) {
	this.nombre = nombre;
	this.valor = valor;
	this.actividades = actividades;

}
}