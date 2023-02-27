package com.br.entrePatas.service;

/*import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.br.entrePatas.model.Pessoa;
import com.br.entrePatas.repository.PessoaRepository;
import com.br.entrePatas.security.UserSS;

@Service
public class UserDetailServiceImpl implements UserDetailsService{

	@Autowired
	private PessoaRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Optional<Pessoa> user = repository.findByEmail(email);
		if (user.isPresent()) {
			return new UserSS(user.get().getIdPessoa(), user.get().getEmail(), user.get().getSenha());
		}
		throw new UsernameNotFoundException(email);
	}

}*/
