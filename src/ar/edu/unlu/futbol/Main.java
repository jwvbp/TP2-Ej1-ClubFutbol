package ar.edu.unlu.futbol;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Club miClub = new Club();
		ArrayList<Enum> actBasica = new ArrayList<Enum>();
		actBasica.add(Actividad.GIMNASIO);
		actBasica.add(Actividad.PILETA);
		ArrayList<Enum> actIntermedia = new ArrayList<Enum>();
		actIntermedia.add(Actividad.GIMNASIO);
		actIntermedia.add(Actividad.PILETA);
		actIntermedia.add(Actividad.SAUNA);
		ArrayList<Enum> actDestacada = new ArrayList<Enum>();
		actDestacada.add(Actividad.GIMNASIO);
		actDestacada.add(Actividad.PILETA);
		actDestacada.add(Actividad.SAUNA);
		actDestacada.add(Actividad.FUTBOL);
		Suscripcion basica = new Suscripcion("Suscr Basica", 100.00, actBasica);
		Suscripcion intermedia = new Suscripcion("Suscr Intermedia", 200.00, actIntermedia);
		Suscripcion destacada = new Suscripcion("Suscr Destacada", 300.00, actDestacada);

		Socio socio1 = new Socio("juan", "juan@mail.com", 12345, "Av 25", basica, "2023-05-10");
		miClub.agregarSocio(socio1);
		Socio socio2 = new Socio("jose", "jose@mail.com", 23456, "Av 26", basica, "2023-05-15");
		miClub.agregarSocio(socio2);
		Socio socio3 = new Socio("pedro", "pedro@mail.com", 12345, "Av 25", basica, "2023-06-10");
		miClub.agregarSocio(socio3);
		Socio socio4 = new Socio("maria", "maria@mail.com", 12345, "Av 25", intermedia, "2023-06-20");
		miClub.agregarSocio(socio4);
		Socio socio5 = new Socio("andrea", "andrea@mail.com", 12345, "Av 25", intermedia, "2023-07-10");
		miClub.agregarSocio(socio5);
		Socio socio6 = new Socio("elisa", "elisa@mail.com", 12345, "Av 25", destacada, "2023-08-10");
		miClub.agregarSocio(socio6);

		System.out.println("----todos los socios-------");
		miClub.listarSocios();
		System.out.println("----socios de junio-------");
		miClub.listarSociosPorMes("junio");
		System.out.println("----socios de julio-------");
		miClub.listarSociosPorMes("julio");
		System.out.println("----socios suscr intermedia-------");
		miClub.listarSociosPorSuscripcion("Suscr Intermedia");
	}

}
