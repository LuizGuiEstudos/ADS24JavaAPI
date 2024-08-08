package com.example.demo.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entidades.PessoaEntidade;
import com.example.demo.repositorios.PessoaRepositorio;

@Service
public class PessoaServico {

	@Autowired
	public PessoaRepositorio pessRepo;

	// CRUD
	public List<PessoaEntidade> findAll() {
		return pessRepo.findAll();
	}

	public PessoaEntidade Criar(PessoaEntidade p) {
		return pessRepo.save(p);
	}
}
