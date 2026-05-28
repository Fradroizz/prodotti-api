package com.fradroizz.prodotti_api.service;

import com.fradroizz.prodotti_api.model.Prodotto;
import com.fradroizz.prodotti_api.repository.ProdottoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProdottoService {

    private final ProdottoRepository repo;

    public ProdottoService(ProdottoRepository repo) {
        this.repo = repo;
    }

    public List<Prodotto> tutti() { return repo.findAll(); }

    public Prodotto crea(Prodotto p) { return repo.save(p); }

    public Prodotto aggiorna(Long id, Prodotto dati) {
        Prodotto p = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Non trovato: " + id));
        p.setNome(dati.getNome());
        p.setPrezzo(dati.getPrezzo());
        return repo.save(p);
    }

    public void elimina(Long id) { repo.deleteById(id); }
}
