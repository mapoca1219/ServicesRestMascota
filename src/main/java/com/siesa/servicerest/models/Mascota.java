package com.siesa.servicerest.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="mascota")
public class Mascota {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_mascota;
	
	@Column(name = "nombre_mascota" ,length = 25,nullable = true)
	private String nombre_mascota;
	
	@Column(name = "adoptada" ,length = 25,nullable = true)
	private String adoptada;
	
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JsonIgnore
	private Tipo_Mascots tpMascota;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JsonIgnore
	private Propietario propietario;

	public Long getId_mascota() {
		return id_mascota;
	}

	public void setId_mascota(Long id_mascota) {
		this.id_mascota = id_mascota;
	}

	public String getNombre_mascota() {
		return nombre_mascota;
	}

	public void setNombre_mascota(String nombre_mascota) {
		this.nombre_mascota = nombre_mascota;
	}

	public Tipo_Mascots getTpMascota() {
		return tpMascota;
	}

	public void setTpMascota(Tipo_Mascots tpMascota) {
		this.tpMascota = tpMascota;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	
	public String getAdoptada() {
		return adoptada;
	}

	public void setAdoptada(String adoptada) {
		this.adoptada = adoptada;
	}

	@Override
	public String toString() {
		return "Mascota [id_mascota=" + id_mascota + ", nombre_mascota=" + nombre_mascota + ", adoptada=" + adoptada
				+ ", tpMascota=" + tpMascota + ", propietario=" + propietario + "]";
	}	

}
