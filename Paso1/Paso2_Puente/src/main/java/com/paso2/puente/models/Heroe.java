/**
 * 
 */
package com.paso2.puente.models;

import jakarta.persistence.Column;

/**
 * 
 */
public class Heroe {

	private long id;
	
	/**
	 * Nombre del heroe
	 */
	private String nombre;
	
	/**
	 * Edad del heroe
	 */
	private long edad;
	
	/**
	 * Nombre de la imagen a mostrar del heroe
	 */
	private String nombreImagen;
	
	/**
	 * Descripción o algún detalle del heroe
	 */
	private String descripcion;

	/**
	 * 
	 */
	public Heroe() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param nombre
	 * @param edad
	 * @param nombreImagen
	 * @param descripcion
	 */
	public Heroe(long id, String nombre, long edad, String nombreImagen, String descripcion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.nombreImagen = nombreImagen;
		this.descripcion = descripcion;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the edad
	 */
	public long getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(long edad) {
		this.edad = edad;
	}

	/**
	 * @return the nombreImagen
	 */
	public String getNombreImagen() {
		return nombreImagen;
	}

	/**
	 * @param nombreImagen the nombreImagen to set
	 */
	public void setNombreImagen(String nombreImagen) {
		this.nombreImagen = nombreImagen;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
