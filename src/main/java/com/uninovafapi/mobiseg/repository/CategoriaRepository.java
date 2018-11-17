package com.uninovafapi.mobiseg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uninovafapi.mobiseg.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}