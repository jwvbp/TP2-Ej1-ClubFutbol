package ar.edu.unlu.futbol;

import java.time.LocalDate;

public class Socio {
	private String nombre;
	private String email;
	private int telefono;
	private String direccion;
	public Suscripcion suscripcion;
	public LocalDate fechaIngreso;

	public Socio(String nombre, String email, int telefono, String direccion, Suscripcion suscripcion,
			String fechaIngreso) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
		this.direccion = direccion;
		this.suscripcion = suscripcion;
		this.fechaIngreso = LocalDate.parse(fechaIngreso);
	}

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getEmail() {
		return email;
	}

	private void setEmail(String email) {
		this.email = email;
	}

	private int getTelefono() {
		return telefono;
	}

	private void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	private String getDireccion() {
		return direccion;
	}

	private void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	private Suscripcion getSuscripcion() {
		return suscripcion;
	}

	private void setSuscripcion(Suscripcion suscripcion) {
		this.suscripcion = suscripcion;
	}

	private LocalDate getFechaingreso() {
		return fechaIngreso;
	}

	private void setFechaingreso(LocalDate fechaingreso) {
		this.fechaIngreso = fechaingreso;
	}

	@Override
	public String toString() {
		return "Socio [nombre=" + nombre + ", email=" + email + ", telefono=" + telefono + ", direccion=" + direccion
				+ ", suscripcion=" + suscripcion.getNombre() + ", fechaIngreso=" + fechaIngreso + "]";
	}
	

}
