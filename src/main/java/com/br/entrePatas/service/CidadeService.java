package com.br.entrePatas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.entrePatas.model.Cidade;
import com.br.entrePatas.model.UF;
import com.br.entrePatas.model.dtos.CidadeDTO;
import com.br.entrePatas.repository.CidadeRepository;
import com.br.entrePatas.service.exception.ObjectnotFoundException;

@Service
public class CidadeService {
	
	@Autowired
	private CidadeRepository cidadeRepository;
	@Autowired
	private UFService ufService;

	public Cidade findById(Integer idCidade) {
		Optional<Cidade> obj = cidadeRepository.findById(idCidade);
		return obj.orElseThrow(() -> new ObjectnotFoundException("Objeto não encontrado! Id: " + idCidade));
	}

	public List<Cidade> findAll() {
		return cidadeRepository.findAll();
	}

	public Cidade create(CidadeDTO cidade) {
		return cidadeRepository.save(newCidade(cidade));
	}

	public Cidade update(Integer idCidade, CidadeDTO cidade) {
		cidade.setIdCidade(idCidade);
		Cidade oldObj = findById(idCidade);
		oldObj = newCidade(cidade);
		return cidadeRepository.save(oldObj);
	}

	public void delete(Integer idCidade) {
		Cidade obj = findById(idCidade);
		cidadeRepository.deleteById(idCidade);
	}
	
	private Cidade newCidade(CidadeDTO obj) {
		UF uf = ufService.findById(obj.getIdUF());
		
		Cidade cidade = new Cidade();
		if(obj.getIdCidade() != null) {
			cidade.setIdCidade(obj.getIdCidade());
		}
		
		cidade.setIdUF(uf);
		cidade.setCidade(obj.getCidade());
		cidade.setNrIBGE(obj.getNrIBGE());
		cidade.setFlgStatus(obj.getFlgStatus());
		return cidade;
	}

}
