package com.uninovafapi.mobiseg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uninovafapi.mobiseg.model.Lancamento;
import com.uninovafapi.mobiseg.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}