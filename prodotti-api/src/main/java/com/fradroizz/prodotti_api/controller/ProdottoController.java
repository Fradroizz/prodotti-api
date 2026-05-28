package com.fradroizz.prodotti_api.controller;

import com.fradroizz.prodotti_api.model.Prodotto;
import com.fradroizz.prodotti_api.service.ProdottoService;
import jakarta.validation.Valid;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/prodotti")
@CrossOrigin(origins = "*")
public class ProdottoController {

    private final ProdottoService service;

    public ProdottoController(ProdottoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Prodotto> getAll() { return service.tutti(); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Prodotto crea(@Valid @RequestBody Prodotto p) {
        return service.crea(p);
    }

    @PutMapping("/{id}")
    public Prodotto aggiorna(@PathVariable Long id,
                             @Valid @RequestBody Prodotto p) {
        return service.aggiorna(id, p);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void elimina(@PathVariable Long id) {
        service.elimina(id);
    }
}