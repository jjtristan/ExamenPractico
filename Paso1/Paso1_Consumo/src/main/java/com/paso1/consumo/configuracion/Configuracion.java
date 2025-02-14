package com.paso1.consumo.configuracion;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Clase donde se encuentran mis
 */
@Component
public class Configuracion {

	/**
	 * Url base del servio de terceros
	 */
	@Value("${paso1_consumo.urlBase}")
	private String urlBase;
	
	/**
	 * Endpoint general 
	 */
	@Value("${paso1_consumo.enpoint.general}")
	private String endpointGeneral;
	
	/**
	 * @return Url para la busqueda 
	 */
	public String getUrlConsulta() {
		return urlBase.concat(endpointGeneral);
	}
}
