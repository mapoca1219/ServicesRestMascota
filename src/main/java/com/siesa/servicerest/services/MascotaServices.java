package com.siesa.servicerest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.siesa.servicerest.models.Mascota;
import com.siesa.servicerest.repository.MascotasRepository;

@Service
public class MascotaServices{

	@Autowired
	MascotasRepository mascotasRepository;
	
	public List<Mascota> listaMascotas() {
		return mascotasRepository.findAll();
	}
	
	public List<Mascota> listAdoptadas(String adoptada){
		return mascotasRepository.listMascotasByAdoptada(adoptada);
	}
	
}
