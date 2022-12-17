package com.algaworks.crm.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;

@Data       // Annotation de Lombok : elimina a necessidade do codigo boilerplate de hashcode e equals
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)     // IDENTITY: quem incrementa o ID eh o BD
    private Long id;
    @Column(nullable=false)
    private String nome;

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }
}
