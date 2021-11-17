package com.siesa.servicerest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.siesa.servicerest.models.Mascota;

@Repository
public interface MascotasRepository extends JpaRepository<com.siesa.servicerest.models.Mascota, Integer> {

	@Query(value = "SELECT * FROM mascota m JOIN tipo_mascota t ON m.tp_mascota_id_tipo_mascota = t.id_tipo_mascota WHERE m.adoptada = :adoptada",
			nativeQuery = true)
	List<Mascota> listMascotasByAdoptada(String adoptada);
		
}
