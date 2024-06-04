package com.poo.SpringAula.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poo.SpringAula.model.Usuario;
import com.poo.SpringAula.repository.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository repository;


    public Usuario insereUsuario(Usuario u){
        return repository.save(u);
    }

    public Usuario alteraUsuario(Usuario u){
        return repository.save(u);
    }

    public Usuario findByIdUsuario(Integer id){
        return repository.findById(id).orElse(null);
    }

    public void excluiCidade(Usuario u){
        repository.delete(u);
    }

    public List<Usuario> listAllUsuarios(){
        return repository.findAll();
    } 
}
