/**
 * 
 */
package com.paso2.puente.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.paso2.puente.models.Heroe;

/**
 * Clase para el cliente de nuestro proyecto pasado de paso 1
 * configuracion de feign
 */
@FeignClient(name = "Paso1-Consumo", url = "localhost:8030")
public interface Paso1ClienteRest {

	@GetMapping("v1/public/characters")
	public List<Heroe> characters();

	@GetMapping("v1/public/characters/{characterId}")
	public Heroe detailHero(@PathVariable Long characterId);
}
