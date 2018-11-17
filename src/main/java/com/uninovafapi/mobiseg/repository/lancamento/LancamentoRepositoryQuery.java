package com.uninovafapi.mobiseg.repository.lancamento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.uninovafapi.mobiseg.model.Lancamento;
import com.uninovafapi.mobiseg.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {

	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
	
}