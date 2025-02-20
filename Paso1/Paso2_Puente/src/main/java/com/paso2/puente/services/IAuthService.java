/**
 * 
 */
package com.paso2.puente.services;

import com.paso2.puente.models.dtos.LoginDto;

/**
 * 
 */
public interface IAuthService {
	public String login(LoginDto loginDto);
}
