package com.fradroizz.prodotti_api.repository;

import com.fradroizz.prodotti_api.model.Prodotto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdottoRepository extends JpaRepository<Prodotto, Long> {
}