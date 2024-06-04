package com.poo.SpringAula.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poo.SpringAula.model.Usuario;
import com.poo.SpringAula.services.UsuarioService;


@RestController
@RequestMapping("/usuario")
public class UsuarioResource {

    @Autowired
    UsuarioService service;

    @GetMapping
    public List<Usuario> listAllUsuario(){
        return service.listAllUsuarios();
    }

    @GetMapping("/{id}")
    public Usuario findByIdUsuario(@PathVariable Integer id){
        return service.findByIdUsuario(id);
    }

    @PostMapping
    public Usuario cadastra(@RequestBody Usuario u){
        return service.insereUsuario(u);
    }


}
