/**
 * 
 */
package com.paso1.consumo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.paso1.consumo.entyties.Heroe;

/**
 * Interface Heroe repository
 */
public interface IHeroeRepository extends CrudRepository<Heroe, Long> {

}
