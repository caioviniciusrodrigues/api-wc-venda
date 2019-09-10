package com.br.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.vendas.model.Produto;

@Repository
public interface Produtos  extends JpaRepository<Produto, Long>{

}
