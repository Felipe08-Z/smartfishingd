package com.itb.inf2dm.smartfishingd.controller;

import com.itb.inf2dm.smartfishingd.model.entity.UsuarioPesqueiro;

import com.itb.inf2dm.smartfishingd.model.services.UsuarioPesqueiroService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/usuarioPesqueiro")
public class ControllerUsuarioPesqueiro {
    @Autowired
    private UsuarioPesqueiroService usuarioPesqueiroService;

    @GetMapping
    public ResponseEntity<List<UsuarioPesqueiro>> findAll() {
        return ResponseEntity.ok(usuarioPesqueiroService.findAll());
    }

    @PostMapping
    public ResponseEntity<UsuarioPesqueiro> salvarUsuarioPesqueiro(@RequestBody UsuarioPesqueiro usuarioPesqueiro) {
        UsuarioPesqueiro novoUsuarioPesqueiro = usuarioPesqueiroService.save(usuarioPesqueiro);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoUsuarioPesqueiro);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> listarUsuarioPesqueiroPorId(@PathVariable String id) {
        try {
            return ResponseEntity.ok(usuarioPesqueiroService.findById(Long.parseLong(id)));
        } catch (NumberFormatException e) {
            return ResponseEntity.badRequest().body(
                    Map.of(
                            "status", 400,
                            "error", "bad request",
                            "message", "o id não é valido" + id
                    )
            );
        } catch (RuntimeException e) {
            return ResponseEntity.status(404).body(
                    Map.of(
                            "status", 400,
                            "error", "badrequest",
                            "message", "o id nao e valido" + id
                    )
            );
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> atualizarUsuarioPesqueiro(@PathVariable String id, @RequestBody UsuarioPesqueiro usuario) {
        try {
            return ResponseEntity.ok(usuarioPesqueiroService.update(Long.parseLong(id), usuario));
        } catch (NumberFormatException e) {
            return ResponseEntity.badRequest().body(
                    Map.of(
                            "status", 400,
                            "error", "Bad Request",
                            "message", "O id informado não é válido: " + id
                    )
            );

        } catch (RuntimeException e) {
            return ResponseEntity.status(404).body(
                    Map.of(
                            "status", 404,
                            "error", "Not Found",
                            "message", "Produto não encontrado com o id: " + id
                    )
            );
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletarProdutoPorId(@PathVariable String id) {
        try {
            usuarioPesqueiroService.delete(Long.parseLong(id));
            return ResponseEntity.ok().body(
                    Map.of(
                            "status", 200,
                            "message", "Produto excluído com sucesso!"
                    ));
        } catch (NumberFormatException e) {
            return ResponseEntity.badRequest().body(
                    Map.of(
                            "status", 400,
                            "error", "Bad Request",
                            "message", "O id informado não é válido: " + id
                    )
            );
        } catch (RuntimeException e) {
            return ResponseEntity.status(404).body(
                    Map.of(
                            "status", 404,
                            "error", "Not Found",
                            "message", "Produto não encontrado com o id: " + id
                    )
            );
        }
    }
}
