package com.uninovafapi.mobiseg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uninovafapi.mobiseg.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
