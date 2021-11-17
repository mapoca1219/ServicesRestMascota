package com.siesa.servicerest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.siesa.servicerest.models.Mascota;
import com.siesa.servicerest.services.MascotaServices;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/mascota")
@ResponseBody
public class MascotasController {

	@Autowired
	private MascotaServices mascotaServices;
	
	@GetMapping
	public ResponseEntity<List<Mascota>> listaMascotas(){
		return ResponseEntity.ok(mascotaServices.listaMascotas());
	}
	
	@GetMapping("/adoptadas/{adoptada}")
	public ResponseEntity<List<Mascota>> listaAdoptadas(@PathVariable("adoptada")String adoptada){
		return ResponseEntity.ok(mascotaServices.listAdoptadas(adoptada));
	}
}
