# ServicesRestMascota

## EndPoints
* Lista de Mascotas
  - http://localhost:8081/api/v1/mascota

* Lista de Mascotas con parametro adoptadas (si, no)
  - http://localhost:8081/api/v1/mascota/adoptadas/si

* Para retornar la lista de mascotas filtrada por parametro, se utilizò la anotaciòn @Query y la consulta
  @Query(value = "SELECT * FROM mascota m JOIN tipo_mascota t ON m.tp_mascota_id_tipo_mascota = t.id_tipo_mascota WHERE m.adoptada = :adoptada",
			nativeQuery = true)
	List<Mascota> listMascotasByAdoptada(String adoptada);
