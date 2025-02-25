/**
 * 
 */
package com.paso1.consumo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.paso1.consumo.entyties.Heroe;
import com.paso1.consumo.repositories.IHeroeRepository;

/**
 * Servicio heroes
 */
@Service
public class HeroeServiceImpl implements IHeroeService {

	@Autowired
	private IHeroeRepository heroeRepository;


	@Override
	@Transactional(readOnly = true)
	public List<Heroe> FindAll() {
		return (List<Heroe>) heroeRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Heroe> FindById(long id) {
		return heroeRepository.findById(id);
	}

}
