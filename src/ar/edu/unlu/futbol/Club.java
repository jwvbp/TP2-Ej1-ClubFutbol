package ar.edu.unlu.futbol;

import java.time.Month;
import java.util.ArrayList;

public class Club {
	
	
private String listaDeMeses[] = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
	private ArrayList<Socio> misSocios = new ArrayList<Socio>();

	public void agregarSocio(Socio socio) {
		misSocios.add(socio);
	}

	public void listarSocios() {
		for (int i = 0; i < misSocios.size(); i++) {
			System.out.println(misSocios.get(i).toString());
		}
	}

	public void listarSociosPorSuscripcion(String suscripcion) {
		for (int i = 0; i < misSocios.size(); i++) {
			if (misSocios.get(i).suscripcion.getNombre() == suscripcion) {
				System.out.println(misSocios.get(i).toString());
			}
		}
	}

	public void listarSociosPorMes(String mes) {
		int numMes;
		for (int i = 0; i < misSocios.size(); i++) {
			numMes = (misSocios.get(i).fechaIngreso.getMonthValue());
			//System.out.println("numMes:" + numMes + "mes:"+ listaDeMeses[numMes-1]);
			if (listaDeMeses[numMes - 1] == mes) {
				System.out.println(misSocios.get(i).toString());
			}
		}
	}
}
