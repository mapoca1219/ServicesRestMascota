package com.siesa.servicerest.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="tipo_mascota")
public class Tipo_Mascots {
	
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id_tipo_mascota;
		
		@Column(name = "descripcion" ,length = 25,nullable = true)
		private String descripcion;
		
				
		

//		@ManyToOne(cascade=CascadeType.ALL)
//		private Tipo_Mascots id_adoptado;


		@Override
		public String toString() {
			return "Tipo_Mascots [id_tipo_mascota=" + id_tipo_mascota + ", descripcion=" + descripcion + "]";
		}


		public Long getId_tipo_mascota() {
			return id_tipo_mascota;
		}


		public void setId_tipo_mascota(Long id_tipo_mascota) {
			this.id_tipo_mascota = id_tipo_mascota;
		}


		public String getDescripcion() {
			return descripcion;
		}


		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}


//		public List<Adoptada> getId_adoptado() {
//			return id_adoptado;
//		}
//
//
//		public void setId_adotado(List<Adoptada> id_adoptado) {
//			this.id_adoptado = id_adoptado;
//		}
		
}
