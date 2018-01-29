package com.crud.financeiro.repository;

import com.crud.financeiro.model.TipoDePagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TiposDePagamento extends JpaRepository<TipoDePagamento, Long> {
}
