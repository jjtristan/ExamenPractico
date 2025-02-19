/**
 * 
 */
package com.paso2.puente.services;

import java.util.List;

import com.paso2.puente.models.Heroe;

/**
 * 
 */
public interface IHeroeService {
	public List<Heroe> findAll();
	
	public Heroe findById(Long Id);
}
