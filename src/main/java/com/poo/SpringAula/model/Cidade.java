package com.poo.SpringAula.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String nome;

    @Column
    private String Uf;

    public Cidade(int id, String nome, String Uf) {
        this.id = id;
        this.nome = nome;
        this.Uf = Uf;
    }

    public Cidade(){

    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getUf() {
        return Uf;
    }
    public void setUf(String Uf) {
        this.Uf = Uf;
    }

    @Override
    public String toString() {
        return
             getId() +
            ", " + getNome() +
            ", " + getUf();
    }    
}
