package com.br.entrePatas;

import java.util.stream.LongStream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

import com.br.entrePatas.model.Cidade;
import com.br.entrePatas.model.Pais;
import com.br.entrePatas.model.Pessoa;
import com.br.entrePatas.model.PessoaEndereco;
import com.br.entrePatas.model.UF;
import com.br.entrePatas.repository.CidadeRepository;
import com.br.entrePatas.repository.PaisRepository;
import com.br.entrePatas.repository.PessoaEnderecoRepository;
import com.br.entrePatas.repository.PessoaRepository;
import com.br.entrePatas.repository.UFRepository;

@SpringBootApplication
public class EntrePatasApplication {
	
	    public static void main(String[] args) {
	        SpringApplication.run(EntrePatasApplication.class, args);
	    }
	    

}
