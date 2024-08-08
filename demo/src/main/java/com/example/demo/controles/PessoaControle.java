package com.example.demo.controles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entidades.PessoaEntidade;
import com.example.demo.servicos.PessoaServico;

@RequestMapping("/api")
@RestController
public class PessoaControle 
{
	
	@Autowired
	private PessoaServico pessServ;
	
	@GetMapping
	private List<PessoaEntidade> findAll() {
		return pessServ.findAll();
	}
	
	@PostMapping
	public PessoaEntidade Criar(@RequestBody PessoaEntidade p ) {
		return pessServ.Criar(p);
	}
	
	
}
