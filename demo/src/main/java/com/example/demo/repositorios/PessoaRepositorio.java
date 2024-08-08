package com.example.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entidades.PessoaEntidade;

public interface PessoaRepositorio extends JpaRepository<PessoaEntidade, Long>{

	
	
}
