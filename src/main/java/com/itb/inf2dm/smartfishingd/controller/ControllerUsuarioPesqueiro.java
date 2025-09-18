package com.itb.inf2dm.smartfishingd.controller;

import com.itb.inf2dm.smartfishingd.model.entity.UsuarioPesqueiro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/usuario")
public class ControllerUsuarioPesqueiro {
    List <UsuarioPesqueiro> usuarioPesqueiros = new ArrayList<>();
    @GetMapping
    public List<UsuarioPesqueiro> findall() {
        UsuarioPesqueiro up1 = new UsuarioPesqueiro();
        up1.setIdPesqueiro("");
        up1.setIdUsuario("");

        usuarioPesqueiros.add(up1);
        return usuarioPesqueiros;
    }
}
