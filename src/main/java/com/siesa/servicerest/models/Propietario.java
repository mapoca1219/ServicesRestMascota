package com.siesa.servicerest.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="propietario")
public class Propietario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_propietario;
	
	@Column(name = "nombre" ,length = 25,nullable = true)
	private String nombre;

	@Column(name = "direccion" ,length = 25,nullable = true)
	private String direccion;
	
	@Column(name = "telefono" ,length = 25,nullable = true)
	private String telefono;
	
	@Column(name = "correo" ,length = 25,nullable = true)
	private String correo;
	
	@Column(name = "comentario" ,length = 25,nullable = true)
	private String comentario;

	public Long getId_propietario() {
		return id_propietario;
	}

	public void setId_propietario(Long id_propietario) {
		this.id_propietario = id_propietario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	@Override
	public String toString() {
		return "Propietario [id_propietario=" + id_propietario + ", nombre=" + nombre + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", correo=" + correo + ", comentario=" + comentario + "]";
	}
	
	
}
