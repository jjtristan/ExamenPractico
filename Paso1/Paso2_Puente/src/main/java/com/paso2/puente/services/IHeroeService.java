/**
 * 
 */
package com.paso2.puente.services;

import java.util.List;

import com.paso2.puente.models.Heroe;

/**
 * Interfaz de los servicios
 */
public interface IHeroeService {

	/**
	 * Metodo de busqueda general
	 * 
	 * @return
	 */
	public List<Heroe> findAll();

	/**
	 * Método de busqueda especializada
	 * 
	 * @param Id
	 * @return
	 */
	public Heroe findById(Long Id);
}
