package com.siesa.servicerest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.siesa.servicerest.models.Tipo_Mascots;

@Repository
public interface TipoMascotaRepository extends JpaRepository<Tipo_Mascots, Integer> {

}
