package com.poo.SpringAula.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poo.SpringAula.model.Cidade;
import com.poo.SpringAula.services.CidadeService;;

@RestController
@RequestMapping("/cidade")
public class CidadeResource {

    @Autowired
    CidadeService service;

    @GetMapping
    public List<Cidade> listAllCidades(){
        return service.listAllCidades();
    }

    @GetMapping("/{id}")
    public Cidade findByIdCidade(@PathVariable Integer id){
        return service.findByIdCidade(id);
    }

    @GetMapping("/nome/{nome}")
    public Cidade findByNomeCidade(@PathVariable String nome){
        return service.findByNomeCidade(nome);
    }

    @PostMapping
    public Cidade cadastra(@RequestBody Cidade c){
        return service.insereCidade(c);
    }
}
