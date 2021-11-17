INSERT INTO `propietario` (`Id_Propietario`, `nombre`, `direccion`, `telefono`, `correo`, `comentario`) VALUES
(0, 'juan', 'Siempre viva', '4356273', 'juan@gmail.com', 'este es el tercero'),
(1, 'Marco', 'AV 2B2', '98765433', 'ma@gmail.com', 'este es el primero'),
(2, 'Camilo', 'Calle 74', '123454321', 'camilo@gmail.com', 'este es el segundo'),
(3, 'juan', 'Siempre viva', '4356273', 'juan@gmail.com', 'este es el tercero'),
(4, 'RAFAEL', 'Siempre viva 2', '98765437', 'rafael@gmail.com', 'este es el cuarto'),
(5, 'Cristian', 'Siempre viva25', '25498765', 'cristian@gmail.com', 'no tengo mascota');

INSERT INTO `tipo_mascota` (`id_tipo_mascota`, `Descripcion`) VALUES
(1, 'Perro'),
(2, 'Oveja'),
(3, 'Caballo'),
(4, 'Peresoso'),
(5, 'Gato'); 

INSERT INTO `mascota` (`Id_Mascota`, `Nombre_Mascota`,  `ADOPTADA` , `tp_mascota_id_tipo_mascota`, `propietario_id_propietario`) VALUES
(1, 'Sanyu', 'no', 1, 1),
(2, 'garfiel', 'si', 5, 3),
(3, 'Rayo', 'no', 3, 0),
(4, 'mee', 'si', 2, 3),
(5, 'Maquien', 'no', 4, 4),
(6, 'Wins', 'si', 1, 0);