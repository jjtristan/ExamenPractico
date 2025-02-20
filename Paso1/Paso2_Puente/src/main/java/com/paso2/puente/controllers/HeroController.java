/**
 * 
 */
package com.paso2.puente.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paso2.puente.models.Heroe;
import com.paso2.puente.services.IHeroeService;

/**
 * 
 */
@RestController
@RequestMapping("/api/v1/public")
public class HeroController {

	final private IHeroeService heroService;

	/**
	 * @param heroService
	 */
	public HeroController(IHeroeService heroService) {
		this.heroService = heroService;
	}

	@GetMapping("/characters")
	public List<Heroe> characters() {
		return heroService.findAll();
	}

	@GetMapping("/characters/{characterId}")
	public ResponseEntity<Heroe> detailHero(@PathVariable Long characterId) {
		Heroe heroOptional = heroService.findById(characterId);

		if (heroOptional != null) {
			return ResponseEntity.ok(heroOptional);
		}

		return ResponseEntity.notFound().build();
	}

}
