/**
 * 
 */
package com.paso1.consumo.entyties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Entidad Heroe
 */
@Entity
@Table(name="heroes")
public class Heroe {
	/**
	 * Llave de registro
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
	@Column(name = "nombre_imagen")
	private String nombreImagen;
	
	/**
	 * Descripción o algún detalle del heroe
	 */
	@Column(length = 700)
	private String descripcion;
	
	/**
	 * @param id
	 * @param nombre
	 * @param edad
	 * @param nombreImagen
	 * @param descripcion
	 */
	public Heroe(long id, String nombre, long edad, String nombreImagen, String descripcion) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.nombreImagen = nombreImagen;
		this.descripcion = descripcion;
	}

	/**
	 * Constructor vacio
	 */
	public Heroe() {
		// TODO Auto-generated constructor stub
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
