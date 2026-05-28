
package com.fradroizz.prodotti_api.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

    @Entity
    @Table(name = "prodotti")
    public class Prodotto {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @NotBlank
        private String nome;

        @Positive
        private Double prezzo;

        public Prodotto() {}

        public Prodotto(String nome, Double prezzo) {
            this.nome = nome;
            this.prezzo = prezzo;
        }

        public Long getId() { return id; }
        public String getNome() { return nome; }
        public void setNome(String nome) { this.nome = nome; }
        public Double getPrezzo() { return prezzo; }
        public void setPrezzo(Double prezzo) { this.prezzo = prezzo; }
    }

