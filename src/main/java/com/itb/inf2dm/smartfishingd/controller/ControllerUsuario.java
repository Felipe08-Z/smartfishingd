package com.itb.inf2dm.smartfishingd.controller;

import com.itb.inf2dm.smartfishingd.model.entity.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/usuario")
public class ControllerUsuario {

    List<Usuario> usuarios = new ArrayList<Usuario>();

    @GetMapping
    public List<Usuario> findall() {

        Usuario u1 = new Usuario();
        u1.setNome("");
        u1.setEmail("");
        u1.setSenha("");
        u1.setNivelAcesso("");
        u1.setFoto("");
        u1.setStatusUsuario("");

        
        usuarios.add(u1);
        return usuarios;
    }
    
    
    



}
