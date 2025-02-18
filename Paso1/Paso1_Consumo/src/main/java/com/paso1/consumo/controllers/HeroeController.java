/**
 * 
 */
package com.paso1.consumo.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.paso1.consumo.entyties.Heroe;
import com.paso1.consumo.services.IHeroeService;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


/**
 * 
 */
@RestController
public class HeroeController {
	
	final private IHeroeService heroeService;

	/**
	 * @param heroeService
	 */
	public HeroeController(IHeroeService heroeService) {
		this.heroeService = heroeService;
	}
	
	@GetMapping("v1/public/characters")
	public List<Heroe> characters() {
		return heroeService.FindAll();
	}
	
	@GetMapping("v1/public/characters/{characterId}")
	public ResponseEntity<Heroe> detailHero(@PathVariable Long characterId) {
		Optional<Heroe> heroOptional = heroeService.FindById(characterId);
		
		if (heroOptional.isPresent()) {
			return ResponseEntity.ok(heroOptional.orElseThrow());
		}
		
		return ResponseEntity.notFound().build();
	}
	
	
}
