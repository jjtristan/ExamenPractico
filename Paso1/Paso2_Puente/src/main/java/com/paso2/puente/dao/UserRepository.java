package com.paso2.puente.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paso2.puente.models.entities.Usuario;

/**
 * Repositorio para las operaciones/transacciones de usuario
 */
public interface UserRepository extends JpaRepository<Usuario, Long>{
	
	Optional<Usuario> findBynombreUsuarioOrCorreo(String nombreUsuario, String correo);

}
