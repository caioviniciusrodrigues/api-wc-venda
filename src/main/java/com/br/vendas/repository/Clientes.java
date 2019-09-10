package com.br.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.vendas.model.Cliente;

@Repository
public interface Clientes extends JpaRepository<Cliente, Long> {

}
