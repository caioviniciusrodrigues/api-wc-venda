package com.br.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.vendas.model.Venda;

@Repository
public interface Vendas extends JpaRepository<Venda, Long> {

}
