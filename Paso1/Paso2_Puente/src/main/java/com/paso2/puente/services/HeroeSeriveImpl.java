/**
 * 
 */
package com.paso2.puente.services;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paso2.puente.clients.Paso1ClienteRest;
import com.paso2.puente.models.Heroe;

/**
 * 
 */
@Service("serviceHeroe")
public class HeroeSeriveImpl implements IHeroeService {
	
	@Autowired
	private Paso1ClienteRest clienteFeing; 

	@Override
	public List<Heroe> findAll() {
		// TODO Auto-generated method stub
		return clienteFeing.characters().stream()
				.map(p -> new Heroe(p.getId(), p.getNombre(), p.getEdad(), p.getNombreImagen(),p.getDescripcion()))
				.collect(Collectors.toList());
	}

	@Override
	public Heroe findById(Long Id) {
		// TODO Auto-generated method stub
		return clienteFeing.detailHero(Id);
	}

}
