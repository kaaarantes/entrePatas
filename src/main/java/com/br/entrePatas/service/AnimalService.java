package com.br.entrePatas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.entrePatas.model.Animal;
import com.br.entrePatas.model.Especie;
import com.br.entrePatas.model.Raca;
import com.br.entrePatas.model.dtos.AnimalDTO;
import com.br.entrePatas.repository.AnimalRepository;
import com.br.entrePatas.service.exception.ObjectnotFoundException;

@Service
public class AnimalService {

	@Autowired
	private AnimalRepository animalRepository;
	@Autowired
	private RacaService racaService;
	@Autowired
	private EspecieService especieService;

	public Animal findById(Integer idAnimal) {
		Optional<Animal> obj = animalRepository.findById(idAnimal);
		return obj.orElseThrow(() -> new ObjectnotFoundException("Objeto não encontrado! Id: " + idAnimal));
	}

	public List<Animal> findAll() {
		return animalRepository.findAll();
	}

	public Animal create(AnimalDTO animal) {
		return animalRepository.save(newAnimal(animal));
	}

	public Animal update(Integer idAnimal, AnimalDTO animal) {
		animal.setIdAnimal(idAnimal);
		Animal oldObj = findById(idAnimal);
		oldObj = newAnimal(animal);
		return animalRepository.save(oldObj);
	}

	public void delete(Integer idAnimal) {
		Animal obj = findById(idAnimal);
		animalRepository.deleteById(idAnimal);
	}
	
	private Animal newAnimal(AnimalDTO obj) {
		Raca raca = racaService.findById(obj.getRaca());
		Especie especie = especieService.findById(obj.getEspecie());
		
		Animal animal = new Animal();
		if(obj.getIdAnimal() != null) {
			animal.setIdAnimal(obj.getIdAnimal());
		}
		
		animal.setRaca(raca);
		animal.setEspecie(especie);
		animal.setNome(obj.getNome());
		animal.setNascimento(obj.getNascimento());
		animal.setPorte(obj.getPorte());
		animal.setSexo(obj.getSexo());
		animal.setFlgCastrado(obj.getFlgCastrado());
		animal.setFlgVacinado(obj.getFlgVacinado());
		animal.setFlgStatus(obj.getFlgStatus());
		return animal;
	}

}
