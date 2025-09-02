package com.itb.inf2dm.smartfishingd.controller;

import com.itb.inf2dm.smartfishingd.model.entity.Peixe;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/peixe")
public class ControllerPeixe {

    List<Peixe> peixes = new ArrayList<Peixe>();

    @GetMapping
    public List<Peixe> findall() {
        Peixe p1 = new Peixe();
        p1.setNome("");
        p1.setDescricao("");
        p1.setFoto("");
        p1.setStatusPeixe("");

        peixes.add(p1);
        return peixes;
    }

}
