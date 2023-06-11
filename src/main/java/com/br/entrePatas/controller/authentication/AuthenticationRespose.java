package com.br.entrePatas.controller.authentication;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthenticationRespose {

	public AuthenticationRespose(String jwtToken) {
		// TODO Auto-generated constructor stub
	}

	public String getTokenJwt() {
		return tokenJwt;
	}

	public void setTokenJwt(String tokenJwt) {
		this.tokenJwt = tokenJwt;
	}

	public String tokenJwt;
}
