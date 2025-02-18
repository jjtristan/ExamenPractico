package com.paso1.consumo.services;

import java.util.List;
import java.util.Optional;

import com.paso1.consumo.entyties.Heroe;

public interface IHeroeService {

	List<Heroe> FindAll();
	
	Optional<Heroe> FindById(long id);

}
