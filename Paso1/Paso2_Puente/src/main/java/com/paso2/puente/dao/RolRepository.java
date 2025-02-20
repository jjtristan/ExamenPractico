package com.paso2.puente.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paso2.puente.models.entities.Rol;

public interface RolRepository extends JpaRepository<Rol, Long>{

	Rol findByNombre(String nombre);
}
