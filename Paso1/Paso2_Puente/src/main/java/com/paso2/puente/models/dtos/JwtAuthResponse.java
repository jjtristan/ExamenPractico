/**
 * 
 */
package com.paso2.puente.models.dtos;

/**
 * Clase JwtAuthResponse
 */
public class JwtAuthResponse {
	private String accessToken;
	private String tokenType = "Bearer";

	/**
	 * Constructor
	 */
	public JwtAuthResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param accessToken
	 * @param tokenType
	 */
	public JwtAuthResponse(String accessToken, String tokenType) {
		super();
		this.accessToken = accessToken;
		this.tokenType = tokenType;
	}

	/**
	 * @return the accessToken
	 */
	public String getAccessToken() {
		return accessToken;
	}

	/**
	 * @param accessToken the accessToken to set
	 */
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	/**
	 * @return the tokenType
	 */
	public String getTokenType() {
		return tokenType;
	}

	/**
	 * @param tokenType the tokenType to set
	 */
	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}

}
