/**
 * 
 */
package com.paso2.puente.models.dtos;

/**
 * Clase LonginDto 
 */
public class LoginDto {
	private String nombreUsuarioOEmail;
	private String password;

	/**
	 * 
	 */
	public LoginDto() {
		super();
	}

	/**
	 * @param nombreUsuarioOEmail
	 * @param password
	 */
	public LoginDto(String nombreUsuarioOEmail, String password) {
		super();
		this.nombreUsuarioOEmail = nombreUsuarioOEmail;
		this.password = password;
	}

	/**
	 * @return the nombreUsuarioOEmail
	 */
	public String getNombreUsuarioOEmail() {
		return nombreUsuarioOEmail;
	}

	/**
	 * @param nombreUsuarioOEmail the nombreUsuarioOEmail to set
	 */
	public void setNombreUsuarioOEmail(String nombreUsuarioOEmail) {
		this.nombreUsuarioOEmail = nombreUsuarioOEmail;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
