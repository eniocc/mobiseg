package com.uninovafapi.mobiseg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uninovafapi.mobiseg.model.Lancamento;
import com.uninovafapi.mobiseg.model.Pessoa;
import com.uninovafapi.mobiseg.repository.LancamentoRepository;
import com.uninovafapi.mobiseg.repository.PessoaRepository;

import service.exception.PessoaInexistenteOuInativaException;

@Service
public class LancamentoService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired 
	private LancamentoRepository lancamentoRepository;

	public Lancamento salvar(Lancamento lancamento) {
		Pessoa pessoa = pessoaRepository.findOne(lancamento.getPessoa().getCodigo());
		if (pessoa == null || pessoa.isInativo()) {
			throw new PessoaInexistenteOuInativaException();
		}
		
		return lancamentoRepository.save(lancamento);
	}
	
}