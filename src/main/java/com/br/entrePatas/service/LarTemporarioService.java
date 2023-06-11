package com.br.entrePatas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.entrePatas.model.Animal;
import com.br.entrePatas.model.LarTemporario;
import com.br.entrePatas.model.Pessoa;
import com.br.entrePatas.model.dtos.LarTempDTO;
import com.br.entrePatas.repository.LarTemporarioRepository;
import com.br.entrePatas.service.exception.ObjectnotFoundException;

@Service
public class LarTemporarioService {

	@Autowired
	private LarTemporarioRepository larTemporarioRepository;
	@Autowired
	private PessoaService pessoaService;
	@Autowired
	private AnimalService animalService;

	public LarTemporario findById(Integer idLarTemporario) {
		Optional<LarTemporario> obj = larTemporarioRepository.findById(idLarTemporario);
		return obj.orElseThrow(() -> new ObjectnotFoundException("Objeto não encontrado! Id: " + idLarTemporario));
	}

	public List<LarTemporario> findAll() {
		return larTemporarioRepository.findAll();
	}

	public LarTemporario create(LarTempDTO larTemporario) {
		return larTemporarioRepository.save(newLarTemporario(larTemporario));
	}

	public LarTemporario update(Integer idLarTemporario, LarTempDTO larTemporario) {
		larTemporario.setIdLarTemporario(idLarTemporario);
		LarTemporario oldObj = findById(idLarTemporario);
		oldObj = newLarTemporario(larTemporario);
		return larTemporarioRepository.save(oldObj);
	}

	public void delete(Integer idLarTemporario) {
		LarTemporario obj = findById(idLarTemporario);
		larTemporarioRepository.deleteById(idLarTemporario);
	}
	
	private LarTemporario newLarTemporario(LarTempDTO obj) {
		Animal animal = animalService.findById(obj.getAnimal());
		Pessoa pessoa = pessoaService.findById(obj.getPessoa());
		LarTemporario larTemporario = new LarTemporario();
		if(obj.getIdLarTemporario() != null) {
			larTemporario.setIdLarTemporario(obj.getIdLarTemporario());
		}
		
		larTemporario.setAnimal(animal);
		larTemporario.setPessoa(pessoa);
		larTemporario.setDataEntrada(obj.getDataEntrada());
		larTemporario.setDataSaida(obj.getDataSaida());
		larTemporario.setObservacao(obj.getObservacao());
		larTemporario.setFlgStatus(obj.getFlgStatus());

		return larTemporario;
	}
}
