/**
 * 
 */
package com.paso1.consumo;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.paso1.consumo.entyties.Heroe;
import com.paso1.consumo.services.HeroeServiceImpl;
import com.paso1.consumo.services.IHeroeService;

/**
 * Tests de servicios de heroes
 */
public class HeroesServiceTest {

	
	private IHeroeService heroeService;

	@BeforeEach
	private void setUp() {
		this.heroeService = new HeroeServiceImpl();
	}
	
	
	@DisplayName("Verificar que la lista de heroes no este vacia.")
	@Test
	public void ObtieneListadoConDatos() {
		Assertions.assertFalse(this.heroeService.FindAll().isEmpty());
	}

	@DisplayName("Obtiene el listado de heroes y de este revisa que exista su detalle.")
	@Test
	public void ValidacionDetalle() {
		List<Heroe> heroes = this.heroeService.FindAll();
		if (heroes.size() > 0) {
			try {
				Long id = heroes.get(0).getId();
				Optional<Heroe> heroe = this.heroeService.FindById(id);
				Assertions.assertTrue(heroe.isPresent());
				
				Assertions.assertTrue(!heroe.get().getDescripcion().isEmpty());
			} catch (Exception e) {
				Assertions.fail("Fallo la prueba");
			}
		} else {
			Assertions.fail("Sin Datos en la lista");
		}
	}
}
