package com.siesa.servicerest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.siesa.servicerest.models.Propietario;

@Repository
public interface PropietariosRepository extends JpaRepository<Propietario, Integer> {

}
