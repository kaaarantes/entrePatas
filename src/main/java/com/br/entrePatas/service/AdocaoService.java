package com.br.entrePatas.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.entrePatas.model.Adocao;
import com.br.entrePatas.model.Animal;
import com.br.entrePatas.model.Pessoa;
import com.br.entrePatas.model.dtos.AdocaoDTO;
import com.br.entrePatas.repository.AdocaoRepository;
import com.br.entrePatas.service.exception.ObjectnotFoundException;

@Service
public class AdocaoService {

	@Autowired
	private AdocaoRepository adocaoRepository;
	@Autowired
	private PessoaService pessoaService;
	@Autowired
	private AnimalService animalService;

	public Adocao findById(Integer idAdocao) {
		Optional<Adocao> obj = adocaoRepository.findById(idAdocao);
		return obj.orElseThrow(() -> new ObjectnotFoundException("Objeto não encontrado! Id: " + idAdocao));
	}

	public List<Adocao> findAll() {
		return adocaoRepository.findAll();
	}

	public Adocao create(AdocaoDTO adocao) {
		return adocaoRepository.save(newAdocao(adocao));
	}

	public Adocao update(Integer idAdocao, AdocaoDTO adocao) {
		adocao.setIdAdocao(idAdocao);
		Adocao oldObj = findById(idAdocao);
		oldObj = newAdocao(adocao);
		return adocaoRepository.save(oldObj);
	}

	public void delete(Integer idAdocao) {
		Adocao obj = findById(idAdocao);
		adocaoRepository.deleteById(idAdocao);
	}
	
	private Adocao newAdocao(AdocaoDTO obj) {
		Animal animal = animalService.findById(obj.getAnimal());
		
		Adocao adocao = new Adocao();
		if(obj.getIdAdocao() != null) {
			adocao.setIdAdocao(obj.getIdAdocao());
		}
		
		adocao.setAnimal(animal);
		adocao.setApresentacao(obj.getApresentacao());
		adocao.setDataAdocao(obj.getDataAdocao());

		return adocao;
	}
	
	public Adocao adotar(Integer idAdocao, AdocaoDTO adocao) {
		adocao.setIdAdocao(idAdocao);
		Adocao oldObj = findById(idAdocao);
		oldObj = newAdocao(adocao);
		adocao.setDataAdocao(new Date());
		return adocaoRepository.save(oldObj);
	}

}
